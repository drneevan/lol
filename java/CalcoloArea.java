package myPackage;
	
import java.util.Scanner;

public class CalcoloArea {

	public static void main(String args[]) {   
			      
		Scanner readInput = new Scanner(System.in);
		
		int base = 0;
		int altezza = 0;

		System.out.println("Scrivi la base del triangolo:");
		base = s.nextInt();
     
		System.out.println("Scrivi l'altezza del triangolo:");
        altezza = s.nextInt();
        s.close();
 
        Triangle myTriangle = new Triangle(base, altezza);
      	System.out.println("L'area è " + myTriangle.area);
	}
}