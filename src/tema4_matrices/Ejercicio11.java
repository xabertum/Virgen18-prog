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

		if (i == j)
		    resultado[0] += matriz[i][j];

		if (i + j == matriz.length - 1)
		    resultado[1] += matriz[i][j];

	    }
	}

	return resultado;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	int matriz [][] = new int [3][3];
	
	inciarMatriz(matriz);
	mostrarMatriz(matriz);
	
	System.out.println("Suma diagonal principal: " + sumarDiagonalesMatriz(matriz)[0]);
	System.out.println("Suma diagonal secundaria: " + sumarDiagonalesMatriz(matriz)[1]);
	
    }

}
