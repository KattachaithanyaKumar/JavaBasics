import java.io.*;

public class calculator  {
    public static void main(String args[]) throws IOException  {
        int num1, num2;
        int choice;
        int c = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Calculator: ");
        while (c == 1)  {
            System.out.print("Enter the first number: ");
            num1 = Integer.parseInt(br.readLine());
            System.out.print("Enter the second number: ");
            num2 = Integer.parseInt(br.readLine());

            System.out.println("Operation to be done: ");
            System.out.println("1.Addition\n2.Subtraction" +
                    "\n3.Multiplication\n4.Division");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            System.out.print("(Answer)");
            switch (choice)  {
                case 1:
                    System.out.println("Addition: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Division: " + (num1 / num2));
                    break;

                default:
                    System.out.println("Enter a valid option");
                    break;
            }
            System.out.print("if you want to continue press 1 else 0: ");
            c = Integer.parseInt(br.readLine());
        }
    }
}
