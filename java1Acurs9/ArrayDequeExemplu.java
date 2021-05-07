import java.util.*;

public class ArrayDequeExemplu {
    public static void main(String [] args) {
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.push(25);//adauga elemente la inceput
        deq.offer(10);//adauga elemente la final
        deq.pop();//elimina si intoarce elementul de la inceput
        deq.poll();//eliminare fara intoarcere
        deq.peek();//intoarce elem de la inceput fara eliminare
        
        //coada -> FIFO(FIRST IN FIRST OUT) -> offer + pop
        //stiva -> LIFO(LAST IN FIRST OUT) -> push + pop
    }
}