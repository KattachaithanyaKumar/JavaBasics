public class arithmeticOperators {
    public static void main(String args[])  {
        int a = 10;
        int b = 20;

        //addition operator
        System.out.println("addition: ");
        System.out.println(a + b);

        //subtraction operator
        System.out.println("subtraction: ");
        System.out.println(a - b);

        //multiplication operator
        System.out.println("multiplication: ");
        System.out.println(a * b);

        //division operator
        System.out.println("division: ");
        System.out.println(b / a);

        //modulus operator
        System.out.println("modulus: ");
        System.out.println(b % a);

        //increment operator
        System.out.println("increment: ");
        System.out.println((a++) + "\n" + (++b));//post-increment and pre-increment

        //reset to original values
        a = 10;
        b = 20;

        //decrement operator
        System.out.println("decrement: ");
        System.out.println((a--) + "\n" + (--b));//post-decrement and pre-decrement
    }
}
