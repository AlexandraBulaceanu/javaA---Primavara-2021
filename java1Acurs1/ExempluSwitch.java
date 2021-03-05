/**
 * Consideram zilele saptamanii numerotate de la 1 la 7. Pentru valoarea unui variabile 
 * zi(variabila de test), voi afisa denumirea zilei respective.
 */
public class ExempluSwitch {
    public static void main(String [] args) {
        int zi;
        zi = 20;
        switch(zi){
            case 1: System.out.println("Luni");
                    break;
            case 2: System.out.println("Marti");
                    break;
            case 3: System.out.println("Miercuri");
                    break;
            case 4: System.out.println("Joi");
                    break;
            case 5: System.out.println("Vineri");
                    break;
            case 6:
            case 7: System.out.println("Weekend");
                    break;
            default: System.out.println("Zi invalida");
        }
    }
}