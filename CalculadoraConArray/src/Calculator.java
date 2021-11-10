/**@autor Liberto
 * @version 1.0
 * @description Esta calculadora tiene la particularidad de que acumula hasta los 10 último resultados obtenidos
 */
import java.util.Arrays;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double resultado[] = new double[10];
        for (int i=0; i < 10;i++) {
            System.out.println("Selección de operación: 1.Suma 2.Resta 3.Multiplicación 4.División");
            Scanner scan = new Scanner(System.in);
            int election = scan.nextInt();
            System.out.println("Inserte los operadores");
            scan = new Scanner(System.in);
            double operador1 = scan.nextDouble();
            scan = new Scanner(System.in);
            double operador2 = scan.nextDouble();
            double resultadoFinal[] = calcular(election,operador1,operador2, resultado,i);

            for (int x=0;x < 10;x++)
                System.out.println(x + " " + resultadoFinal[x]);
        }
    }
        public static double[] calcular(int tipoOperacion, double o1, double o2, double []resultado,int i) {
            if (resultado[i] != resultado[0])
                o1 = resultado[i];
            switch (tipoOperacion) {
                //en cada caso se hará una llamada al método calculador con los argumento:Tipo operación, operador1 y operador 2
                case 1:
                    resultado[i] = o1 + o2;
                    break;
                case 2:
                    resultado[i] = o1 - o2;
                    break;
                case 3:
                    resultado[i] = o1 * o2;
                    break;
                case 4:
                    if (o2 != 0) {
                        resultado[i] = o1 / o2;
                    } else {
                        System.out.println("Estás jugando a ser Dios");
                    }
                    break;
                default:
                    System.out.println("Opción no contemplada");

            }
            return resultado;
        }


    }


