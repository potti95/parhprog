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
    public static void main(String[] args) throws Exception {
         CalculatorLexer lex = new CalculatorLexer(CharStreams.fromFileName(args[0]));
         CommonTokenStream tokens = new CommonTokenStream (lex);
         CalculatorParser parser = new CalculatorParser(tokens);
         parser.start();
    }
}

start
    : (sor LF)*
    ;

sor
    :   deklaracio ENDL
    |   ertekadas ENDL
    |   szamolas ENDL
    ;

deklaracio
    : POLYNOM ID (OPLST ID)?
    | NUMBER ID
    ;
ertekadas
    : ID OPASSIGN SZAM (OPADD SZAM)*
    | ID OPASSIGN polinom
    | ID OPASSIGN X OPADD ID
    ;
polinom
    : (polinomtag OPADD)* polinomtag
    ;
polinomtag
    : SZAM? X (OPPWR SZAM)?
    | SZAM
    ;
szamolas
    : SHOW LPAR polinommuvelet polinomxertekadas RPAR       //(p_1 * p_2)[3]  --> polinommuvelet.id1.getval, polinommuvelet.id2.getval, polinommuvelet.(OPMUl or OPPADD).gettext, polinommuvelet.polinomertekadas.szam --> osszeadas(ertekadas(polinommuvelet.id1.getval,polinommuvelet.polinomertekadas.szam),ertekadas(polinommuvelet.id2.getval,polinommuvelet.polinomertekadas.szam))
    | SHOW polinommuvelet                                   //(p_1 * p_2[2])  --> polinommuvelet.id1.getval, polinommuvelet.polinomertekadas.id.getval, polinommuvelet.(opmul or opadd), ertekadas(polinommuvelet.polinomertekadas.id,polinommuvelet.polinomertekadas.szam) -->> osszeadas(polinommuvelet.id1.getval,ertekadas(polinommuvelet.polinomertekadas.id.getval,polinommuvelet.polinomertekadas.szam))
    | SHOW LPAR LPAR polinommuvelet RPAR LBRACKET polinomxertekadas RBRACKET RPAR  //(((x^2 + 2x + 1) / (1x^1 + 1))[p_1[2]]) --> polinommuvelet.polinom1, polinommuvelet.polinom2,  polinommuvelet.(opmul or opadd), ertekadas(polinommuvelet.polinomertekadas.id,polinommuvelet.polinomertekadas.szam) --> osszeadas(ertekadas(polinom1,ertekadas),ertekadas(polinom2,ertekadas))
    ;
polinommuvelet
    :   LPAR ID OPMUL ID RPAR
    |   LPAR ID OPADD ID RPAR
    |   LPAR ID OPMUL polinomxertekadas RPAR
    |   LPAR ID OPADD polinomxertekadas RPAR
    |   LPAR polinom RPAR OPMUL LPAR polinom RPAR
    |   LPAR polinom RPAR OPADD LPAR polinom RPAR
    ;
polinomxertekadas
    : LBRACKET SZAM RBRACKET
    | ID LBRACKET SZAM RBRACKET
    ;







