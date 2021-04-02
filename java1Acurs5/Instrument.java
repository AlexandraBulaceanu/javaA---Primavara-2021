public interface Instrument {
    //int x;
    int x = 10;
    //public static final int x = 10;
    public void play();//abstract este pus automat, este redundant sa il pun in acest context
    //void play(){}
    public default void mConcreta(){}//J8
    static void mStatica(){}//J8
    private void mPrivata(){}//J9
    
    //public e modul de acces implicit pt toti membrii
    //final + abstract => eroare de compilare
}