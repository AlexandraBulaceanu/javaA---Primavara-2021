public class ExempluStatic {
    public static void main(String [] args){
        Punct p1 = new Punct(4,5);
        Punct p2 = new Punct(7,8);
        
        p1.z = 34;
        p2.z = 90;
        Punct.z = 100;
        System.out.println(p1.z);
        System.out.println(p2.z);
        System.out.println(Punct.z);
        p1.x = 10;
        p2.x = 30;
        System.out.println(p1.x);
        System.out.println(p2.x);
        Punct.afiseazaZ();
        //Punct.afiseazaX();
        double radical = Math.sqrt(4);
        System.out.println(radical);
    }
}