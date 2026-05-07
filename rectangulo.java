public class Rectangulo extends Poligono {

    // Encapsulamiento
    private double lado1;
    private double lado2;

    // Constructor
    public Rectangulo(double lado1, double lado2) {
        super(4);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    // Polimorfismo
    @Override
    public double area() {
        return lado1 * lado2;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("----- RECTÁNGULO -----");
        System.out.println("Número de lados: " + numeroLados);
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Área: " + area());
        System.out.println("----------------------");
    }
}