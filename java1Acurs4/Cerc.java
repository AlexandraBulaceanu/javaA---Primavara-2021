public class Cerc extends Punct {
    double raza;//adaugarea de atribut
    //int x;//ascundere de atribut
    String x;//ascundere de atribut
    
    public Cerc() {
        this(6.5);
    }
    
    public Cerc(double raza) {
        super(3,4);// I instructiune din constructor
        this.raza = raza;
        this.x = "cerc";
        //this.x = 10;
        super.x = 10;
        this.y = 5;
        super.y = 6;
        //super.raza = 9;
    }
    
    public double calcArie() {
        return 3.14*this.raza*this.raza;//adaugare de comportament
    }
    public double calcLungime() {
        return 2*3.14*this.raza;
    }
}