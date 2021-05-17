import java.util.ArrayList;

public class Polinom {
    List<Double> value = new ArrayList<>();
    String name;
    public Polinom(String name){
        this.name=name;
    }
    public Polinom(String name, List<Double> value){
        this.name=name;
        this.value=value;
    }
    public String getName() {
        return name;
    }

    public void setErtek(List<Double> value) {
        this.value=value;

    }
}
