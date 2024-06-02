package Composants;

public class Echantillon {
	private static final int TAILLE_ECHANTILLON = 2;
	private double[] valeursEntree = new double[TAILLE_ECHANTILLON];
	private double valeurSortie;

	public double getValeurSortie() {
		return valeurSortie;
	}

	public Echantillon(double[] valeursEntree, double valeurSortie) {
		this.valeursEntree = valeursEntree;
		this.valeurSortie = valeurSortie;
	}

	public double[] getValeursEntree() {
		return valeursEntree;
	}
	
}
