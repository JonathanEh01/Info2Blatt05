package Aufgabe20;

import java.util.stream.IntStream;

public class Aufgabe20f {

    public static void main(String[] args) {
	
	int fac = IntStream.rangeClosed(1, 10)
		.reduce(1, (a, b) -> (a * b));
	System.out.println("10! = " + fac + "");
	
    }

}
