import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        System.out.println("Escriba grados centígrados para pasarlos a farenheit");
        Scanner a = new Scanner(System.in);
        double InputCelsius = a.nextInt();
        double OutputFarenheit = InputCelsius * 1.8 + 32;
        System.out.println("El resultado de la conversión es " + OutputFarenheit + " grados Farenheit");
    }
}
