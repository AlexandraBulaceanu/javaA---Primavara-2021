public class ExSingleton {
    public static void main(String [] args) {
        //DBConnection conn = new DBConnection();
        DBConnection conn = DBConnection.getInstance();
        conn.nume = "Oracle";
        DBConnection conn2 = DBConnection.getInstance();
        conn2.nume = "MySQL";
        System.out.println(conn.nume);
        System.out.println(conn2.nume);
    }
}