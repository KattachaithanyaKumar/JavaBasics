import java.io.*;

public class exceptions_tryCatch  {
    public  static void main(String args[])   {
        try {
            int a[] = new int[3];
            System.out.println("element four: " + a[4]);
        }catch(ArrayIndexOutOfBoundsException e)  {
            System.out.println("Exception thrown: " + e);
        }
    }
}
