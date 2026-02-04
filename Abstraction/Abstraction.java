abstract class Person {
    int id;
    String name;
    String email;

    abstract void fun();
}

class Student extends Person {
    int marks;
    void fun() {
        id=121;
        name = "amit";
        email = "amit@gmail.com";
        marks = 76;
        System.out.println("Student Details: ");
        System.out.println("Student Id: " +id);
          System.out.println("Student Name: " +name);
          System.out.println("Student Email: " +email);
        System.out.println("Student Marks: " +marks);
        System.out.println();
    }

}

 class Employee extends Person {
    int salary;
        void fun() {
        id=1781;
        name = "aman";
        email = "aman@gmail.com";
        salary = 20000;
        System.out.println("Employee Details: ");
        System.out.println("Employee Id: " +id);
          System.out.println("Employee Name: " +name);
          System.out.println("Employee Email: " +email);
        System.out.println("Employee Salary: " +salary);
        
    }
} 

public class Abstraction {
    public static void main(String [] af) {
         Person p = new Student();
         Studnet s  = new Student();
         
        p.fun();
        Person p1 = new Employee();
        p1.fun();
        

    }
}