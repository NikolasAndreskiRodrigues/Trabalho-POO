public class pentagono extends Shape {
    private double side;

    public pentagono(double side, String nome) {
        super(nome);
        this.side = side;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public double calculateArea() {
        return (5 * side * side * Math.tan(Math.toRadians(54))) / 4;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * side;
    }
}
