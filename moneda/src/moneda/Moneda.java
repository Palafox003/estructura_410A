package moneda;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class Moneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int moneda=0,j=0,cartera=500,apuesta=0;
        String credito="";
        
        Random rnd=new Random();
        Scanner leer=new Scanner(System.in);
            
        do{
        moneda=rnd.nextInt(2);
        
        System.out.println("Tu saldo actual es de "+cartera+" ¿Cuanto quieres apostar?");
        apuesta=leer.nextInt();
        if(apuesta<=cartera){
            apuesta=apuesta;
        } else{
            apuesta=cartera;        
              }
        
        System.out.println("Elige Sol. (0) o Aguila (1)");
        j=leer.nextInt();
        
        if(j==moneda){
            System.out.println("Felicidades ya ganaste.");
            cartera=cartera+apuesta;
        }else{
            System.out.println("Surte para la proxima.");
            cartera=cartera-apuesta;
        }
            
            if(moneda==0){
                System.out.println("Cayo Sol. "+moneda);
        }else{
                System.out.println("Cayo Aguila. "+moneda);
            }
            
            System.out.println("Tu saldo actual es de "+cartera);
            
            System.out.println("Continuar con el juego Si=(s) No=(n)");
            credito=leer.next();
         }while(credito.equals("s") && cartera>0);
    }
        
    
}
