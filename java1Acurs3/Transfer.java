public class Transfer{
    void modificaValoare(int x){
        x++;
        System.out.println("In interiorul metodei x are valoarea "+x);
    }
    void modificaReferinta(Pisica p){
        p.varsta = 12;
        System.out.println("p.varsta in interiorul metodei este "+p.varsta);
    }
    int m(){
        return 2;
    }
}