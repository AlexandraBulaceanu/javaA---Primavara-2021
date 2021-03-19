public class Pisica{
    String nume;
    int varsta;
    String culoare;
    double greutate;
    
    
    Pisica() {
      this("Necunoscut",1,"Nicio culoare");
      System.out.println("Sunt un constructor fara parametrii. Constructorul implicit nu mai exista");  
    }
    Pisica(String nume, int varsta, String culoare){
        //this("nume","culoare");
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
        //this = instanta clasei care se construieste
    }
   
    
    void toarce() {
        System.out.println("Miau. Ma numesc: "+this.nume);
        //this = instanta care se comporta
    }
    
    double greutateaMea() {
        return this.greutate;
    }
    
    
    //Pisica p1;
    //Pisica p1("Lea");
}