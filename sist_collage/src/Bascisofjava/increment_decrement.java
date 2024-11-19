package Bascisofjava;

public class increment_decrement {

	public static void main(String[] args) {
		int x=5;
		int y=10;
        // Post increment: x is used first, then incremented
        
        System.out.println("x++ = " + x++); // 5 (x is incremented after this line)
        System.out.println("x after post increment = " + x); // 6

        // Pre increment: x is incremented first, then used
        
        System.out.println("++x = " + ++x); // 7 (x is incremented before this line)
        System.out.println("x after pre increment = " + x); // 7

        // Post decrement: y is used first, then decremented
       
        System.out.println("y-- = " + y--); // 10 (y is decremented after this line)
        System.out.println("y after post decrement = " + y); // 9

        // Pre decrement: y is decremented first, then used
        
        System.out.println("--y = " + --y); // 8 (y is decremented before this line)
        System.out.println("y after pre decrement = " + y); // 8

	}

}
