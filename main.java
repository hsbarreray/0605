import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Polimorfismo
        ArrayList<Poligono> poligonos = new ArrayList<>();

        System.out.print("¿Cuántos polígonos desea ingresar?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            if (opcion == 1) {

                System.out.print("Ingrese lado 1: ");
                double lado1 = sc.nextDouble();

                System.out.print("Ingrese lado 2: ");
                double lado2 = sc.nextDouble();

                Rectangulo r = new Rectangulo(lado1, lado2);

                poligonos.add(r);

            } else if (opcion == 2) {

                System.out.print("Ingrese lado 1: ");
                double lado1 = sc.nextDouble();

                System.out.print("Ingrese lado 2: ");
                double lado2 = sc.nextDouble();

                System.out.print("Ingrese lado 3: ");
                double lado3 = sc.nextDouble();

                Triangulo t = new Triangulo(lado1, lado2, lado3);

                poligonos.add(t);

            } else {

                System.out.println("Opción inválida");
            }
        }

        System.out.println("\n===== RESULTADOS =====");

        // Polimorfismo
        for (Poligono p : poligonos) {
            p.mostrarDatos();
        }

        sc.close();
    }
}