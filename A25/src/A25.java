import java.util.Scanner;

public class A25 {
    public static void main(String[] args) {
        System.out.println("Indique su nota");
        Scanner a = new Scanner(System.in);
        int nota = a.nextInt();
        if (nota == 10) {
            System.out.println("Ha sacado matrícula");
        }
        else if (nota == 9) {
            System.out.println("Ha sacado excelente");
        }
        else if (nota == 8) {
            System.out.println("Ha sacado notable alto");
        }
        else if (nota == 7) {
            System.out.println("Ha sacado notable");
        }
        else if (nota == 6) {
            System.out.println("Ha sacado bien");
        }
        else if (nota == 5) {
            System.out.println("Ha sacado suficiente");
        }
        else {
            System.out.println("Ha sacado insuficiente");
        }

    }
}
