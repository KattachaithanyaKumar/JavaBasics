import java.io.*;
import java.util.Scanner;

public class InputAndOutput  {
    public static void main(String args[]) throws IOException {
        //output
        System.out.println("Output functions: ");
        //print function is used do print on the same line
        System.out.print("Print on the same line.");
        System.out.print("next line using the print function.");
        //println function is used to print on the next line
        System.out.println("\nprint on the next line.");
        System.out.println("next line using println function.");

        //input method 1
        System.out.println("\ninput functions: ");
        //bufferedReader is used to take input from the keyboard
        System.out.println("Using BufferedReader: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //integer
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(br.readLine());
        System.out.println("Number entered: " + number);
        //string
        System.out.print("Enter a name: ");
        String name = br.readLine();
        System.out.println("Name entered: " + name);

        //input method 2
        System.out.println("Using Scanner class: ");
        //scanner class is used to get user input and is found in java.util package
        Scanner sc = new Scanner(System.in);
        //integer
        System.out.print("Enter a number: ");
        int number2 = sc.nextInt();
        System.out.println("Number entered: " + number2);
        //string
        System.out.print("Enter a name: ");
        Scanner s = new Scanner(System.in);
        String name2 = s.nextLine();
        System.out.println("Name entered: " + name2);
    }
}
