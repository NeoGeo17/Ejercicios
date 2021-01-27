import java.util.Scanner;

public class AdivinaElnumero {

    public static void main(String[] args) {

        System.out.println("### Bienvenido al juego, de adivina  el numero secreto ###");

        do {
            init();
        } while (true);
    }

    public static void init() {
        String response = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Piensa un numero del 1 al 100 y escribe \"me\" si quieres que lo adivine.\nO presiona ENTER y adivina mi numero.\nPara salir, presiona ctrl + c.");
        response = sc.nextLine();

        if (response.equalsIgnoreCase("me")) {
            Computer.me();
        } else {
            Human.man();
        }
    }
}
