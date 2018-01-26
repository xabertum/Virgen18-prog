package tema5_objetos.Ejercicio3_coche;

public class Coche {
    
    
    /******* ATRIBUTOS ***********/
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private Boolean motorEncendido = false;
    private int marchaActual;
    private int velocidadActual;
    
    
    /******** CONSTRUCTORES *******/
    
    
    public Coche () {
	this.motorEncendido = true;
    }
    
    
    public Coche (int velocidad, int marcha) {
	this.motorEncendido = true;
	this.velocidadActual = velocidad;
	this.marchaActual = marcha;
	
    }
    
    
    
    
    

}
