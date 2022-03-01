package a;
/**
 * 
 * @author Axel
 * @since 01/03/2022
 * @version 1.0
 * 
 *
 */
public class Utilidad {

	/**
	 * 
	 * @param a
	 * @return el numero mas el factorial
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/**
	 * 
	 * @param n
	 * @return El factorial de un numero
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	/**
	 * @see Este metodo esta refactorizado
	 * @param a
	 * @param b
	 * @return resultado
	 */
	public boolean refactorizacionD(int a, int b) {
		// Calculo único
		int c = a + b;
		// Calculo único
		int d = c + 34;
		
		//Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		
		boolean resultado = !esPrimo;
		return (resultado);
	}
	
}


