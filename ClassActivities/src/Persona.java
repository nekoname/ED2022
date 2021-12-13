public class Persona {
    /**
     * 1.Atributos
     * 2.metodos
     * 3.contructor
     */
    private final char hombre = 'H';
    private final int infraPeso = -1;
    private final char pesoIdeal = 0;
    private final char sobrePeso = 1;
    private String nom = "";
    private char sexo = hombre;
    private int edad 0;
    private String DNI = "";
    private double peso = 0;
    private double altura = 0;
    public Persona(){

    }
     public Persona(String nom, int edad, char sexo){
        this.nom = nom;
        this.edad = edad;
        this.sexo= sexo;
     }
    public Persona(String nom, int edad, char sexo,String dni, double peso, double altura){
        this.nom = nom;
        this.edad = edad;
        this.dni = dni;
        this.sexo= sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public static int CalcularImc(double peso, double altura){
        double imc = peso * (altura*altura)
        if (imc < 20){
            return infraPeso;
        }
        else if (imc < 25){
            return pesoIdeal;
        }
        else {
            return sobrePeso;
        }
    }

    public static void main(String[] args) {

    }
}
