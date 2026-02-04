class A {
     int fun() {
        System.out.println("This is function wihtout parameter");
        return 0;
    }
    
    void fun(int x, int y) {
          System.out.println("This is function overloading example " +x + " " + y);
    }
}

class B extends A{
       int fun() {
        System.out.println("This is function overriding");
        return 1;
    }
    void fun1() {
        System.out.println("This is another function");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
         A a = new B();
         a.fun();
         a.fun(3,4);
        
    }
}
