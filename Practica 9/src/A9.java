/** @author Liberto
 * @version 1.0
 */
//Este programa es para convertir m/s a km/h
//Se requieren entradas de teclado
import java.util.Scanner;
public class A9 {
    public static void main(String[] args){
        //Intrucciones para el usuario
        System.out.println("Indique la distancia recorrida en metros");
        //Aquí se introduce la distancia en metros
        Scanner a = new Scanner(System.in);
        double distancia = a.nextDouble();
        //Y aquí el tiempo en segundos
        System.out.println("Inqique el lapso de tiempo transcurrido en segundos");
        double tiempo = a.nextDouble();
        //Se realiza la conversión y se da como output
        distancia = distancia / 1000;
        tiempo = tiempo / 3600;
        double resultado = distancia / tiempo;
        System.out.println("la velocidad es de: " + resultado + " km/h");
    }
}
