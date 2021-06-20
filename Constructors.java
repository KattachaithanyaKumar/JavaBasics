class A {
    A()  {
        System.out.println("A: constructor");
    }
}

class B {
    B(int a)  {
        System.out.println("B: constructor with " + a);
    }
}

class C {
    C(int a, int b)  {
        System.out.println("C: constructor with " + a + " and " + b);
    }
}

class D{
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
