public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Kaue", 12.0, 160);
        Lider lider1 = new Lider("Gabriel", 50.0, 160);
        Gerente gerente1 = new Gerente("Nikolas", 100.0, 160);

        System.out.println("Salário de Kaue: " + funcionario1.calcularSalario());
        System.out.println("Salário de Gabriel (Líder): " + lider1.calcularSalario());
        System.out.println("Salário de Nikolas (Gerente): " + gerente1.calcularSalario());
    }
}