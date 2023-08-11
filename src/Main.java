public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Círculo 1", 5);
        System.out.println(circulo.nombre + ": Área = " + circulo.calcularArea() + ", Perímetro = " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo("Rectángulo 1", 4, 6);
        System.out.println(rectangulo.nombre + ": Área = " + rectangulo.calcularArea() + ", Perímetro = " + rectangulo.calcularPerimetro());
    }
}
