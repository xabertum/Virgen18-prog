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

    public static int sumarPares(int matriz[][]) {

	int suma = 0;
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {

		if (matriz[i][j] % 2 == 0) {
		    suma += matriz[i][j];
		}
	    }
	}	
	
	return suma;
    }
    
    
    public static int promedioPares(int matriz [][]) {
		
	int suma = 0;
	int cont = 0;
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
				
		if (matriz[i][j] %2 == 0) {
		    suma = suma + matriz[i][j];
		    cont++;		    		    
		} 
	    }
	}
	
	return suma/cont;	
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) {
	int matriz[][] = new int[3][3];
		
	iniciarMatriz(matriz);
	
	System.out.println("La suma de los numeros pares es: " + sumarPares(matriz));
	System.out.println("La media es: " + promedioPares(matriz));
    }

}
