import java.util.*;

public class ExMap {
    public static void main(String [] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Bucuresti");
        map.put(3,"Iasi");
        map.put(5,"Constanta");
        map.put(3,"Brasov");
        map.put(6,"Cluj");
        map.put(10,"Alexandria");
        Set<Integer> keys = map.keySet(); //setul de chei din map
        for(Integer k:keys) {
            System.out.println(k+" "+map.get(k));
        }
        map.forEach((k,v) -> System.out.println(k+" "+v));
    }
}