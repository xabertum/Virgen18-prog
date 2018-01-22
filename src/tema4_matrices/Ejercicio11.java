/**
 * 
 */
package tema4_matrices;

/**
 * @author xabertum
 *
 */
public class Ejercicio11 {

    public static void inciarMatriz(int matriz[][]) {
	int cont = 1;

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		matriz[i][j] = cont;
		cont++;
	    }
	}
    }

    public static void mostrarMatriz(int matriz[][]) {
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {

		System.out.print(matriz[i][j] + " ");
	    }

	    System.out.println("");
	}

    }

    public static int[] sumarDiagonalesMatriz(int matriz[][]) {

	int resultado[] = new int[2];

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		
		
		
	    }
	}
	
	
	
	
	
	return resultado;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

}
