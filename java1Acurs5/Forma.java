public abstract class Forma {
    String nume;
    int l = 4;
    
    public void afisareNume() {
        System.out.println(nume); //metoda concreta
    }
    //public abstract double getArie(){}
    public abstract double getArie();
}

