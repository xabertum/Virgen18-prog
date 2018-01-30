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
	System.out.println("Introduce tiempo de velocidad crucero");
	int tiempo = scanner.nextInt();
	scanner.close();

	oCoche1.arranca();

	do {

	    oCoche1.simulacionAcelera(velocidad_usuario);
	    System.out.println(oCoche1);

	    try {
		Thread.sleep(1000);
	    } catch (Exception e) {
		// TODO: handle exception
	    }

	} while (oCoche1.getVelocidadActual() < velocidad_usuario);

	System.out.println("VELOCIDAD DE CRUCERO...	");
	try {
	    Thread.sleep(tiempo);
	} catch (Exception e) {
	    // TODO: handle exception
	}

	do {

	    oCoche1.simulacionDesAcelera(velocidad_usuario);
	    System.out.println(oCoche1);

	    try {
		Thread.sleep(1000);
	    } catch (Exception e) {
		// TODO: handle exception
	    }

	} while (oCoche1.getVelocidadActual() > 0);
	
	
	oCoche1.puntoMuerto();
	System.out.println("PARADA Y PUNTO MUERTO...");
	System.out.println(oCoche1);

    }

}
