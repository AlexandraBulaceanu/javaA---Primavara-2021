public class EvenNumbersThread implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<=20; i+=2) {
            System.out.println(i);
            try{
                 Thread.sleep(2000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}