package ast;

public class Ertekadas extends Polinom {
    private Polinom lhs;
    private ertek rhs;
    public Ertekadas(Polinom lhs, ertek rhs) {
        // lhs polinom egy tömb
        int i = 9;
        double eredmeny=0;
        while (i>0)
        {
            lhs[i] = lhs[i] * rhs
            i--;
        }
        for (int i=0;i<10;i++){
            eredmeny+=lhs[i];
        }

        return eredmeny   //mindig egy szám az értékadás eredménye
    }
}