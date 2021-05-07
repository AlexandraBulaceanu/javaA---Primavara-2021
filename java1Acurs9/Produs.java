/**
 * Un magazin contine mai multe produse. Maximul de produse pe care le poate avea magazinul este
 * de 20. Se va face o exceptie PreaMulteProduseException daca se depaseste aceasta limita. Produsele
 * pot sa fie ciocolata sau bere. Un produs are un nume si un pret. O ciocolata este un produs cu un numar
 * de kcal, iar berea este un produs cu procent de alcool.
 * Utilizatorul poate sa dea urmatoarele comenzi de la tastatura:
 * adaugaCioco nume pret kcal
 * adaugaBere nume pret pa
 * afisare
 * afisareCioco
 * sterge nume
 * exit
 */
public abstract class Produs {
    String nume;
    double pret;
    
    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(o instanceof Produs) {
            Produs p = (Produs)o;
            return this.nume.equals(p.nume);
        }
        return false;
    }
    
}