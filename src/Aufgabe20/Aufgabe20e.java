package Aufgabe20;

import java.util.stream.IntStream;

public class Aufgabe20e {

    public static void main(String[] args) {
	
	int sum = IntStream.iterate(1, i -> i + 2)
		.limit(10)
		.sum();
	System.out.println("Summe der ersten 10 ungeraden, ganzen Zahlen: " + sum + "");
	
    }

}
