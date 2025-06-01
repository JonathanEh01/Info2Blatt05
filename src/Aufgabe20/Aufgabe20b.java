package Aufgabe20;

import java.util.Random;
import java.util.stream.IntStream;

public class Aufgabe20b {

    public static void main(String[] args) {
	/* HINWEIS: Da in der Aufgabenstellung gefordert wird, ein IntStream-Objekt zu erstellen,
	 * wurde der Ansatz gewählt, jeden Manipulationsschritt einzeln an diesem Objekt durch-
	 * zuführen. Alternativ (und vielleicht eleganter) wäre hier möglich gewesen zu coden:
	 * new Random().ints(500)
	 * 	.limit(10)
	 * 	.sorted()
	 * 	.forEach(System.out::println); */

	// IntStream-Objekt
	IntStream stream = new Random().ints(500);
	
	// Begrenzung
	stream = stream.limit(10);
	
	// Sortieren
	stream = stream.sorted();
	
	// Ausgabe
	stream.forEach(System.out::println);
    }

}
