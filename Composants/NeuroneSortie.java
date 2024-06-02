package Composants;

public class NeuroneSortie extends Neurone{
	
	public NeuroneSortie( double biais) {
		super(null, biais);
	}

	public void afficherResultat(double valeur) {
		//Fonction ReLU
		if(not (ReLU(valeur-biais))) {
			System.out.println("1\n");
		} else {
			System.out.println("0\n");
		}
		
	}
	
	public double ReLU(double valeur) {
		if(valeur<0) {
			return 0.0;
		} else {
			return valeur;
		}
	
}
