/**
 * 
 */
package tema4_matrices;

/**
 * @author xabertum
 *
 */
public class Ejercicio5 {

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

    public static int[] minMaxMatriz(int matriz[][]) {
	int minMax[] = new int[2];

	minMax[0] = matriz[0][0];

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {

		if (matriz[i][j] > minMax[0])
		    minMax[1] = matriz[i][j];
		else {
		    matriz[i][j] = minMax[0];
		}
	    }
	}

	return minMax;

    }

    public static int media(int matriz[][]) {
	int media = 0;
	int cont = 0;

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		media += matriz[i][j];
		cont++;
	    }
	}

	return media / cont;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	int matriz[][] = new int[3][3];
	int minMaxMatriz[] = new int[2];

	inciarMatriz(matriz);
	mostrarMatriz(matriz);

	minMaxMatriz = minMaxMatriz(matriz);
	
	System.out.println("El maximo es: " + minMaxMatriz[1]);
	System.out.println("El minimo es: " + minMaxMatriz[0]);
	System.out.println("La media de la matriz es: " + media(matriz));

    }

}
