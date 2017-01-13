package co.simplon.factorielle;

public class EcrireArguments {
	public static void main(String[] args) {
		Factorielle fact = new Factorielle();
		long in;
		try {
			in = Long.parseLong(args[0]);
		} catch (NumberFormatException Excp0) {
			System.out
					.println("Cas erreur 1 - NumberFormatException : Le calcul du factorielle de "
							+ args[0] + " n'est pas possible ");
			return;
		}
		in = Long.parseLong(args[0]);
		try {
			Long resultat = Factorielle.calculer(in);
			System.out.println("Cas passant - Le factorielle de " + args[0]
					+ " = " + resultat);
		} catch (IllegalArgumentException Excep1) {
			System.out
					.println("Cas erreur 2 - IllegalArgumentException : Le Factorielle de "
							+ args[0] + " N'est pas convertible en Long");
		} catch (NonPositiveException Excep2) {
			System.out
					.println("Cas erreur 3 - NonPositiveException : Le Factorielle de "
							+ args[0] + " pose problème");
		}
	}
}