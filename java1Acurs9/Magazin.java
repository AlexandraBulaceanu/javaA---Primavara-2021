import java.util.*;
public class Magazin {
    private List<Produs> produse = new ArrayList<>();
    
    private static Magazin SINGLETON;
    
    private Magazin() {}
    
    public static Magazin getInstance() {
        if(SINGLETON == null) {
            SINGLETON = new Magazin();
        }
        return SINGLETON;
    }
    
    public void adaugaProdus(Produs p) {
        if(produse.size() < 20) {
            produse.add(p);
        }else {
            throw new PreaMulteProduseException("Nu mai pot fi adaugate produse in magazin!");
        }
    }
    
    public void afisareProduse() {
        produse.forEach(System.out::println);
    }
    
    public void afisareCioco() {
        for(Produs p:produse) {
            if(p instanceof Ciocolata) {
                System.out.println(p);
            }
        }
    }
    
    public void stergeProdus(String nume) {
        for(int i = 0; i < produse.size(); i++) {
            if(produse.get(i).nume.equals(nume)) {
                produse.remove(produse.get(i));
            }
        }
    }
     
}