/**
 * 
 */
package tema4_matrices;

/**
 * @author xabertum
 *
 */
public class Ejercicio7 {

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
    
    public static int [] maxFilas(int matriz [][]) {
	int max [] = new int [3];
	max[0] = matriz[0][0];
	
	for (int i = 0; i < matriz.length; i++) {	    
	    for (int j = 0; j < matriz[i].length; j++) {
		
		if (matriz[0][j] > max[0]) max[0] = matriz[0][j];
		if (matriz[1][j] > max[0]) max[1] = matriz[1][j];
		if (matriz[2][j] > max[0]) max[2] = matriz[2][j];
	    }
	}
	
	return max;	
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) {
	int matriz [][] = new int [3][3];
	int resultadoMaxFila [] = new int [3];
		
	iniciarMatriz(matriz);
	mostrarMatriz(matriz);
	
	resultadoMaxFila = maxFilas(matriz);
	
	System.out.println("El maximo de la fila 1 es: " + resultadoMaxFila[0]);
	System.out.println("El maximo de la fila 2 es: " + resultadoMaxFila[1]);
	System.out.println("El maximo de la fila 3 es: " + resultadoMaxFila[2]);
	

    }

}
