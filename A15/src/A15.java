import java.io.IOException;

public class A15 {
    public static void main (String [] args) throws IOException {
        System.out.println("Escriba dos caracteres");
        char a = (char)System.in.read();
        System.in.read();
        char b = (char)System.in.read();
        Character CA = new Character(a);
        Character CB = new Character(b);
        if (a == b) {
            System.out.println("son el mismo caracter");
        }
        else {
            System.out.println("No son el mismo caracter");
        }
        if (Character.isLowerCase(CA)){
            System.out.println("es minúscula");
        }
        else {
            System.out.println("no es miniscula");
        }
        if (Character.isLowerCase(CB)){
            System.out.println("es minúscula");
        }
        else {
            System.out.println("no es miniscula");
        }

    }
}
