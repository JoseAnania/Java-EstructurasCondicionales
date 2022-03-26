
package tareaguía2;

import java.util.Scanner;

public class TareaGuía2 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Ingrese KM recorridos ");
        int km=SC.nextInt();
        
        float totalBajo=300;
        float totalMedio=totalBajo + (km-200)*5;
        float totalAlto=totalBajo+ (800*5) + (km-1000)*10;
        
        if(km<200)
        {
            System.out.println("Importe a cobrar $"+totalBajo);
        }
        if(200<km && km<1000)
        {
            System.out.println("Importe a cobrar $"+totalMedio);
        }
        if(km>1000)
        {
            System.out.println("Importe a cobrar $"+totalAlto);
        }
        
    }
    
}
