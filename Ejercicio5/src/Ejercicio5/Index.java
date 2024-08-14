package Ejercicio5;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		float pesetas , euro ;
		
		//float pesetas, conversion;
		//float euro = 0.006010121f;
		
		//System.out.println("Ingrese el valor de pesetas que desea convertir a euros");
		//pesetas = key.nextFloat();
		
		System.out.println("Ingrese el valor de pesetas que desea convertir a euros");
		//conversion = pesetas*euro;
		pesetas = key.nextFloat();
		
		euro = pesetas/166.386f;
		//System.out.println(pesetas +" son equivalentes a:"+ conversion +" euros" );
		
		System.out.println(pesetas + "son equivalentes a: " + euro + "euros");
		
		key.close();

	}

}
