public class Persona {
    /**
     * 1.Atributos
     * 2.metodos
     * 3.contructor
     */
    private final char hombre = 'H';
    private final static int infraPeso = -1;
    private final static int pesoIdeal = 0;
    private final static int sobrePeso = 1;
    private String nom = "";
    private char sexo = hombre;
    private int edad = 0;
    private String dni = "";
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
    public int CalcularImc(){
        double imc = peso / (altura*altura);

        if (imc < 20){
            return infraPeso;
        }
        else if (imc <= 25){
            return pesoIdeal;
        }
        else {
            return sobrePeso;
        }
    }
    public boolean esMayorEdat(){
        return edad >= 18;
    }
    private void comprobarSexo(char sexo){
        if (sexo != 'M'){
            sexo = hombre;
    }}

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public static void main(String[] args) {

    }
}
