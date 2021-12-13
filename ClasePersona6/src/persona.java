/** @author Liberto Javier Torrente Vera
 * @version 6.1.0
 * @date 22-11-2021
 * @Description Requisitos: crear clase persona (atributos: nombre, edad, DNI, sexo (H hombre/M mujer), peso y altura), debe tener 3 constructores,
 * método calcularImc(),método mayorEdad(), método toString(), se le asigna a cada objeto persona un dni aleatorio con un método, setters para los
 * atributos.
 * Además se debe crear una clase ejecutable para: pedir al usuario sus datos, crear 3 objetos (cada uno inicializado de forma concreta).
 * Por último se deberán imprimir por pantalla si el peso de la persona es infrapeso/peso ideal/sobrepeso, si es mayor de edad o no y todos
 * los atributos de la persona.
 */

public class persona {
    /**
     * 1.Atributos
     * 2.metodos
     * 3.contructor
     */

    //declaración de contantes y variables
    public final char hombre = 'H';
    public final int infraPeso = -1;
    public final int pesoIdeal = 0;
    public final int sobrePeso = 1;
    private String nom;
    private char sexo;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    //primer constructor: no recibe argumentos, solo da valores por defecto a los atributos
    public persona(){
        nom = "";
        edad = 0;
        dni = getDni();
        sexo = hombre;
        peso = 0;
        altura = 0;
    }
    //segundo contructor: a diferencia del anterior recibe nom, edad y sexo como argumentos y comprueba si el sexo es valido
    public persona(String nom, int edad, char sexo){
        this.nom = nom;
        this.edad = edad;
        this.sexo= comprobarSexo(sexo);
        dni = getDni();
        peso = 0;
        altura = 0;

    }
    //
    public persona(String nom, int edad, char sexo, double peso, double altura){
        this.nom = nom;
        this.edad = edad;
        dni = getDni();
        this.sexo= comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    public int getImc (){
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return infraPeso;
        }
        else if (imc <= 25){
            return pesoIdeal;
        }
        else {
            return sobrePeso;
        }
    }
    public boolean mayorEdad (){
        return edad >= 18;
    }
    private char comprobarSexo(char sexo){
        if (sexo != 'M'){
            sexo = hombre;
        }
        return sexo;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    @Override
    public String toString() {
        return "persona{" +
                "nom='" + nom + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public static String getDni() {
        StringBuilder dni = new StringBuilder();
        char [] letrasDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        for (int i = 0; i < 8; i++) {
            dni.append((int) (Math.random() * 10));
        }
        dni.append(letrasDni[Integer.parseInt(dni.toString()) % 23]);
        return dni.toString();
    }
}