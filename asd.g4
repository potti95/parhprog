parser grammar CalculatorParser;

options {
    tokenVocab = CalculatorLexer;
    language = Java;
}

@header {
    import java.util.ArrayList;
    import java.util.List;
}

@members {
    static Map<Double, Double>> polinomhelyiertekek = new HashMap<>();
    public static void main(String[] args) throws Exception {
         CalculatorLexer lex = new CalculatorLexer(CharStreams.fromFileName(args[0]));
         CommonTokenStream tokens = new CommonTokenStream (lex);
         CalculatorParser parser = new CalculatorParser(tokens);
         ast.Program p = new ast.Program();
         parser.start(p);
    }
}
public static double createArray(Map<Double, Double>> polinomhelyiertekek) {
    double tomb = new double[10];                                                                  //letrehozzuk a tombot
    if(!polinomhelyiertekek.isEmpty())                                                              //ha a map nemüres
       {
           for(int i=0; i<10;i++)
           {
                if(polinomhelyiertekek.containsKey(i)){                                            //megnézzük hogy a helyiértékhez létezik e kulcs
                    tomb[i]=polinomhelyiertekek.get(i)                                            // ha létezik az értéket berakjuk a tömbbe
                }   else tomb[i]=0.0;                                                             // else 0
           }
       } else {
         System.out.println("Ures a map");
       }
    return tomb;
}



start [ ast.Program prog]
    : (sor[prog] { $prog.addLine($sor.node); } LF)*
    ;
sor [ast.Program prog] returns [ast.Line node]
    :   deklaracio[prog]  ENDL
    |   ertekadas[prog]  ENDL
    |   szamolas[prog] { $node=$szamolas.node; } ENDL                                       //Számolásból kell fát építeni
    ;
deklaracio [ast.Program prog]
    : POLYNOM id1=ID { ast.Polinom p1 = new Polinom($id1.text); $prog.addPolinom(p1); } (OPLST id2=ID { ast.Polinom p2 = new Polinom($id2.text); $prog.addPolinom(p2); })?
    | NUMBER ID { ast.Number n = new Number($id.text); $prog.addNumber(n);}                                      //      !!!!!!!!!!
    ;
ertekadas [ast.Program prog]
    : ID OPASSIGN tag { $value = $tag.value; } (OPADD tag{ $value = "+".equals($OPADD.text) ? $value + $tag.value : $value - $tag.value;}) *  {
            {$prog.setNumberValue($ID.text, $value )}                                        // number értékadása
     }
    | ID OPASSIGN polinom {$prog.setPolinomValue($ID.text, $polinom.ertek )}                 //    polinom tartalma egy tömb
    | ID OPASSIGN xopnumber  {$prog.setPolinomValue($ID.text, $polinom.ertek )}              // !!!!!!!!!!!!!!  tömböt ad ez is
    ;


szamolas [ast.Program prog] returns [ast.Line node]
    : SHOW LPAR polinommuvelet polinomxertekadas RPAR       //(p_1 * p_2)[3]  --> polinommuvelet.id1.getval, polinommuvelet.id2.getval, polinommuvelet.(OPMUl or OPPADD).gettext, polinommuvelet.polinomertekadas.szam --> osszeadas(ertekadas(polinommuvelet.id1.getval,polinommuvelet.polinomertekadas.szam),ertekadas(polinommuvelet.id2.getval,polinommuvelet.polinomertekadas.szam))
    | SHOW polinommuvelet                                   //(p_1 * p_2[2])  --> polinommuvelet.id1.getval, polinommuvelet.polinomertekadas.id.getval, polinommuvelet.(opmul or opadd), ertekadas(polinommuvelet.polinomertekadas.id,polinommuvelet.polinomertekadas.szam) -->> osszeadas(polinommuvelet.id1.getval,ertekadas(polinommuvelet.polinomertekadas.id.getval,polinommuvelet.polinomertekadas.szam))
    | SHOW LPAR LPAR polinommuvelet RPAR LBRACKET polinomxertekadas RBRACKET RPAR  //(((x^2 + 2x + 1) / (1x^1 + 1))[p_1[2]]) --> polinommuvelet.polinom1, polinommuvelet.polinom2,  polinommuvelet.(opmul or opadd), ertekadas(polinommuvelet.polinomertekadas.id,polinommuvelet.polinomertekadas.szam) --> osszeadas(ertekadas(polinom1,ertekadas),ertekadas(polinom2,ertekadas))
    ;
polinommuvelet returns [ast.Kifejezes node]
    :   LPAR ID OPMUL ID RPAR
    |   LPAR ID OPADD ID RPAR
    |   LPAR ID OPMUL polinomxertekadas RPAR
    |   LPAR ID OPADD polinomxertekadas RPAR
    |   LPAR polinom RPAR OPMUL LPAR polinom RPAR
    |   LPAR polinom RPAR OPADD LPAR polinom RPAR
    ;
polinomxertekadas returns [ast.Kifejezes node]
    : LBRACKET tag RBRACKET
    | ID LBRACKET tag RBRACKET
    ;
polinom returns [ertek]                                                                    //polinom returns polinomtömb
    : { Map<Double, Double>> polinomhelyiertekek = new HashMap<>(); double ertek = new double[10];  } (polinomtag OPADD)* polinomtag {             //letrehozzuk a mapet
        ertek = createArray(polinomhelyiertekek);
    }


    ;
polinomtag [polinomhelyiertekek]                                                                  //megkapja mapet
    :  ertek=tag? X (OPPWR hatvany=tag)? {
            if(ertek.exist())                                                                            //!!!!!!!  ha létezik az érték
                {
                polinomhelyiertekek.put($hatvany, $ertek);                                               //belepakolja a mapbe az értékeket
                }
            else { polinomhelyiertekek.put($hatvany, 1);  }
            }
    | ertek=tag { polinomhelyiertekek.put(0.0, $ertek);}
    ;
tag returns [double value]
    : SZAM {$value=Double.parseDouble($SZAM.text);}
    ;
xopnumber returns [ertek]
    : { Map<Double, Double>> polinomhelyiertekek = new HashMap<>(); } polinomtag OPADD ID {
      double value =  "+".equals($OPADD.text) ? +$prog.getNumberValue($ID) : -$prog.getNumberValue($ID);
      ertek = createArray(polinomhelyiertekek);
      ertek[0]=ertek[0]+value;
    }
    ;






