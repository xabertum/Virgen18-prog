/**
 * 
 */
package tema5_objetos.Ejercicio3_coche;

/**
 * @author xabertum
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Coche oCoche1 = new Coche();
	Coche oCoche2 = new Coche(50, 4);
	
	System.out.println(oCoche1.getMotorEncendido());
	
	System.out.println(oCoche2.getMotorEncendido());
	

    }

}
