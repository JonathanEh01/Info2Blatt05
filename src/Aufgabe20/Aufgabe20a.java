package Aufgabe20;

import java.util.Random;
import java.util.ArrayList;

public class Aufgabe20a {

    public static void main(String[] args) {
	
	// Zufallszahl
	Random rand = new Random();
	int n = 1 + rand.nextInt(100);
	
	// Leeres ArrayList-Objekt
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	// Auffüllen
	for (int i = 0; (i < n); ++i) {
	    list.add(Integer.valueOf(1 + rand.nextInt(10000)));
	}
	
	// Filtern
	list.removeIf((Integer i) -> {return ((i % 2) == 0);});
	
	// Ausgabe
	list.forEach((Integer i) -> {if (i > 900) {System.out.println(i);};});

    }

}
