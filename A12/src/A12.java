import java.io.IOException;
import java.util.Scanner;

public class A12 {
    public static void main(String [] args) throws IOException {
        System.out.println("inserte un carácter para saber si está en mayúscula o minúscula");
        char input = (char)System.in.read();
        if (Character.isUpperCase(input)) {
            System.out.println("Es mayúscula");
        }
        else {
            System.out.println("Es minúscula");
        }
    }
}
