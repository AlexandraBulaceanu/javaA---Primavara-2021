public class ExThreads {
    public static void main(String [] args) {
        OddNumbersThread t = new OddNumbersThread(); // in starea new
        t.start();// aici trece in Runnable - e vizibil pt JVM
        //t.run(); -> e ca si cum as avea un apel obisnuit de metoda ( s-ar face pe ec fir cu main)
        EvenNumbersThread r = new EvenNumbersThread();// task-ul
        Thread t2 = new Thread(r);//mecanismul efectiv de fir de executie
        t2.start();
        System.out.println("end");
    }
}