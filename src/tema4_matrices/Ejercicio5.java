/**
 * 
 */
package tema4_matrices;


/**
 * @author xabertum
 *
 */
public class Ejercicio5 {

    public static void inciarMatriz(int matriz [][]) {
	
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
    
    
    
    
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	
	int matriz [][] = new int [3][3];
	
	inciarMatriz(matriz);
	mostrarMatriz(matriz);
	

    }

}
