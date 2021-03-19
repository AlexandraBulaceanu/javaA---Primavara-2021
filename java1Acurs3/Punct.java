public class Punct {
    int x;
    int y;
    static int z;
    //atribut = non-static
    Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    void afiseazaX() {//comportament
        System.out.println(this.x);
    }
    void afiseazaY() {//comportament
        System.out.println(y);// aici compilatorul poate sa subinteleaga this.y
    }
    
    static void afiseazaZ(){//NU e comportament, este metoda statica
        System.out.println(z);
       //System.out.println(this.x);
    }
}