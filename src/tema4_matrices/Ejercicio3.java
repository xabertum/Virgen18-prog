/**
 * 
 */
package tema4_matrices;


/**
 * @author xabertum
 *
 */
public class Ejercicio3 {

    /**
     * 
     * @param matriz
     */
    public static void inciarMatriz(int matriz[][]) {

	int cont = 1;
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		
		matriz[i][j] = cont;
		cont++;
				
	    }
	}
    }
    
    /**
     * 
     * @param matriz
     */
    public static void buscarEnMatriz(int matriz [][]) {
	
	int cont = 0;
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
			
		if (matriz[i][j]%2 == 0) cont++;
				
	    }
	}
	
	System.out.println("numeros pares: " + cont);
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) {

	int matriz [][] = new int [3][3];
	
	inciarMatriz(matriz);
	buscarEnMatriz(matriz);
	
		
	

    }

}
