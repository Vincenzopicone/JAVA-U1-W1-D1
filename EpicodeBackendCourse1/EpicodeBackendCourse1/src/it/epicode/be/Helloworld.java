package it.epicode.be;
import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		System.out.println("This is my first Epicode Java Project!");
		System.out.println("Esercizio 2.1: " +  prodotto(6, 5));
		System.out.println("Esercizio 2.2: " +  concatena("Batti il ", 5));		
		
		String arrayStringhe [] = {"Ciao", "mi", "chiamo", "Vincenzo", "Picone"};
		System.out.println("Esercizio 2.3.1: " + Arrays.toString(arrayStringhe));
		System.out.println("Esercizio 2.3.2: " + (Arrays.toString(newArray(arrayStringhe, "nuova stringa"))));		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Prima stringa EX 3:");
		String stringa1 = in.nextLine();
		System.out.println("Seconda stringa EX 3:");
		String stringa2 = in.nextLine();
		System.out.println("Terza stringa EX 3:");
		String stringa3 = in.nextLine();
		
		String stringhe[] = {stringa1, stringa2, stringa3};
		System.out.println("Esercizio 3:" + Arrays.toString(stringhe));
		
		for(int i = 0; i < stringhe.length; i++) {
			System.out.println("Esercizio 3.1" + stringhe[i]);
		};

		for(int i = stringhe.length - 1; i >= 0; i--) {
			System.out.println("Esercizio 3.2" + stringhe[i]);
		};
		
		
		System.out.println("Esercizio 4.1: "+ perimetroRettangolo(6, 5));
		System.out.println(pariDispari(7));
		System.out.println(perimetroTriangolo(3,52, 4));
		
		};
		

public static int prodotto (int x, int  y) 
{
	return x * y;
};

public static String concatena (String S, int n) 
{
	
	return (String) S + n ;
};

public static String[] newArray (String[] a, String b) {
	String arrayStringhe2 []= {a[0], a[1], b, a[2], a[3], a[4]};
	return arrayStringhe2;	
};

public static int perimetroRettangolo (int a, int b) {
	return (a*2)+(b*2);
};

public static int pariDispari (int x) {
	if (x % 2 == 0) {return 0;} else {return 1;}
};

public static int perimetroTriangolo (int latoA, int latoB, int latoC) {
	return latoA + latoB + latoC; 
	}
}



