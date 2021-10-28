/**@author Liberto
 * @version 1.0
 */
//El objetivo del programa es creaar una calculadora de pesetes a euros y viceversa
//se requiere la librería Scanner para recoger las entradas de teclado
import java.util.Scanner;
public class PesetasEuros {
    //se declara el factor de conversion
    public final static double FactorConversion = 166.386;
    public static void main(String[] args){
        //El usuario indica el tipo de conversion que quiere
        System.out.println("Pulse 1 para conversión de pesetas a euros y 2 para conversión de euros a pesetas");
        Scanner a = new Scanner(System.in);
        int eleccion = a.nextInt();
        //El usuario indica la cantidad a convertir
        System.out.println("Exprese la cantidad a convertir");
        double cantidad = a.nextDouble();
        //En funcion del tipo de conversion se aplica una formula u otra y luego se indica el resultado de la conversion
        switch (eleccion) {
            case 1:
                double resultado1 = cantidad / FactorConversion;
                System.out.println(resultado1 + "€");
                break;
            case 2:
                double resultado2 = cantidad * FactorConversion;
                System.out.println(resultado2 + "p");
                break;
                //salida de programa por si el usuario se equivoca eligiendo el tipo de conversion
            default:
                System.out.println("Esa no es  una opción contemplada");
        }
    }
}
