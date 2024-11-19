package Bascisofjava;

public class Bitwise_operator {

	public static void main(String[] args) {
		int a = 5;  // In binary: 0000 0101
        int b = 3;  // In binary: 0000 0011

        // AND (&) - Bitwise AND operator
        System.out.println("a & b = " + (a & b));  // 0000 0001 (1 in decimal)

        // OR (|) - Bitwise OR operator
        System.out.println("a | b = " + (a | b));  // 0000 0111 (7 in decimal)

        // XOR (^) - Bitwise XOR operator
        System.out.println("a ^ b = " + (a ^ b));  // 0000 0110 (6 in decimal)

        // Complement (~) - Bitwise NOT operator
        System.out.println("~a = " + (~a));  // Inverts all bits of a, -6 in decimal (in two's complement)

        // Left Shift (<<) - Shifts bits to the left
        System.out.println("a << 1 = " + (a << 1));  // 0000 1010 (10 in decimal)

        // Right Shift (>>) - Shifts bits to the right (arithmetic shift)
        System.out.println("a >> 1 = " + (a >> 1));  // 0000 0010 (2 in decimal)

        
	}

}
