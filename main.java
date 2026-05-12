package polimorfismo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Poligono> poligonos = new ArrayList<>();

        poligonos.add(new Rectangulo(10, 5));
        poligonos.add(new Triangulo(8, 4));
        poligonos.add(new Rectangulo(6, 3));

        System.out.println("===== RESULTADOS =====");

        for (Poligono p : poligonos) {
            p.mostrarDatos();
        }
    }
}