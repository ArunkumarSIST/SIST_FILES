package org.tnsif.capgemini.c2tc.Scannerclass;

import java.util.Scanner;

public class AdvanceScanner {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter some data(you can enter number or text");
			while(scan.hasNext())
			if(scan.hasNextInt())
				{
					int intvalue=scan.nextInt();
					System.out.println("read an integer "+ intvalue);
				}
			else if (scan.hasNextDouble())
			{
				double doublevalue=scan.nextDouble();
				System.out.println("read an double "+doublevalue);
			}
			else
			{
				String stringvalue=scan.next();
				System.out.println("unknow input " +stringvalue);
			}
		}

	}


}
