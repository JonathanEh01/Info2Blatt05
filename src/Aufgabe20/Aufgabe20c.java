package Aufgabe20;

import java.util.stream.IntStream;
import java.util.Random;

public class Aufgabe20c {

    public static void main(String[] args) {
	/* HINWEIS: Da in der Aufgabenstellung gefordert wird, ein IntStream-Objekt zu erstellen,
	 * wurde der Ansatz gewählt, jeden Manipulationsschritt einzeln an diesem Objekt durch-
	 * zuführen. Alternativ (und vielleicht eleganter) wäre hier möglich gewesen zu coden:
	 * IntStream.generate(() -> {return new Random().nextInt(100);})
	 * 	.limit(10)
	 * 	.sorted()
	 * 	.forEach(System.out::println); */

	// IntStream-Objekt
	IntStream stream = IntStream.generate(() -> {return new Random().nextInt(100);});
	
	// Begrenzung
	stream = stream.limit(10);
	
	// Sortieren
	stream = stream.sorted();
	
	// Ausgabe
	stream.forEach(System.out::println);

    }

}
