package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {

    private static Scanner sc = new Scanner(System.in);

	private static int pedirNumero() {
	    System.out.print("Introduce un número entero mayor o igual que 0: ");
	    return sc.nextInt();
	}
	
	public static void main(String[] args) {

		int num = pedirNumero();

        if (num < 0) {
            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
        }

        sc.close();
	}

}