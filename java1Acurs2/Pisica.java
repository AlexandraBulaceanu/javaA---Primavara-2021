public class Pisica{
    String nume;
    int varsta;
    String culoare;
    double greutate;
    
    /*
    Pisica() {
      System.out.println("Sunt un constructor fara parametrii. Constructorul implicit nu mai exista");  
    }*/
    Pisica(String nume, int varsta, String culoare){
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
        //this = instanta clasei care se construieste
    }
    
    //Pisica p1;
    //Pisica p1("Lea");
}