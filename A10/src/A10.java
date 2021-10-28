/**@author Liberto
 * @version 1.0
 */

import java.util.Scanner;
public class A10 {
    //Este programa recoge tu peso relativo en la Tierra y te dice cual seria tu peso relativo en la luna.
    //aquí se declara el factor de conversión para convertir el peso terrestre en peso lunar
    private static final double FactorConversion = 0.166;
    static public void main (String [] args){
        //Aqui se recoge el input que equivale al peso en la Tierra
        System.out.println("introduzca su peso");
        Scanner a = new Scanner(System.in);
        //Aquí se aplica el factor de conversión al input para obtener el peso en la luna y
        //luego se imprime por pantalla el mensaje con el peso en la luna
        double PesoLuna = a.nextDouble() * FactorConversion;
        System.out.println("su peso el la luna seria " + PesoLuna);
    }
}
