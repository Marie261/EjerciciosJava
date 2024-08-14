package Ejercicio4;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		float euro, conversion;
		float pesetas = 166.386f;
		
		System.out.println("Ingrese el valor de euros que desea convertir a pesetas");
		euro = key.nextFloat();
		
		conversion = euro*pesetas;
		
		
		System.out.println(euro +" son equivalentes a:"+ conversion +" pesetas" );
		
		key.close();
	}

}
