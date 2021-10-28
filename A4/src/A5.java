import java.util.Scanner;
public class A5 {
    private static final double pi = 3.14;
    public static void main(String[] args) {
        System.out.println("Introduzca el radio de una circunferencia para obtener su longitud y area");
        Scanner a = new Scanner(System.in);
        double radio = a.nextInt();

        double longitud  = radio * 2 * pi;
        double area = pi * radio * radio;
        System.out.println("La longitud es " + longitud + " y el area " + area);
    }
}
