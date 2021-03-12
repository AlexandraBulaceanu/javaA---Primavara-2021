public class ExempluFor{
    public static void main(String [] args) {
        
        for(int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        
        int i = 1;
        for(;;) {
            System.out.print(i+" ");
            i++;
            if(i>=11) break;
        }
    }
}