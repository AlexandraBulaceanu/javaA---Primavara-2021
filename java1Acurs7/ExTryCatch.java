public class ExTryCatch{
    public static void main(String [] args) {
        try{
            System.out.println("A");
            m(5);
            System.out.println("B");
        }catch(NotEnoughMoneyException e){
            System.out.println("C");
        }catch(AnotherException e) {
            System.out.println("D");
        }
    }
    public static void m(int x) throws NotEnoughMoneyException, AnotherException{
        if(x>100) {
            throw new NotEnoughMoneyException();
        }
        if(x<10) {
            throw new AnotherException();
        }
    }
}