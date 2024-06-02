package Composants;

public class NeuroneCache extends Neurone{

	public NeuroneCache(double[] poids, double biais) {
		super(poids, biais);
	}
	
	public double[] calculValeurs(double valeur) {
		//Tableau des valeurs à envoyer
		double valeursEnvoie[] = new double[poids.length];
		double valeurActuelle;
		for(int i=0; i < poids.length; i++) {
			//Application de la fonction ReLU
			valeurActuelle = ReLU(valeur-biais);
			//Calcul de la valeur à envoyer
			valeursEnvoie[i] = valeurActuelle*poids[i];
		}
		return valeursEnvoie;
	}
	
	public double ReLU(double valeur) {
		if(valeur<0) {
			return 0.0;
		} else {
			return valeur;
		}
	}
}
