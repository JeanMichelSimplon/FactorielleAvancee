package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle {
	public Factorielle() {
		super();
	}
	public static long calculer(long n) {
		if(n > 1){
			
			long resultat = n * calculer(n - 1);
			if(resultat < 0){
				throw new NonPositiveException("La factorielle de " + n + " n'existe pas, n doit être positif");
			}
			return resultat;
		}
		else if(n < 0){
			throw new IllegalArgumentException();					
		}
		return 1;
	}
}
