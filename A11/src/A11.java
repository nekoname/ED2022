/**@author Liberto
 * @version 1.0
 */
//Se requiere la librería Scanner para coger inputs
import java.util.Scanner;
public class A11 {
    public static void main(String [] args) {
        //Orienta al usuario de que debe hacer
        System.out.println("Introduzca un número para saber si es par o impar");
        //Se recoge el valor a evaluar y se almacena en la variable valor
        Scanner a = new Scanner(System.in);
        int valor = a.nextInt();
        //La función evalua el valor y te indica si es par o impar.
        if (valor%2 != 0) {
            System.out.println("Valor impar");
        }
        else {
            System.out.println("Valor par");
        }
    }
}
