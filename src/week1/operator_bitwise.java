package week1;

public class operator_bitwise {
    public static void main(String[] args){

        Integer a=11; // 1011
        Integer b=15; // 1111
        Integer c=2; // 0010
        Integer d=18; // 10010

        // Bitwise NOT => increment the value by one and negation added
        System.out.println("Bitwise NOT");
        System.out.println(~a);  // bitwise NOT
        System.out.println(~b);  // bitwise NOT
        System.out.println(~c);  // bitwise NOT
        System.out.println(~d);  // bitwise NOT

        // Bitwise AND
        System.out.println("Bitwise AND");
        System.out.println(a & b);  // bitwise AND 1011 1111   1011
        System.out.println(a & c);  // bitwise AND 1011 0010   0010

        // Bitwise OR
        System.out.println("Bitwise OR");
        System.out.println(a | b);  // bitwise OR 1011 1111    1111
        System.out.println(a | d);  // bitwise OR 1011 10010   11011

        // Bitwise XOR
        System.out.println("Bitwise XOR");
        System.out.println(a ^ b);  // bitwise XOR  1011  1111    0100
        System.out.println(a ^ d);  // bitwise XOR  1011  10010   11001
        System.out.println(d ^ a);  // bitwise XOR  10010 1011    11001

        // >> Right Shift bitwise operator
        System.out.println("Right >> Shift Operator");
        int number = 19; // Binary representation: 0001 0011
        int result = number >> 2; // Right shift by 2 positions
        // After shifting, the binary representation becomes: 0000 0100
        // Decimal value of the result: 4
        System.out.println(result);

        // >> Right Shift bitwise operator
        number = 255; // Binary representation: 1111 1111
        result = number >> 2; // Right shift by 2 positions
        // After shifting, the binary representation becomes: 0011 1111
        // Decimal value of the result: 63
        System.out.println(result);

        number = -16; // Binary representation: 1111 0000 / -0001 0000
        result = number >> 2; // Right shift by 2 positions
        // After shifting, the binary representation becomes: /-0000 0100
        // Decimal value of the result: -4
        System.out.println(result);

        // >>> Right Shift zero fill bitwise operator
        System.out.println("Right >>> Shift Zero fill Operator");
        number = 255; // Binary representation: 1111 1111
        result = number >>> 2; // Right shift fill zero by 2 positions at left-end
        // After shifting, the binary representation becomes: 0011 1111
        // Decimal value of the result: 4
        System.out.println(result);

        number = -16; // Binary representation: 1111 0000
        result = number >>> 2; // Logical right shift by 2 positions
        // After shifting, the binary representation becomes: 0011 1111 1111 1111 1111 1111 1111 1100
        // Decimal value of the result: 1073741820
        System.out.println(result);

        // << Left Shift bitwise operator
        System.out.println("Left << Shift Operator");
        number = 199; // Binary representation: 1100 0111
        result = number << 2; // Left shift by 2 positions and add zero at right-end
        // After shifting, the binary representation becomes: 11 0001 1100
        // Decimal value of the result: 796
        System.out.println(result);



    }
}
