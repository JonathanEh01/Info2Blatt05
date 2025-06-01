package Aufgabe18;

import java.util.Random;
import java.util.ArrayList;

public class Aufgabe18c {

    public static void main(String[] args) {
	
	// Zufallszahl
	Random rand = new Random();
	int n = 1 + rand.nextInt(100);
	
	// ArrayList
	ArrayList<Integer> list = new ArrayList<Integer>();
	for (int i = 0; (i < n); ++i) {
	    list.add(Integer.valueOf(1 + rand.nextInt(1000)));
	}
	
	// Mittleres ELement
	if ((list.size() % 2) != 0) {
	    System.out.println("Mittleres Element: " + list.get(list.size() / 2));
	} else {
	    System.out.println("Die Anzahl der Elemente ist gerade");
	}
	
	// 500
	if (list.contains(500)) {
	    System.out.println(list.indexOf(500));
	} else {
	    System.out.println("500 nicht vorhanden");
	}
	
	
	// Maximum (for)
	Integer max = list.getFirst();
	for (Integer i = 0; (i < list.size()); ++i) {
	    if (list.get(i) > max) {
		max = list.get(i);
	    }
	}
	System.out.println("Maximum: " + max);

    }

}
