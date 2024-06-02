package Composants;

public abstract class Couche {
	protected int nbNeurones;
	protected Neurone[] neurones;
	
	public Couche(int nbNeurones, Neurone[] neurones) {
		this.nbNeurones = nbNeurones;
		this.neurones = neurones;
	}
	
}
