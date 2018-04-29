import java.util.Scanner;

public class Computer {

    private static Scanner sc =  new Scanner(System.in);

    public static void me(){
        
	//Rango de numeros
	int min = 1;
	int max = 100;

	String answer = "";

	System.out.println("Ingresa (+) si es mayor, (-) si es menor, (=) si es el numero:");

	while(true){
            //Punto medio de partida
	    int computer = (max + min) / 2;

	    System.out.print("Es tu numero el " + computer + "?");
	    answer = sc.nextLine();

	    if(answer.equals("=")){

                System.out.println("*** I win!!!. ***");
		break;
	    }
	    if(answer.equals("+")){

                min =  computer + 1;
	    }
	    if(answer.equals("-")){
                
		max = computer - 1;
	    }
	}
    }

}
