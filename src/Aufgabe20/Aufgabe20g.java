package Aufgabe20;

import java.util.Arrays;

public class Aufgabe20g {

    public static void main(String[] args) {
	Arrays.stream(args)
		.map(s -> s.toUpperCase().replaceAll("\\d", ""))
		.filter(s -> !s.isEmpty())
		.forEach(System.out::println);
	
    }

}
