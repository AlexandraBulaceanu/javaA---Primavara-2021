@FunctionalInterface
public interface Instrument {
    public void play();
    //public void m();
    public default void mesaj(String mesaj) {
        System.out.println(mesaj);
    }
}