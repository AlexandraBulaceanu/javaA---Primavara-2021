import java.util.*;
public class ExHashSet {
    public static void main(String [] args) {
        Set<Integer> set = new HashSet<>();
        //Set -> nu e ordonata(nu mai pastreaza ordinea de adaugare), NU permite duplicate
        //HashSet este o colectie rapida la cautari
        set.add(34);
        set.add(56);
        set.add(34);
        set.add(70);
        set.add(90);
        set.forEach(System.out::println);
    }
}