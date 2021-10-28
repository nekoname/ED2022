import java.util.Scanner;

public class A24 {
    public static void main(String[] args) {
        System.out.println("Indique el tipo de operación: 1.Sumar, 2.Restar, 3.Multiplica y 4. Dividir");
        Scanner a = new Scanner(System.in);
        int elecction = a.nextInt();
        System.out.println("Ahora escrible el primer operando");
        double valor1 = a.nextDouble();
        System.out.println("Escriba el segundo operando");
        double valor2 = a.nextDouble();
        switch (elecction) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(valor1 - valor2);
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                System.out.println(valor1 / valor2);
                break;
            default:
                System.out.println("Opcion no contemplada");
        }
    }
}
