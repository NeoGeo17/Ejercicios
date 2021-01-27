import java.util.Scanner;

public class Computer {

    private static Scanner sc = new Scanner(System.in);

    public static void me() {

        //Rango de numeros
        int min = 1;
        int max = 100;

        String response = "";

        System.out.println("Ingresa (+) si es mayor, (-) si es menor, (=) si es el numero:");

        while (true) {
            //Punto medio de partida
            int computer = (max + min) / 2;
            System.out.print("Es el " + computer + " tu numero secreto? ");
            response = sc.nextLine();

            if (response.equals("=")) {

                System.out.println("*** I win!!!. ***");
                break;
            }
            if (response.equals("+")) {

                min = computer + 1;
            }
            if (response.equals("-")) {

                max = computer - 1;
            }
        }
    }
}
