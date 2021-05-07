import java.util.*;
public class Aplicatie {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Magazin magazin = Magazin.getInstance();
        while(true) {
            System.out.println("Introdu comanda: ");
            String cmd = scanner.nextLine();
            String [] cuv = cmd.split("\\s+");//vector de cuvinte, spart dupa oricate spatii
            switch(cuv[0]) {
                case "exit": System.out.println("se inchide aplicatia");
                             System.exit(0);
                case "adaugaCioco": Ciocolata c = new Ciocolata();
                                    c.nume = cuv[1];
                                    c.pret = Double.parseDouble(cuv[2]);
                                    c.kcal = Integer.parseInt(cuv[3]);
                                    magazin.adaugaProdus(c);
                                    System.out.println("A fost adaugata o ciocolata!");
                                    break;
                case "adaugaBere":  Bere b = new Bere();
                                    b.nume = cuv[1];
                                    b.pret = Double.parseDouble(cuv[2]);
                                    b.pa = Double.parseDouble(cuv[3]);
                                    magazin.adaugaProdus(b);
                                    System.out.println("A fost adaugata o bere!");
                                    break;
                case "afisare": magazin.afisareProduse();
                                break;
                case "afisareCioco": magazin.afisareCioco();
                                     break;
                case "stergere": magazin.stergeProdus(cuv[1]);
                                 System.out.println("A fost sters un produs!");
                                 break;
                default:  System.out.println("A fost introdusa o comanda necunoscuta!");               
            }
        }
    }
}