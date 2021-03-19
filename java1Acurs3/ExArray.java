//import java.util.*; ->cursul viitor
public class ExArray{
    public static void main(String [] args){
        int[] nr = new int[5];
        nr[1] = 20;
        System.out.println(nr[0]+" "+nr[1]);
        /** 
           Salvati o colectie de numere de la 1 la 5. Sa afisam pe ecran acel array.
        */
        for(int i = 0; i<nr.length; i++) {
            nr[i] = i+1;
        }
        for(int elem:nr) {
            System.out.println(elem);
        }
        //ArrayList<Integer> list = new ArrayList<>(); -> explicam in cursul 8
        //list.forEach(System.out::println);
        
        Punct[] puncte = new Punct[5];
        for(int i = 0; i<puncte.length; i++) {
            puncte[i] = new Punct(i,i+1);
        }
        for(int i = 0; i<puncte.length; i++) {
            System.out.println(puncte[i].x+" "+puncte[i].y);
        }
        
        int mat[][] = new int[3][];
        mat[0] = new int[3];
        mat[1] = new int[3];
        mat[2] = new int[2];
        int val = 1;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++) {
                mat[i][j] = val;
                val++;
            }
        }
        for(int[] arr:mat){
            for(int elem:arr){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}