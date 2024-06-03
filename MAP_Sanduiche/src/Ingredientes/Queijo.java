package Ingredientes;

public class Queijo {
    private QueijoEnum queijo;

    public Queijo(QueijoEnum queijo) {
        this.queijo = queijo;
    }

    public QueijoEnum getQueijo() {
        return queijo;
    }

    public void setQueijo(QueijoEnum queijo) {
        this.queijo = queijo;
    }
}
