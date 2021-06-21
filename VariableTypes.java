public class VariableTypes {
    public static void main(String args[])  {
        int a, b;
        int x = 10, y = 20;
        byte by = 22;
        double d = 3.14159;
        char c = 'c';
        boolean bool = true;
        String s = "Hello";
        short sh = 10000;
        long lo = 30000;

        a = 50;
        b = 40;
        System.out.println("int a: " + a + " b: " + b);
        System.out.println("int x: " + x + " y: " + y);
        System.out.println("short: " + sh);
        System.out.println("long: " + lo);
        System.out.println("Byte: " + by);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("String: " + s);
        System.out.println("boolean: " + bool);
        bool = false;
        System.out.println("boolean: " + bool);
    }
}
