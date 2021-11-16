public class Persona {
    /**
     * 1.Atributos
     * 2.metodos
     * 3.contructor
     */
    private final char HOMBRE = 'H';
    private String nom;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){
        nom = "";
        edad = 0;
        dni = "";
        sexo= HOMBRE;
        peso = 0;
        altura = 0;
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
    public static void main(String[] args) {

    }
}
