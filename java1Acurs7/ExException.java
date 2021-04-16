public class ExException {
    public static void main(String [] ags) {
        System.out.println("Se incearca extragerea...");
        //extragereNumerar(1000);//TO DO: tratarea exceptiei
        System.out.println("extragerea a fost reusita!");
    }
    
    public static void extragereNumerar(double suma) throws NotEnoughMoneyException{
        if(suma>500) {
            NotEnoughMoneyException e = new NotEnoughMoneyException();
            throw e;//arunc instanta de exceptie(semnalez aparitia ei in aplicatie)
        }
    }
}