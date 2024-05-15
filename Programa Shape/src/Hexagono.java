public class Hexagono extends Shape {
    private double lado;

    public Hexagono(double lado, String nome) {
        super(nome);
        this.lado = lado;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * lado;
    }
}