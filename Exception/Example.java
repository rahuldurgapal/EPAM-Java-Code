public class Example {

    public static void main(String[] args) {
        int amt =1000,wd=1200;
         try{
        if(amt<wd) {
            throw new ArithmeticException("Insufficinet Balance");
         }
         }catch(NullPointerException e) {
            System.out.println(e.getMessage());
         }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
         }

       
    }
}