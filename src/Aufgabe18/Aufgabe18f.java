package Aufgabe18;

import java.util.Iterator;
import java.util.Random;
import java.util.HashSet;

public class Aufgabe18f {
    
    public static void main(String[] args) {
	
	// Zufallszahl
	Random rand = new Random();
	int n = 1 + rand.nextInt(100);
	
	// HashSet
	HashSet<Integer> set = new HashSet<Integer>();
	for (int i = 0; (i < n); ++i) {
	    set.add(Integer.valueOf(1 + rand.nextInt(1000)));
	}
	
	// Mittleres ELement
	if ((set.size() % 2) != 0) {
	    System.out.println("Die Anzahl der Elemente ist ungerade");
	} else {
	    System.out.println("Die Anzahl der Elemente ist gerade");
	}
	
	// 500
	if (set.contains(500)) {
	    System.out.println("500 vorhanden");
	} else {
	    System.out.println("500 nicht vorhanden");
	}
	
	// Maximum
	Iterator<Integer> iter = set.iterator();
	Integer max = iter.next();
	while (iter.hasNext()) {
	    Integer i = iter.next();	    
	    if (i > max) {
		max = i;
	    }
	}
	System.out.println(max);
	
    }

}
