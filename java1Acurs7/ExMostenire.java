public class ExMostenire{
    public static void main(String [] args) {
        try{
            System.out.println("A");
            m(5);
            System.out.println("B");
        }catch(BazException e){
            System.out.println("C");
        }catch(FooException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void m(int x) throws FooException{
        if(x>100) {
            throw new BazException();
        }
        if(x<10) {
            throw new FooException();
        }
    }
}