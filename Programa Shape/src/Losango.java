public class Losango extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Losango(double diagonal1, double diagonal2, String nome) {
        super(nome);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * Math.sqrt((diagonal1 * diagonal1 + diagonal2 * diagonal2) / 4);
    }
}
