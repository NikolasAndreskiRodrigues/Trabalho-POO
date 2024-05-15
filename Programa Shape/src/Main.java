public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10, "Retangulo");
        System.out.println("Nome: " + retangulo.getNome());
        System.out.println("Área: " + retangulo.calculateArea());
        System.out.println("Perímetro: " + retangulo.calculatePerimeter());

        Circulo circulo = new Circulo(5, "Circulo");
        System.out.println("Nome: " + circulo.getNome());
        System.out.println("Área: " + circulo.calculateArea());
        System.out.println("Perímetro: " + circulo.calculatePerimeter());

        Losango losango = new Losango(6, 8, "Losango");
        System.out.println("Nome: " + losango.getNome());
        System.out.println("Área: " + losango.calculateArea());
        System.out.println("Perímetro: " + losango.calculatePerimeter());

        Hexagono hexagono = new Hexagono(5, "Hexagono");
        System.out.println("Nome: " + hexagono.getNome());
        System.out.println("Área: " + hexagono.calculateArea());
        System.out.println("Perímetro: " + hexagono.calculatePerimeter());

        pentagono pentagono = new pentagono(5, "Pentagono");
        System.out.println("Nome: " + pentagono.getNome());
        System.out.println("Área: " + pentagono.calculateArea());
        System.out.println("Perímetro: " + pentagono.calculatePerimeter());
    }
}

