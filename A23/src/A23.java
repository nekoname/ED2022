import java.util.Scanner;

public class A23 {
    public static void main(String []args) {
        System.out.println("indique un dia de la semana: 1 para lunes, 2 para martes...");
        Scanner a = new Scanner(System.in);
        int dia = a.nextInt();
        switch (dia){
            case 1:
                System.out.println("Día laboral");
                break;
            case 2:
                System.out.println("Día laboral");
                break;
            case 3:
                System.out.println("Día laboral");
                break;
            case 4:
                System.out.println("Día laboral");
                break;
            case 5:
                System.out.println("Día laboral");
                break;
            case 6:
                System.out.println("Día festivo");
                break;
            case 7:
                System.out.println("Día festivo");
                break;
        }
    }
}
