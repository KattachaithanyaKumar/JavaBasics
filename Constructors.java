class A {
    //this is a normal constructor with no parameters 
    A()  {
        System.out.println("A: constructor");
    }
}

class B {
    //this is a parameterized constructor where we are taking int a when the object is created and we can use that value in the code.
    B(int a)  {
        System.out.println("B: constructor with " + a);
    }
}

class C {
    //similarly this is a parameterized constructor with two parameters, which are taken when the obect is created.
    C(int a, int b)  {
        System.out.println("C: constructor with " + a + " and " + b);
    }
}

class D{
    //similarly this is a parameterized constructor with two different parameters with different data types.
    D(String name, int age)  {
        System.out.println("D: constructor with " + name + " and " + age);
    }
}

public class Constructors {
    public static void main(String args[])  {
        A a = new A();
        B b = new B(10);
        C c = new C(20, 30);
        D d = new D("Roger", 38);
    }
}
