public class relationalOperators {
    public static void main(String args[])  {
        int a = 30;
        int b = 30;
        int c = 40;

        //equal-to operator
        if (a == b)  {
            System.out.println("a is equal to b");
        }

        //not-equal-to operator
        if (a != c)  {
            System.out.println("a is not equal to c");
        }

        //greater-than operator
        if (c > a)  {
            System.out.println("c is greater than a");
        }

        //less-than operator
        if (a < c)  {
            System.out.println("a is less than c");
        }

        //greater-than or equal-to operator
        if (c >= a)  {
            System.out.println("c is greater-than or equal-to a");
        }

        //less-than or equal-to operator
        if (a <= c)  {
            System.out.println("a is less-than or equal to c");
        }
    }
}
