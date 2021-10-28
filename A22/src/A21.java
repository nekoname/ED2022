import java.util.Scanner;

public class A21 {
    public static void main(String[] args) {
        String pass = "P@ssw0rd";
        for (int i = 1; i < 4;i++) {
            System.out.println("Insertar contraseña");
            Scanner a = new Scanner(System.in);
            String input = a.nextLine();
            if (pass.equals(input) ){
                System.out.println("Has acertado");
                System.exit(0);
            }
            else {
                System.out.println("Contraseña errada");
            }
        }
    }
}
