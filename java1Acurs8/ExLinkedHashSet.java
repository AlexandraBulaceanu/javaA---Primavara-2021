import java.util.*;
public class ExLinkedHashSet {
    public static void main(String [] args) {
        Set<Integer> set = new LinkedHashSet<>();
        //Set -> nu e ordonata(nu mai pastreaza ordinea de adaugare), NU permite duplicate
        //LinkedHashSet este ordonata
        set.add(34);
        set.add(56);
        set.add(34);
        set.add(70);
        set.add(90);
        set.forEach(System.out::println);
    }
}