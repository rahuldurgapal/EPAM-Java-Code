// class FileResource {

//     FileResource() {
//         System.out.println("File is open and working");
//     }

//     @Override
//     protected void finalize() {
//         System.out.println("File closed by finalize method");
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         FileResource fr = new FileResource();
//         fr=null;
//         System.gc();

//     }
// }

class User {
    int id =101;
    String name = "ramesh";
    int age = 34;

    @Override
    public String toString() {
        // return "User Id: " +id 
        //        + " User Name: " +name
        //        + " User Age: " +age;

        return "This is to String method of User Class";
    }

    
}

public class Main {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u);
    }
}