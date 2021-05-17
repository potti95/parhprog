package ast;

import java.util.*;

public class Program {
    private List<Polinom> polinom = new ArrayList<Polinom>();
    private List<Number> valtozo = new ArrayList<Number>();

    private List<Line> lines = new ArrayList<Line>();  //sorok listája
    public void addLine(Line l) {
        lines.add(l);
    }
    public void evaluate() {                            //kiertekelés fv soronként a listában
        for (Line l: lines) {
            l.evaluate();
        }
    }
    public void addPolinom(Polinom p) {
        polinom.add(p);
    }
    public void setPolinomValue(String name, Double ertek[]) {
        polinom.stream().filter(p-> p.getName().equals(name)).map(p-> p.setErtek(ertek)) ;
    }
    public void addNumber(Number n) {
        Number.add(n);
    }
    public void setNumberValue(String name, Double ertek) {
        valtozo.stream().filter(n-> n.getName().equals(name)).map(n-> n.setErtek(ertek)) ;
    }
    public void getNumberValue(String name) {
      return valtozo.stream().filter(n-> n.getName().equals(name)).map(n -> n.getErtek(name)) ;
    }
}