package Composants;

public class CoucheInput extends Couche{	
	public CoucheInput(int nbNeurones, Neurone[] neurones) {
		super(nbNeurones, neurones);
	}

	public int getNbNeurones() {
		return this.nbNeurones;
	}

	public double[] valeurProchaineCouche(int nbNeuronesPCouche) {
		double valeursNeuronesEntree[][] = new double[nbNeurones][nbNeuronesPCouche];
		//Mise en commun des resultats des neuronnes de la couche
		for(int i=0; i<nbNeurones; i++) {
			if (neurones[i] instanceof NeuroneEntree) {
                NeuroneEntree neuroneEntree = (NeuroneEntree) neurones[i];
                valeursNeuronesEntree[i] = neuroneEntree.calculValeurs();
            }
		}
		double valeursNeuronesSortie[] = new double[nbNeuronesPCouche];
		//Mise en forme des résultats pour la prochaine couche
		for(int i=0; i<nbNeuronesPCouche; i++) {
			valeursNeuronesSortie[i] = 0;
		}
		for(int i=0; i<nbNeuronesPCouche; i++) {
			for (int j=0; j<nbNeurones; j++) {
				valeursNeuronesSortie[i] += valeursNeuronesEntree[j][i];
			}
		}
		return valeursNeuronesSortie;
	}



}