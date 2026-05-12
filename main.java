package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Poligono> poligonos = new ArrayList<>();

        System.out.print("¿Cuántos polígonos desea ingresar?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            System.out.print("Ingrese la base: ");
            double base = sc.nextDouble();

            System.out.print("Ingrese la altura: ");
            double altura = sc.nextDouble();

            if (opcion == 1) {
                poligonos.add(new Rectangulo(base, altura));
            } else if (opcion == 2) {
                poligonos.add(new Triangulo(base, altura));
            } else {
                System.out.println("Opción inválida");
            }
        }

        System.out.println("\n===== RESULTADOS =====");

        for (Poligono p : poligonos) {
            p.mostrarDatos();
        }

        sc.close();
    }
}