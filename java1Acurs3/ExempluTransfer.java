public class ExempluTransfer {
    public static void main(String [] args){
        Transfer t = new Transfer();
        int x = 10;
        Pisica p1 = new Pisica();//p1.varsta = 1
        System.out.println("Valoarea lui x inainte de apel "+x);
        t.modificaValoare(x);
        //x = t.modificaValoare(x);
        System.out.println("Valoarea lui x dupa apel "+x);
        System.out.println("Varsta pisicii inainte de apel "+p1.varsta);
        t.modificaReferinta(p1);
        System.out.println("Varsta pisicii dupa apel "+p1.varsta);
        
        /** 
           Inferenta tipului pt var locale = var -> Java 10
        */
        String sir = "Buna";
        var sir1 = "Salut";
        //sir1 = p1;
        //var pisu;
        var pisu = new Pisica();
        //var y = null;
        var rez = t.m();
    }
}