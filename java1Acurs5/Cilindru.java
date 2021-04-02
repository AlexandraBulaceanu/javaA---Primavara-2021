public class Cilindru extends Cerc {
    double h;
    
    @Override
    public double calcArie() {
        //2*Aria cercului (baza cilindrului) + L*h
        return 2*super.calcArie() + super.calcLungime() * this.h;
             //   2*val_cerc + 0 = 2*val_cerc
    }
}