// Jaime Posadas Adame - A00821432 - IFI
package spp.jposadasa.t02.p1;
import java.util.Scanner;
public class SPPJPosadasAT02P1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double sue, pago;
        int cate, he;
        
        System.out.println("Calculadora de sueldos");
        System.out.println("Porfavor introduzca el sueldo");
        sue = kb.nextDouble();
        System.out.println("Porfavor introduzca las horas extras trabajadas");
        he = kb.nextInt();
        System.out.println("Porfavor introduzca la categoria del empleado");
        cate = kb.nextInt();
        
        if (cate <= 8 || cate > 0); {
            switch (cate) {
            case 1: 
                pago = (30 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            case 2:
                pago = (38 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            case 3:
                pago = (50 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            case 4:
                pago = (70 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            case 5:
                pago = (90 * he) + sue;
                System.out.println("Su sueldo total es de: " + pago);
                break;
            }
    }
    }
}