package Aufgabe19;

import java.util.ArrayList;
import java.util.function.DoubleSupplier;
import java.lang.Math;
import java.util.Random;

public class Aufgabe19a {

    public static void main(String[] args) {

	// Leeres Array-List-Objekt
	ArrayList<Double> myList = new ArrayList<Double>();
	
	// DoubleSupplier mit Methodenreferenz
	DoubleSupplier mySupplier = Math::random;
	
	// Anzahl der Elemente
	Random rand = new Random();
	int n = 1 + rand.nextInt(1000);
	
	// Auffüllen mit Zufallszahlen
	for (int i = 0; (i < n); ++i) {
	    myList.add(mySupplier.getAsDouble());
	    
	    // 1% Chance auf Änderung
	    if (Math.random() < 0.01) {
		mySupplier = () -> 2.0;
	    }
	}
	
	
	// Entfernen kleiner Werte
	myList.removeIf((Double d) -> {return (d < 1.0);});
	
	// Ausgabe
	System.out.println("Insgesamt hinzugefügte Objekte:" + n + "");
	System.out.println("Noch vorhandene Objekte:" + myList.size() + "");
	
    }

}
