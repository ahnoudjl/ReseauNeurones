package Composants;

public class NeuroneEntree extends Neurone{
	private double valeur;
	
	public NeuroneEntree(double[] poids) {
		super(poids, 0.0);
		
	}
	
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	
	public double[] calculValeurs() {
		double valeursEnvoie[] = new double[poids.length];
		for(int i=0; i < poids.length; i++) {
			valeursEnvoie[i] = valeur*poids[i];
		}
		return valeursEnvoie;
	}
}
