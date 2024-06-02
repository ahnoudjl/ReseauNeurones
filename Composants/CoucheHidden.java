package Composants;

public class CoucheHidden extends Couche{ 
	public CoucheHidden(int nbNeurones, Neurone[] neurones) {
		super(nbNeurones, neurones);
	}

	public int getNbNeurones() {
		return this.nbNeurones;
	}

	public double[] valeurProchaineCouche(int nbNeuronesPCouche, double[] valeurs) {
		double valeursNeuronesEntree[][] = new double[nbNeurones][nbNeuronesPCouche];
		//Mise en commun des resultats des neuronnes de la couche
		for(int i=0; i<nbNeurones; i++) {
			if (neurones[i] instanceof NeuroneCache) {
                NeuroneCache neuroneCache = (NeuroneCache) neurones[i];
                valeursNeuronesEntree[i] = neuroneCache.calculValeurs(valeurs[i]);
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
