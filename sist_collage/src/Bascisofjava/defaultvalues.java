package Bascisofjava;

public class defaultvalues {

    class Demo {
        int i;
        byte b;
        float f;
        double d;
        char c1;
        boolean b1;
        String strValue; // Instance variable
        int[] a; // Array
    }

    public static void main(String[] args) {
        defaultvalues instance = new defaultvalues();
        Demo d1 = instance.new Demo();

        System.out.println("Default values:");
        System.out.println("int: " + d1.i);
        System.out.println("byte: " + d1.b);
        System.out.println("float: " + d1.f);
        System.out.println("double: " + d1.d);
        System.out.println("char: '" + d1.c1 + "'");
        System.out.println("boolean: " + d1.b1);
        System.out.println("String: " + d1.strValue);
        System.out.println("Array: " + d1.a);
    }
}

