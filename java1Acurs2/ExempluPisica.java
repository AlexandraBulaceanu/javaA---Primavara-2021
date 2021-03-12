public class ExempluPisica{
    public static void main(String [] args){
        Pisica p1 = new Pisica("Jerry",2,"maro");
        Pisica p2 = p1;
        p1.nume = "Tom";
        //. = operator de dereferentiere
        Pisica p3 = new Pisica("Lea",6,"alb");
        System.out.println(p1.nume);
        System.out.println(p2.nume);
        System.out.println(p3.nume);
        System.out.println(p1);
        System.out.println(p1.nume+" "+p1.varsta+" "+p1.culoare);
        System.out.println(p2.nume+" "+p2.varsta+" "+p2.culoare);
        System.out.println(p3.nume+" "+p3.varsta+" "+p3.culoare);
    }
}