/**
  Acesta este un exemplu pentru primitive
  @author Alexandra
  @version 1.0
 */
public class ExempluPrimitive {
    public static void main(String [] args) {
        byte b1;//declarare de variabila
        /* acesta 
         * este
         * un comentariu pe 
         * mai multe linii  
        */
        b1 = 10;//initializare
        byte b2 = 30;
        short s1, s2, s3;
        int i1 = 5;
        long l1 = 45;
        int i2 = 04;//baza 8
        int i3 = 0b101001;//baza 2
        int i4 = 0xFA;//baza 16
        long l2 = 1_000_000;
        long l3 = 10000000000L;
        float f1 = 10.5f;
        float f2 = (float)10.5;
        double d1 = 10.6;
        boolean bool1 = true;
        boolean bool2 = false;
        char c1 = 'a';
        char c2 = '\u0235';
        char c3 = '\n';
        System.out.println(c2);
        System.out.println(i3);
        System.out.println(c2+" "+i3);
        
        //SIRUL DE CARACTERE NU E PRIMITIVA
        String sir = "Vineri";
        System.out.println(sir);
    }
    //int b1 = 4;
}