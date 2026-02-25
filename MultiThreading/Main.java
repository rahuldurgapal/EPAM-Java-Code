class DownloadTask implements Runnable {

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Downloading..... " +i);
            try{
            Thread.sleep(2000);
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class PlayMusic implements Runnable {

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Playing Music.... " +i);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new DownloadTask());
        Thread t2 = new Thread(new PlayMusic());

        t1.start();
        t2.start();
    }
}