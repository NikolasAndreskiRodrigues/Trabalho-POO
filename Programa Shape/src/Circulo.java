public class Circulo extends Shape {
    private final double raio;

    public Circulo(double raio, String nome) {
        super(nome);
        this.raio = raio;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public double calculateArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * raio;
    }
}