public class Strings {
    public static void main(String args[])  {
        char[] charArr = {'h','e','l','l','o'};
        String helloChar = new String (charArr);
        System.out.println("\n->String using a char: " + helloChar);

        String helloStr = "Hello World";
        System.out.println("\n->String: " + helloChar);

        //length of the string
        int length = helloStr.length();
        System.out.println("\n->Length of the string: " + helloStr);

        //Concatenating strings
        String str1 = "my name is ";
        String str2 = "bob";
        System.out.println("\n->concatenating string: " + str1 + str2);

        //more soon
    }
}
