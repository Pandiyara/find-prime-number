/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package my.mavenproject4;

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
          
 