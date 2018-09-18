package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float max[]=new float[7];
        float min[]=new float[7];
        String dias[]={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        float tmax=0,tmin=0,pmax=0,pmin=0;
        int dmax=0,dmin=0;
        
        Scanner leer=new Scanner(System.in);
        
        for(int i=0;i<7;i++) {
            System.out.println("Inserta la temperatura máxima del día: "+dias[i]);
            max[i]=leer.nextFloat();
            pmax=pmax+max[i];
            if(max[i]>tmax){
                tmax=max[i];
                dmax=i;
            }
            System.out.println("Inserta la temperatura mínima del día: "+dias[i]);
            min[i]=leer.nextFloat();
            pmin=pmin+min[i];
            if(i==0){
                tmin=min[i];
                dmin=i;
            }else if(min[i]<tmin){
                tmin=min[i];
                dmin=i;
            }
        }
        
        System.out.println("Temperatura promedio máxima de la semana: "+(pmax/7));
        System.out.println("Temperatura promedio mínimo de la semana: "+(pmin/7));
        System.out.println("---------------------------------------------");
        for(int i=0;i<7;i++){
            System.out.println("Temperatura máxima del día "+dias[i]+" = "+max[i]);
            System.out.println("Temperatura mínima del día "+dias[i]+" = "+min[i]);
        }
        System.out.println("------------------------------------------");
        System.out.println("La temperatura máxima de la semana fue el día "+dias[dmax]+" con "+tmax);
        System.out.println("La temperatura mínima de la semana fue el día "+dias[dmin]+" con "+tmin);
    }
    
}
