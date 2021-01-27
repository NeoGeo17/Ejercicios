import java.util.Random;
import java.util.Scanner;

public class Human {

    private static Random rand = new Random(System.nanoTime());
    private static Scanner sc = new Scanner(System.in);

    public static void man() {

        int secretNumber = 0;
        int input = 0;

        //Rango de numeros
        int min = 1;
        int max = 100;

        //Inicialiaciun del numero secreto
        secretNumber = rand.nextInt(100) + 1;

        while (true) {
            System.out.println("Elige un numero del 1 al 100:");

            try {

                input = Integer.parseInt(sc.nextLine());

                if (input > max || input < min) {
                    System.out.println("Estas fuera del rango indicado!!!.");
                }
                if (input == secretNumber) {
                    System.out.println("*** You win!!!. ***");
                    break;
                }
                if (secretNumber > input) {

                    System.out.println("El numero secreto es mas alto.");
                }
                if (secretNumber < input) {

                    System.out.println("El numero secreto es mas bajo.");
                }

            } catch (NumberFormatException ex) {

                System.out.println("Por favor, ingresa un numero entero.");
            }
        }
    }
}
