
//TWO TYPES OF DATA IN JAVA
/**
 * Primitive type :- stores a value e.g int
 * Non-primitive type/ Reference :- store a reference to a memory, location, higher dynamic object is being installed
 
 THERE ARE 8 PRIMITVE TYPES IN JAVA AND 6 deals with different types of numbers
 1. bytes - small numbers range of -128 to 127
 2. shorts - numbers from -32768 to 32767
 3. int - numbers from -2147483648 to 2147483647 [Any number without a decimal point is an integer]
 4. long - [store numbers larger than int values] numbers from -9223372036854775808 to 9223372036854775807L [To tell the compiler a number is actually long, you must add an L in the end]
 
 NUMBERS WITH DECIMAL POINTS
 5. float - numbers with decimal point, range of 3.4028235E38 to 1.4E-45 [To tell the compiler a number is actually float, you must add an f in the end]
 6. double - numbers with decimal point, range of 1.7976931348623157E308 to 4.9E-324 [To tell the compiler a number is actually double, you must add an d in the end]
 

BOOLEAN DATA TYPES
Which can be true or false

CHARACTER DATA TYPES
Which can be a single character, including letters, digits, and symbols
 */





public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 127;   //
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;

        // Floating-point types
        float floatValue = 3.14159f;
        double doubleValue = 3.141592653589793;

        // Character type
        char charValue = 'A';

        // Boolean type
        boolean booleanValue = true;

        // String (reference type)
        String stringValue = "Hello, World!";

        // Printing values
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("String value: " + stringValue);
    }
}
