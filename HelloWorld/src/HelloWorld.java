import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Escriba un número para saber su doble y su triple");
        Scanner a = new Scanner(System.in);

        int NumInicial = a.nextInt();
        int NumDoble = NumInicial * 2;
        int NumTriple = NumInicial * 3;
        //Muy ineficiente

        System.out.println("El doble de " + NumInicial + " es " + NumDoble + " y el triple es " + NumTriple);
    }
}
