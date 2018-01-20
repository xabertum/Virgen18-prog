/**
 * 
 */
package tema4_matrices;

/**
 * @author xabertum
 *
 */
public class Ejercicio4 {
    
    public static void iniciarMatriz (int matriz [][]) {
	int cont = 1;
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		matriz[i][j] = cont;
		cont++;		
	    }
	}
    }
    
    
    
    
    

    /**
     * @param args
     */
    public static void main(String[] args) {
	int matriz[][] = new int [3][3];
	iniciarMatriz(matriz);
	
	

    }

}
