public class DBConnection implements AutoCloseable {
    public DBConnection(){
        open();
    }
    private void open() {
        System.out.println("s-a deschis conexiunea!");
    }
    @Override
    public void close() {
        System.out.println("s-a inchis conexiunea!");
    }
}