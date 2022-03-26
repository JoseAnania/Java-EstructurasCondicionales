
package tareaguía1;

import java.util.Scanner;

public class TareaGuía1 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Ingrese un año para saber si es bisiesto ");
        int ano=SC.nextInt();
        
        if(ano %4==0 && ano %100 !=0 || ano %400 ==0)
        {
            System.out.println("El año ingresado es bisiesto");
        }
        else
        {
            System.out.println("El año ingresado no es bisiesto");
        }
        
    }
    
}
