import java.util.Scanner;

public class numerodelunoalcien {

    public static void main(String[] args) {

        Scanner meter  = new Scanner(System.in);
        int numero = (int) (100 * Math.random() +1);

        int numeroIntento = 0;

        System.out.println("En este juego tendrás que adivinar el número del 1 al 100 (tienes 5 intentos)");

        for (int i = 4; i >=0; i--) {
            System.out.print("Introduce el número a adivinar: ");
            numeroIntento = meter.nextInt();

            if (numero == numeroIntento) {
                System.out.println("ACERTASTE");
            } else {
                System.out.printf("Error, te quedan %d intentos\n", i);
                if (numeroIntento>numero) {
                    System.out.println("PISTA: El número es menor");
                } else if (numeroIntento<numero) {
                    System.out.println("PISTA: El número es mayor\n");
                } {
                }
            }
        }
        if (numero != numeroIntento) {
        System.out.printf("No lo acertaste, el numero era %d", numero);
        }
        meter.close();
    }
}