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

    public Coche(int velocidad, int marcha) {
	this.motorEncendido = true;
	this.velocidadActual = velocidad;
	this.marchaActual = marchas[marcha];

    }

}
