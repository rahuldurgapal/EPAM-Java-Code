public class Example {

    public static void main(String[] args) {

        int bal = 1000;
        int wd = 200;
        try{
        if(wd > bal) 
          throw new ArithmeticException("Withdraw Amount is bigger than curent ammount");
          System.out.println("Transaction Successfull");
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("program end");
    }
}