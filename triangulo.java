package polimorfismo;

public class Triangulo extends Poligono {

    private double base, altura;

    public Triangulo(double base, double altura) {

        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Tipo: " + nombre);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("------------------");
    }
}