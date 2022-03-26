
package práctico1;

import java.util.Scanner;

public class Práctico1 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner (System.in);
        
        System.out.println("Ingrese nombre ");
        String nombre1=SC.nextLine();
        
        System.out.println("Ingrese estatura de " + nombre1);
        float altura1=SC.nextFloat();
        
        SC.nextLine();
        
        System.out.println("Ingrese nombre ");
        String nombre2=SC.nextLine();
        
        System.out.println("Ingrese estatura de " + nombre2);
        float altura2=SC.nextFloat();
        
        if (altura1>altura2)
        {
            System.out.println(nombre1 + " es más alto que " + nombre2);
        }
        else
        {
            if(altura1<altura2)
            {
                System.out.println(nombre2 + " es más alto que " + nombre1);
            }
            else
            {
                System.out.println(nombre1 + " y " + nombre2 + " tienen la misma estatura");
            }
        }
        
    }
    
}
