public class Polinom {
    double value[] = new double[];
    String name;
    public Polinom(String name){
        this.name=name;
    }
    public Polinom(String name, Double value[]){
        this.name=name;
        this.value=value;
    }
    public String getName() {
        return name;
    }

    public void setErtek(Double value[]) {
        this.value=value;

    }
}