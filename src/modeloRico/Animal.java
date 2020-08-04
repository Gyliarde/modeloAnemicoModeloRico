package modeloRico;

public class Animal  {

    public Animal(String cor, String raca) {
        this.cor = cor;
        this.raca = raca;
    }

    protected String cor;
    protected String raca;

    public void andar() {
        System.out.println("AuAu");
    }
}
