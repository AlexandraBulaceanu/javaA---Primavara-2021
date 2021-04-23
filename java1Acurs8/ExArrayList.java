import java.util.*;
public class ExArrayList {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        var list1 = new ArrayList<String>();
        //List, Set, Map -> 
        List<String> orase = List.of("Bucuresti","Alexandria","Ploiesti","Brasov");//J9
        //list -> colectie ordonata(la ordinea in care adaug elementele), indexata, 
        // permite existenta duplicatelor
        list.add(10);//0
        list.add(3);//1
        list.add(7);//2
        list.add(3);//3
        list.add(8);//4
        list.add(4);//5
        System.out.println("SIZE: "+list.size());
        System.out.println("Este goala? "+list.isEmpty());
        System.out.println("Elem de la poz 2"+list.get(2));
        System.out.println("--------------------------------------");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------------------");
        for(Integer x:list) {
            System.out.println(x);
        }
        System.out.println("--------------------------------------");
        Iterator<String> iterator = orase.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------");
        list.forEach(e->System.out.println(e));
        System.out.println("--------------------------------------");
        orase.forEach(System.out::println);
        System.out.println("--------------------------------------");
        list.remove(3);//elimina elem de la poz 3
        list.remove(new Integer(7));//elimina efectiv valoarea 7
        list.forEach(System.out::println);
    }
}