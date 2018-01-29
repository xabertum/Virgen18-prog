/**
 * 
 */
package tema5_objetos.Ejercicio3_coche;

import java.util.Scanner;

/**
 * @author xabertum
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Coche oCoche1 = new Coche();
	
	System.out.println("Introduce velocidad final: ");
	int velocidad_usuario = scanner.nextInt();
	scanner.close();
		
	oCoche1.arranca();
		
	oCoche1.simulacion(velocidad_usuario);
	
	System.out.println(oCoche1.getMotorEncendido());
	
	
	

    }

}
