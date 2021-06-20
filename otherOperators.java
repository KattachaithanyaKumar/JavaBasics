public class otherOperators {
    public static void main(String args[])  {
        int a = 10;
        int b = 10;

        //logical operator
        //logical and
        if (a == 10 && b == 10)  {
            System.out.println("logical and");
        }

        //logical or
        if (a == 10 || b == 20)  {
            System.out.println("logical or");
        }

        //logical not
        if (a != 20)  {
            System.out.println("logical not");
        }

        //assignment operators
        //simple assignment
        a = 30;
        System.out.println("simple assign: " + a);

        //add and assign operator
        a += b;
        System.out.println("add and assign: " + a);

        //subtract and assign operator
        a -= b;
        System.out.println("subtract and assign: " + a);

        //multiply and assign operator
        a *= b;
        System.out.println("multiply and assign: " + a);

        //divide and assign operator
        a /= b;
        System.out.println("divide and assign: " + a);

        //modulus and assign operator
        b %= a;
        System.out.println("modulus and assign: " + b);

    }
}
