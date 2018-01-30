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

    /********** METODOS PRIVADOS ******************/

    private void subirMarcha(int velocidadSubirMarchas) {
	if (velocidadSubirMarchas >= 0 && velocidadSubirMarchas <= 30)
	    marchaActual = marchas[1];

	if (velocidadSubirMarchas >= 30 && velocidadSubirMarchas <= 50)
	    marchaActual = marchas[2];

	if (velocidadSubirMarchas >= 50 && velocidadSubirMarchas <= 70)
	    marchaActual = marchas[3];

	if (velocidadSubirMarchas >= 70 && velocidadSubirMarchas <= 100)
	    marchaActual = marchas[4];

	if (velocidadSubirMarchas > 100)
	    marchaActual = marchas[5];

	velocidadActual +=10;

    }

    private void bajarMarcha(int velocidadBajarMarchas) {
	if (velocidadBajarMarchas >= 0 && velocidadBajarMarchas <= 30)
	    marchaActual = marchas[1];

	if (velocidadBajarMarchas >= 30 && velocidadBajarMarchas <= 50)
	    marchaActual = marchas[2];

	if (velocidadBajarMarchas >= 50 && velocidadBajarMarchas <= 70)
	    marchaActual = marchas[3];

	if (velocidadBajarMarchas >= 70 && velocidadBajarMarchas <= 100)
	    marchaActual = marchas[4];

	if (velocidadBajarMarchas > 100)
	    marchaActual = marchas[5];

	velocidadActual -=10;
    }

    /********* METODOS PUBLICOS ********************/

    public void arranca() {
	this.motorEncendido = true;
    }
    
    public void puntoMuerto() {
	marchaActual = 0;
    }

    public void simulacionAcelera(int velocidad_usuario) {
	
	    subirMarcha(velocidadActual);
	    
		
    }
    
    public void simulacionDesAcelera(int velocidad_usuario) {
	
	    bajarMarcha(velocidadActual);
	    
		
}
    

    public String toString() {

	return "Velocidad: " + velocidadActual + " Marcha: " + marchaActual;

    }

    /********* GETTERS & SETTERS *******************/
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
