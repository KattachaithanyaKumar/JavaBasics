//creation of the class
class Dog{
    String breed;
    int age;
    String color;
    String Name;

    public Dog(String name)  {
        //this is the constructor of the class
        //this is going to run when the object is created.
        System.out.println("Dog: Constructor");
        System.out.println("Name of the dog: " + name);
        this.Name = name;
    }

    //methods
    void barking() {
        System.out.println(Name + ": Woof!");
    }
    void hungry()  {
        System.out.println(Name + ": Hungry!");
    }
    void sleeping()  {
        System.out.println(Name + ": Zzzz");
    }
}

public class classAndObject {
   public static void main(String args[])  {
       //creation of the object
       Dog dog = new Dog("Edgar");
       dog.barking();
       dog.hungry();
       dog.sleeping();
   }
}
