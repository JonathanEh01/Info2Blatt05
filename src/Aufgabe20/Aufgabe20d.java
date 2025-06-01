package Aufgabe20;

import java.util.Random;
import java.util.stream.IntStream;

public class Aufgabe20d {

    public static void main(String[] args) {

	// Zufallszahl
	Random rand = new Random();
	int n = 1 + rand.nextInt(10000);
	System.out.println("Zufallszahl n = " + n + "");
	
	// Anzahl der echten Teiler (exklusive der trivialen Teiler 1 und n selbst)
	long count = IntStream.range(2, n)
		.filter(i -> (n % i) == 0)
		.count();
	
	// Ausgabe
	System.out.println("Anzahl echte Teiler (exklusive der trivialen Teiler 1 und n selbst): " + count + "");
	
    }

}
