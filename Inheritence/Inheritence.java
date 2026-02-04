class Person {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    
    Person(int id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    Person() {

    }
   
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Karan extends Person {
   private int marks;

   public void setMarks(int marks) {
    this.marks = marks;
   }

   public int getMarks() {
    return marks;
   }
}


class Employee extends Person {
  
    private int salary;

    public void setSalary(int salary) {
        this.salary=salary;
    }
    public int getSalary() {
        return salary;
    }
    
}

public class Inheritence {
    public static void main(String [] args) {
        Employee e = new Employee();
        e.setId(121);
        e.setName("karan");
        e.setEmail("karan@gmail.com");
        e.setSalary(20000);

        System.out.println("Employee Id: " +e.getId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee email: " +e.getEmail());
        System.out.println("Employee Salary: " + e.getSalary());
        
    }
}

