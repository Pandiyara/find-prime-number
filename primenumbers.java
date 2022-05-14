/**
 *
 * @author pandi
 */
import java.util.*;
public class primenumbers {

    public static void main(String[] args){       
        int f=0;
        for(int n=1;n<=30;n++){
            for(int i=1;i<=n;i++){
                if (n%i==0) {
                    f++;
                    }
            }
            
            if (f == 2)
            {
                 System.out.println(n+" is prime number");
             
             } 
            f=0;
        }
    }
         
}     
          
 
