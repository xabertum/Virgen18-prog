/**
 * 
 */
package tema4_matrices;

/**
 * @author xabertum
 *
 */
public class Ejercicio1 {

    static void iniciarMatriz(int matriz[][]) throws Exception {
	int cont = 1;

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		matriz[i][j] = cont;
		cont++;
	    }
	}

    }

    static void mostrarMatriz(int matriz[][]) throws Exception {
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		System.out.print(matriz[i][j] + " ");
	    }
	    System.out.println("");
	}
    }

    static int[][] sumarMatrizes(int matriz1[][], int matriz2[][]) throws Exception {

	int matrizSuma[][] = new int[matriz1.length][matriz2.length];

	for (int i = 0; i < matrizSuma.length; i++) {
	    for (int j = 0; j < matrizSuma[i].length; j++) {

		matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];

	    }
	}

	return matrizSuma;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	int matriz1[][] = new int[3][3];
	int matriz2[][] = new int[3][3];

	try {
	    iniciarMatriz(matriz1);
	    iniciarMatriz(matriz2);
	    mostrarMatriz(sumarMatrizes(matriz1, matriz2));

	} catch (Exception e) {
	    
	    System.out.println("Matrices de diferente dimension");
	}

    }

}
