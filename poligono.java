package polimorfismo;

public abstract class Poligono {

    protected String nombre;

    public Poligono(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract void mostrarDatos();
}