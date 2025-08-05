package OOPS;

public class TC {


    public static void main(String[] args) {
        byte b = 10;

        // Implicit type conversions (widening)
        short s = b;       // byte to short
        int i = s;         // short to int
        long l = i;        // int to long
        float f = l;       // long to float
        double d = f;      // float to double

        char ch = 'A';
        int num = ch;      // char to int

        
        System.out.println("double: " + d);
        System.out.println("char to int: " + num); 
    }
}