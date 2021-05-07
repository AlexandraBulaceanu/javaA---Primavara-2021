/**
 * DB1 - MIN 2 SEC
 * DB2 - MIN 3 SEC
 */
public class ExJoin {
    public static void main(String [] args) {
        long tStart = System.currentTimeMillis();
        /*collectDataFromDB1();
        collectDataFromDB2();*/
        Thread t1 = new Thread(() -> collectDataFromDB1());
        Thread t2 = new Thread(() -> collectDataFromDB2());
        t1.start();
        t2.start();
        try{
            t1.join(); // main = firul principal va astepta sa se incheie excutia lui t1
            t2.join(); // main = firul principal va astepta sa se incheie excutia lui t2
            //colectarea se realizeaza in paralel( pe firele t1, t2)
            //procesarea info se face pe main, dupra terminarea colectarii din ambele surse
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        long tEnd = System.currentTimeMillis();
        System.out.println(tEnd - tStart);// durata executiei celor doua metode
    }
    public static void collectDataFromDB1() {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void collectDataFromDB2() {
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}