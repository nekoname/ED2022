import java.util.Scanner;
public class Calculator2 {
    private static String textosMenu[] = new String[6];
    private static boolean salir;
    private static double o1;
    private static double o2;
    private static int i = 0;
    public static double [] historial = new double[100];
    public static void main(String[] args) {
        salir=false;

        crearMenu();
        while (!salir){
            mostrarMenu();
            ejecutarSeleccion(pedirSeleccion());
        }
    }

    private static void ejecutarSeleccion(int seleccion) {
        switch (seleccion){
            case 1:
                sumar();
                i++;
                break;
            case 2:
                restar();
                i++;
                break;
            case 3:
                multiplicar();
                i++;
                break;
            case 4:
                dividir();
                i++;
                break;
            case 5:
                mostrarHistorial();
                break;
            case 6:
                salir=true;
                System.out.println("Saliendo....");
                break;
            default:
                System.out.println("Error!");
        }

    }

    private static void restar() {
        pedirOperadores();
        historial[i] = o1 - o2;
        int j = i+1;
        System.out.println("Resultado "+j+": "+ historial[i]);

    }
    private static void multiplicar() {
        pedirOperadores();
        historial[i] = o1 * o2;
        int j = i+1;
        System.out.println("Resultado "+j+": "+ historial[i]);

    }
    private static void dividir() {
        pedirOperadores();
        historial[i] = o1 / o2;
        int j = i+1;
        System.out.println("Resultado "+j+": "+ historial[i]);

    }

    private static void sumar() {
        pedirOperadores();
        historial[i] = o1 + o2;
        int j = i+1;
        System.out.println("Resultado "+j+": "+ historial[i]);}
    private static void mostrarHistorial(){
        for (int x = 0;x < i;x++){
            int y = x+1;
            System.out.println("Resultado "+y+": "+ historial[x]);
        }
    }

    private static int pedirSeleccion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije una opcion: ");
        return sc.nextInt();
    }
    private static void pedirOperadores() {
        Scanner operador = new Scanner(System.in);
        System.out.println("Inserte operador 1: ");
        o1 = operador.nextDouble();
        System.out.println("Inserte operador 2: ");
        o2 = operador.nextDouble();

    }
    private static void mostrarMenu() {
        for (int i=0; i<textosMenu.length; i++){
            System.out.println(textosMenu[i]);
        }
    }

    private static void crearMenu() {
        textosMenu[0] = "Pulsa 1 para sumar";
        textosMenu[1] = "Pulsa 2 para restar";
        textosMenu[2] = "Pulsa 3 para multiplicar";
        textosMenu[3] = "Pulsa 4 para dividir";
        textosMenu[4] = "Pulsa 5 para mostrar historial";
        textosMenu[5] = "Pulsa 6 para salir";
    }
}
