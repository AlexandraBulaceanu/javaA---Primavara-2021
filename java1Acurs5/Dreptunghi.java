public class Dreptunghi extends Forma {
    //pot sa o fac tot abstracta, daca aleg sa nu ofer nici aici implementare pt getArie
     
    int h = 3;
    
    @Override
    public double getArie() {
        return l*h; //suntem obligati sa suprascriem metoda daca 
                    //alegem sa lasam cls Dretunghi concreta
    }

}

