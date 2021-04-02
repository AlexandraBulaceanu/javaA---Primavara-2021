public class ExPolimorfism {
    public static void main(String ... args) {
        Reptila r1 = new Reptila();
        Crocodil c1 = new Crocodil();
        
        Reptila a = new Crocodil();//polimorfismul
        //Reptila = forma
        //a = referinta de tipul de data al clasei superioare si arata catre o instanta de Crocodil
        //Crocodil = instanta efectiva care se creaza in memorie; ia forma de Reptila
        
        //a.greutate = 78;
        
        //a.lungimeCoada = 2; // pot sa accesez doar caracteristicile care exista si in forma
        System.out.println(a.temperaturaCorp); // pentru atribute -> hiding fields 
                                               // -> se ia valoarea din forma
        a.spuneDenumire(); // pt metode -> se apeleaza suprascrierea din instanta efectiva
        System.out.println(a.greutate);
    }
}