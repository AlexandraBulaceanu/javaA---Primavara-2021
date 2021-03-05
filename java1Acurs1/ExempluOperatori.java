public class ExempluOperatori {
    public static void main(String [] args) {
        boolean b1 = 6>7;//false
        boolean b2 = 5==5;//true
        boolean b3 = 7!=8;//true
        boolean b4 = 5<=9;//true
        
        boolean b7 = true;
        boolean b8 = false;
        int a = 8;
        int b = 2;
        
        boolean b9 = b8&&((a=b)==b);//false, fara evaluarea expresiei ((a=b)==b)
        boolean b10 = b8||((a=b)==b);//true, s-a uitat in dreapta
        boolean b11 = ((a=b)==b)||b8;//true, nu se mai uita in dreapta
        boolean b12 = b8&b7;//false, cu evaluare pt ambele
    }
}