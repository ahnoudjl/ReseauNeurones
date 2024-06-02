package Composants;

public abstract class Neurone {
	protected double[] poids;
	protected double biais;
	
	public Neurone(double[] poids, double biais) {
		this.poids = poids;
		this.biais = biais;
	}
	
}
