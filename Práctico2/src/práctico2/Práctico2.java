
package práctico2;

import java.util.Scanner;

public class Práctico2 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de horas trabajadas ");
        int horasTrab=SC.nextInt();
        
        System.out.println("Ingresar valor de la hora ");
        int valorHora=SC.nextInt();
        
        float totalSinExtra=(horasTrab*valorHora);
        
        int horasExtras=horasTrab-180;
        
        float valorHoraExtra=(valorHora*0.5f)+valorHora;
        
        float totalConExtra=(180*valorHora)+(horasExtras*valorHoraExtra);
        
        if(horasTrab<180)
        {
            System.out.println("Total a cobrar " + totalSinExtra);
        }
        else
        {
            System.out.println("Total a cobrar " + totalConExtra);
        }
        
    }
    
}
