class FileResource {

    FileResource() {
        System.out.println("File is Open");
    }  

    protected void finalize() {
          
          System.out.println("File closed");
    }
}

public class Main {
    public static void main(String[] args) {
        FileResource fr = new FileResource();
        fr=null;
        System.gc();
    }
}