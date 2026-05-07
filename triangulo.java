public class Triangulo extends Poligono {

    // Encapsulamiento
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {

        super(3);

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // Fórmula de Herón
    @Override
    public double area() {

        double s = (lado1 + lado2 + lado3) / 2;

        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public void mostrarDatos() {

        System.out.println("----- TRIÁNGULO -----");
        System.out.println("Número de lados: " + numeroLados);
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Área: " + area());
        System.out.println("---------------------");
    }
}