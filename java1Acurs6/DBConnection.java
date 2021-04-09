public class DBConnection {
    String nume;
    
    private static DBConnection SINGLETON;
    
    private DBConnection(){
        
    }
    
    public static DBConnection getInstance() {
        if(SINGLETON == null) {
            //daca nu mai exista o alta conexiune in aplicatie
            //instantiez o noua conexiune -> o sg data o sa intre pe if
            SINGLETON = new DBConnection();
        }
        return SINGLETON;
    }
}

