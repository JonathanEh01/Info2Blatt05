package Aufgabe19;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Aufgabe19b {

    public static void main(String[] args) {
	
	// Leeres ArrayList-Objekt
	ArrayList<String> myList = new ArrayList<String>();
	
	// Auffüllen
	for (String a : args) {
	    myList.add(a);
	}
	myList.add("Rezept Käsekuchen");
	
	// Ausgabe
	System.out.println(myList.toString());
	
	// ASCII-UnaryOperator
	UnaryOperator<String> makeAsciiSafe = (String s) -> {return s.replaceAll("[^\\p{ASCII}]", "");};
	
	// Ausführen von "makeAsciiSafe"
	myList.replaceAll(makeAsciiSafe);
	
	// Suffix ".txt"
	myList.replaceAll((String s) -> {return s.concat(".txt");});
	
	// Ausgabe mit Objektmethode
	myList.forEach(System.out::println);
	
    }

}
