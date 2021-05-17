package ast;

public class Line {
    private boolean assign;
    private Kifejezes expr;
    private Program program;
    public Line(Program p, Kifejezes e, boolean a) {
        this.program = p;
        this.expr = e;
        this.assign = a;
    }
    public void evaluate() {
        double value = 0.0;
        if (this.assign) {
        }
        System.out.println(value);
    }
}