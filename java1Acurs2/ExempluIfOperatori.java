/**
  Se dau urmatoarele: h1 = 5, m1 = 30, s1 = 20 - cand am ajuns
                      h2 = 6, m2 = 40, s2 = 40 - cat am stat
 Se cere: la cat am plecat? -> h1, m1, s1 ? (la final)
 */
//TO DO: sa puneti conditie si pt 24 h
//       sa oferiti si alta varianta de rezolvare fata de cea discutata la curs 
public class ExempluIfOperatori {
    public static void main(String [] args) {
        int h1 = 5, m1 = 30, s1 = 20;
        int h2 = 6, m2 = 40, s2 = 40;
        //m1 = 11; s1 = 0; h1 = 12
        
        if(s1+s2 >= 60) {
            m1++;
            //s1 = s1 + s2 - 60;
            s1 += s2 - 60;
        } else {
            s1 += s2;
        }
        
        if(m1+m2 >= 60) {
            h1++;//h1 = h1 + 1
            m1 += m2-60;
        } else {
            m1 += m2;
        }
        
        h1 += h2;
        
        System.out.println(h1+" "+m1+" "+s1);
        
        
    }
}