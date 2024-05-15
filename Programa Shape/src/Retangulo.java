public class Retangulo extends Shape {
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB, String nome) {
        super(nome);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public double calculateArea() {
        return ladoA * ladoB;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (ladoA + ladoB);
    }
}