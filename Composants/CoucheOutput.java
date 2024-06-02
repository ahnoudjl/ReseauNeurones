package Composants;

public class CoucheOutput extends Couche{
	public CoucheOutput(int nbNeurones, Neurone[] neurones) {
		super(nbNeurones, neurones);
	}

	public int getNbNeurones() {
		return this.nbNeurones;
	}
	
	public void afficherResultat(double[] valeurs) {
		System.out.println("Resultat après process:\n");
		for(int i=0; i<nbNeurones; i++) {
			if (neurones[i] instanceof NeuroneSortie) {
                NeuroneSortie neuroneSortie = (NeuroneSortie) neurones[i];
                neuroneSortie.afficherResultat(valeurs[i]);
            }
		}
	}

}

