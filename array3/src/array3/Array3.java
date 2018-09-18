package array3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos[];
        int t=0;
        
        Scanner leer=new Scanner(System.in);
        Random rnd=new Random();
        
        System.out.println("Inserta la longitud del array:");
        t=leer.nextInt();
        
        datos=new int[t];
        
        for(int i=0;i<datos.length;i++) {
           datos[i]=rnd.nextInt(100);
        }
        
        for (int i = 0; i < datos.length; i++) {
            System.out.println((i+1)+".- "+datos[i]);
        }
        
    }
    
}
