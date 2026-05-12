package polimorfismo;

public class Rectangulo extends Poligono {

    private double base, altura;

    public Rectangulo(double base, double altura) {

        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Tipo: " + getNombre());
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("------------------");
    }
}