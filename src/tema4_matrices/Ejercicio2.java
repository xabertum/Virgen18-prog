/**
 * 
 */

package tema4_matrices;
import java.util.Scanner;

/**
 * @author xabertum
 *
 */
public class Ejercicio2 {

    static void iniciarMatriz(int matriz[][]) {

	int cont = 1;

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		matriz[i][j] = cont;
		cont++;
	    }
	}
    }

    static void mostrarMatriz(int matriz[][]) {

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {

		System.out.print(matriz[i][j] + " ");

	    }

	    System.out.println("");
	}
    }
    
    
    static boolean buscarNumMatriz(int matriz [][], int num) {
	
	boolean isTrue = false;
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		
		if(matriz[i][j] == num) isTrue = true;
		
	    }
	}
		
	return isTrue;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		
	int matriz [][] = new int [3][3];
	
	iniciarMatriz(matriz);
	
	System.out.println("Introduce un numero: ");
	int num = scanner.nextInt();		
	
	System.out.println(buscarNumMatriz(matriz, num));
	mostrarMatriz(matriz);
	
	
    }

}
