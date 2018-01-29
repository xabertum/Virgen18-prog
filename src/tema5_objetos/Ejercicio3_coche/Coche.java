package tema5_objetos.Ejercicio3_coche;

public class Coche {

    /******* ATRIBUTOS ***********/
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private Boolean motorEncendido = false;
    private int[] marchas = { 0, 1, 2, 3, 4, 5 };
    private int marchaActual;
    private int velocidadActual;

    /******** CONSTRUCTORES *******/

    public Coche() {
	this.motorEncendido = false;
	this.marchaActual = marchas[0];
	this.velocidadActual = 0;

    }

    public Coche(String marca, String modelo, String color, String matricula) {
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.matricula = matricula;

    }

    
    /********* GETTERS & SETTERS ****************************/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Boolean getMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(Boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public int[] getMarchas() {
        return marchas;
    }

    public void setMarchas(int[] marchas) {
        this.marchas = marchas;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    
    
    
    
}
