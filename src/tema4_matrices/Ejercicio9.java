/**
 * 
 */
package tema4_matrices;

/**
 * @author xabertum
 *
 */
public class Ejercicio9 {

    public static void iniciarMatriz(int matriz[][]) {

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

    public static int[][] sumarMatriz(int matriz[][]) {

	int matrizSuma[][] = new int[matriz.length + 1][matriz.length + 1];
	int sumaFila[] = new int[matriz.length];
	int sumaColum[] = new int[matriz.length];

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {

		matrizSuma[i][j] = matriz[i][j];

		sumaFila[i] += matriz[i][j];
		sumaColum[i] += matriz[j][i];

		matrizSuma[i][matriz.length] = sumaFila[i];
		matrizSuma[matriz.length][i] = sumaColum[i];
	    }

	}

	return matrizSuma;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	int matriz[][] = new int[3][3];

	iniciarMatriz(matriz);
	mostrarMatriz(matriz);

	System.out.println("");
	mostrarMatriz(sumarMatriz(matriz));

    }

}
