/**
 * Sa se afiseze in consola numerele de la 1 la 10.
 */
public class ExempluWhile {
    public static void main(String [] args) {
        int i = 1;
        //i = 11
        while(i < 11) {
            System.out.println(i);
            i++;
        }
        
        while(true){
         //o bucla infinita
           break;
        }
        
        System.out.println("nop");//unreachable statement
        
        //while(false){}
        i = 1;//resetez valoarea i-ului
        do {
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}