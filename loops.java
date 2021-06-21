public class loops {
    public static void main(String args[])  {
        String text = "For-loop";
        //for loops
        System.out.println("=> For loop");
        for (int i = 0; i < 10; i++)  {
            System.out.print(text + " ");
        }

        //for-each loop
        System.out.println("\n=> For each loop");
        int[] ar = {12,10,1,2,4,5,7,1,2,4,14,57,252};
        for (int i: ar)  {
            System.out.print(i + " ");
        }

        //while loop
        System.out.println("\n=> While loop");
        int a = 10;
        while (a >= 0)  {
            System.out.print(a + " ");
            a--;
        }

        //do-while loop
        System.out.println("\n=> Do-while loop");
        int b = 0;
        do {
            System.out.print(b + " ");
            b++;
        }while (b <= 10);
    }
}
