import java.io.IOException;
import java.util.Scanner;
public class exe {
    public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        System.out.println("Indica el nombre");
        String nom = a.nextLine();
        System.out.println("Indica la edad");
        int edad = a.nextInt();
        System.out.println("Indica el sexo (H/M)");
        char sexo = (char) System.in.read();
        System.out.println("Indica el peso");
        double peso = a.nextDouble();
        System.out.println("Indica la altura");
        double altura = a.nextDouble();

        persona persona1 = new persona(nom,edad,sexo,peso,altura);
        persona persona2 = new persona(nom, edad,sexo);
        persona2.setPeso(peso);
        persona2.setAltura(altura);
        persona persona3 = new persona();
        persona3.setNom(nom);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        getPeso(persona1);
        getMayoriaEdad(persona1);
        System.out.println(persona1);


        getPeso(persona2);
        getMayoriaEdad(persona2);
        System.out.println(persona2);

        getPeso(persona3);
        getMayoriaEdad(persona3);
        System.out.println(persona3);


    }



    public static void getPeso(persona persona){
        if (persona.getImc() == -1){
            System.out.println("Infrapeso");
        }
        else if(persona.getImc() == 0){
            System.out.println("Peso ideal");
        }
        else {
            System.out.println("Sobre peso");
        }
    }
    public static void getMayoriaEdad(persona persona){
        if (persona.mayorEdad()){
            System.out.println("Mayor edad");
        }
        else {
            System.out.println("Menor edad");
        }
        }
}
