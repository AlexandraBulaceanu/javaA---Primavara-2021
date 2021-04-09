public class Angajat{
    double salariu;
    int vechime;
    String nume;
    
    public Angajat(double salariu, int vechime, String nume){
        this.salariu=salariu;
        this.vechime=vechime;
        this.nume=nume;
    }
    
    public double calculeazaSalariu(){
        if(vechime>5){
            return salariu+800;
        } 
        return salariu;
    }
}