import java.io.IOException;

public class A13 {
    public static void main (String [] args) throws IOException {
        System.out.println("Inserte caracter A");
        char a = (char)System.in.read();
        System.in.read();
        System.out.println("Inserte caracter B");
        char b = (char)System.in.read();
        Character CA = new Character(a);
        Character CB = new Character(b);
        if (CA.equals(CB)) {
            System.out.println("Los caracteres son iguales");
        }
        else {
            System.out.println("Los caracteres no son iguales");
        }
    }
}
