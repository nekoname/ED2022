import java.util.Scanner;
public class A6{
    public static void main (String[] args) {
        System.out.println("Introduzca una velocidad en Km/h para convertir a m/s");
        Scanner a = new Scanner(System.in);
        int KmH = a.nextInt();
        int MS = KmH * 1000/3600;
        System.out.println( MS + "m/s");
    }
}