package org.tnsif.capgemini.c2tc.Scannerclass;

import java.util.Scanner;

public class charReading {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a string");
			char c=scan.next().charAt(3);
			System.out.println("the fourth character of the input string " + c);
		}

	}

}
