/**@author Liberto
 * @version 1.0
 */
//Objetivo: el usuario debe poder elegir entre 3 figuras y luego deciciendo la longitud de un lado (y el apotema en el
//caso del pentágono) obtener el area de la figura

//se requieren entradas de teclado
import java.util.Scanner;
public class MultiAreaCalculator {
    public static void main(String[] args) {
        //Instrucciones para usuario
        System.out.println("Seleccion el tipo de figura de la que desea obtener el area: 1 para cuadrado, 2 para triangulo y 3 para pentágono");
        Scanner a = new Scanner(System.in);
        //Se recoge el tipo de figura
        int eleccion = a.nextInt();
        System.out.println("Indique la longitud de un lado de la figura y luego el apotema (para el pentagono)");
        //Se recogen lado y apotema
        double lado = a.nextDouble();
        double apotema = a.nextDouble();
        //En función de la eleccion se deriva a un tipo de algoritmo
        double resultado = 0;
        switch (eleccion) {
            case 1:
                resultado = lado * lado;
                break;
            case 2:
                resultado = (lado * lado) / 2;
                break;
            case 3:
                resultado = (5 * lado * apotema) / 2;
                break;
            //salida por si el usuario da una opcion no contemprada
            default:
                System.out.println("El tipo de figura no ha sido seleccionada correctamente ");
        }
        //Se indica el resultado

            System.out.println("El area es " + resultado);


    }
}