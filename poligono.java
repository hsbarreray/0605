public abstract class Poligono {

    // Encapsulamiento
    protected int numeroLados;

    // Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Getter
    public int getNumeroLados() {
        return numeroLados;
    }

    // Método abstracto
    public abstract double area();

    // Método abstracto
    public abstract void mostrarDatos();
}