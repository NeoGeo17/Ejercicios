import java.util.Scanner;

public class AdivinaElnumero {

    public static void main(String [] args){
    
	System.out.println("Bienvenido al juego, de adivina  el numero!!!");


	do {
         
	    init();
	}while(true);


    }

    public static void init(){
	String option = null;
	Scanner sc = new Scanner(System.in);

        System.out.println("Escribe \"me\" si quieres que adivine tu numero, en caso contrario presiona ENTER y adivina mi numero secreto:");
        option = sc.nextLine();

	if(option.equals("me")){
            Computer.me();
	}else {
	    Human.man();
	}




    }

}
