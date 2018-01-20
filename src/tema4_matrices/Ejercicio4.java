/**
 * 
 */
package tema4_matrices;

/**
 * @author xabertum
 *
 */
public class Ejercicio4 {

    public static void iniciarMatriz(int matriz[][]) {
	int cont = 1;

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		matriz[i][j] = cont;
		cont++;
	    }
	}
    }

    public static int[] sumarPares(int matriz[][]) {

	int suma[] = new int [2];
	int cont = 0;
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {

		if (matriz[i][j] % 2 == 0) {
		    suma[0] += matriz[i][j];
		    cont++;
		}
	    }
	}	
	
	suma[1] = suma[0]/cont;
	
	return suma;
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) {
	int matriz[][] = new int[3][3];
	int resultado [] = new int [2];	
	iniciarMatriz(matriz);
	
	resultado = sumarPares(matriz);
	
	System.out.println("La suma de los numeros pares es: " + resultado[0]);
	System.out.println("El promedio de los numeros pares es: " + resultado[1]);
	
    }

}
