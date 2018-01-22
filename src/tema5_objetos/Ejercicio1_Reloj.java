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
        
    
    public Ejercicio1_Reloj (int horas, int minutos, int segundos) {
	
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
    

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
