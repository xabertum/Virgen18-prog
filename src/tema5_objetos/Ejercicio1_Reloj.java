/**
 * 
 */
package tema5_objetos;

/**
 * @author xabertum
 *
 */
public class Ejercicio1_Reloj {

    private int horas;
    private int minutos;
    private int segundos;
    private int pila;
    private boolean modo;
    private String franjaHoraria;

    /********** CONSTRUCTORES ********************/

    public Ejercicio1_Reloj() {
	this.pila = 10;
	this.modo = false;
	this.franjaHoraria = "AM";
    }

    public Ejercicio1_Reloj(int horas, int minutos, int segundos) {

	this.horas = horas;
	this.minutos = minutos;
	this.segundos = segundos;
	pila = 15;

    }

    /*********** GETTER & SETTERS ************/

    public int getHoras() {
	return horas;
    }

    public void setHoras(int horas) {
	this.horas = horas;
    }

    public int getMinutos() {
	return minutos;
    }

    public void setMinutos(int minutos) {
	this.minutos = minutos;
    }

    public int getSegundos() {
	return segundos;
    }

    public void setSegundos(int segundos) {
	this.segundos = segundos;
    }

    public int getPila() {
	return pila;
    }

    public void setPila(int pila) {
	this.pila = pila;
    }

    /*****************************************/

    public void avanzarReloj() {

	if (this.modo = false) {
	    this.segundos++;

	    if (this.segundos == 60) {
		this.segundos = 0;
		this.minutos++;
	    }

	    if (this.minutos == 60) {
		this.minutos = 0;
		this.horas++;
	    }

	    if (this.horas == 24) {
		this.horas = 0;
	    }

	    this.pila--;

	    try {
		Thread.sleep(1000);
	    } catch (Exception e) {
		// TODO: handle exception
	    }

	} else {
	    this.segundos++;

	    if (this.segundos == 60) {
		this.segundos = 0;
		this.minutos++;
	    }

	    if (this.minutos == 60) {
		this.minutos = 0;
		this.horas++;
	    }

	    if (this.horas == 13) {
		if (this.franjaHoraria.equals("AM"))
		    this.franjaHoraria = "PM";
		if (this.franjaHoraria.equals("PM"))
		    this.franjaHoraria = "AM";
		this.horas = 1;
	    }

	    this.pila--;

	    try {
		Thread.sleep(1000);
	    } catch (Exception e) {
		// TODO: handle exception
	    }

	}

    }

    /**
     * Override toString();
     */
    @Override
    public String toString() {

	String stringReloj;

	if (this.modo == false)
	    stringReloj = horas + ":" + minutos + ":" + segundos;
	else
	    stringReloj = horas + ":" + minutos + ":" + segundos + " " + this.franjaHoraria;

	return stringReloj;

    }

    /**
     * Recarga la pila
     */
    public void cargarPila() {
	this.pila = 15;
    }

    /**
     * 
     * @return
     */
    public boolean estaParado() {
	return (this.pila == 0);

    }

    public void cambiar12() {
	this.modo = true;
	if (this.horas > 12)
	    this.horas -= 12;
	this.franjaHoraria = "AM";

    }

    public void cambiar24() {
	this.modo = false;
	if (this.franjaHoraria.equals("PM"))
	    this.horas += 12;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
