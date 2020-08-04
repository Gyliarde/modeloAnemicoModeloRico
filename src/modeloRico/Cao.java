package modeloRico;


public class Cao  extends Animal {

    public Cao(String cor, String raca) {
        super(cor, raca);
    }

    public void latir() {
        System.out.println("AuAu");
    }

    public void morderSandalia() {
        System.out.println("Cao mordendo ...");
    }
}
