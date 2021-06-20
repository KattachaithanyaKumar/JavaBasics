class Aa {
    //private: this is only available this class
    private int data = 30;
    //public: this is available outside of the class
    public int Pdata = 23;
    //protected: this can be accessed by the class of the same package
    protected String name = "luffy";
    //default: this is accessible within the package only

    private void msg()  {
        System.out.println("Hello");
    }
    public void Pmsg()  {
        System.out.println("Public: Hello!");
    }
}

public class AccessModifiers {
       public static void main(String args[])  {
            Aa a = new Aa();
            /*This will give a compile time error
            System.out.println(a.data);
            a.msg();
            * */
           System.out.println(a.Pdata);
           a.Pmsg();
           System.out.println(a.name);
       }
}
