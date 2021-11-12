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
        dni = "12345678A";
        sexo= HOMBRE;
        peso = 0;
        altura = 0;
    }
    public Persona(nom, edad,sexo){
        this.nom = "";
        this.edad = 0;
        dni = "12345678A";
        this.sexo= HOMBRE;
        peso = 0;
        altura = 0;
    }
    public Persona(dni, peso){
        nom = "";
        edad = 0;
        dni = "12345678A";
        sexo= HOMBRE;
        peso = 0;
        altura = 0;
    }
    public static void main(String[] args) {

    }
}
