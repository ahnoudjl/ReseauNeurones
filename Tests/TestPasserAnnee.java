package Tests;

import Composants.CoucheHidden;
import Composants.CoucheInput;
import Composants.CoucheOutput;
import Composants.Echantillon;
import Composants.LotEchantillons;
import Composants.NeuroneEntree;
import Composants.NeuroneSortie;
import Composants.ReseauNeurones;

public class TestPasserAnnee {
	public static void main(String[] args) {
		
		//Initialisation des neurones
		NeuroneEntree neuroneE1 = new NeuroneEntree(new double[] {12});
		NeuroneEntree neuroneE2 = new NeuroneEntree(new double[] {16});
		NeuroneEntree neuroneE3 = new NeuroneEntree(new double[] {10});
		NeuroneEntree neuroneE4 = new NeuroneEntree(new double[] {8});
		NeuroneEntree neuroneE5 = new NeuroneEntree(new double[] {8});
		NeuroneEntree[] neuronesEntree = new NeuroneEntree[] {neuroneE1, neuroneE2, neuroneE3, neuroneE4, neuroneE5};
		NeuroneSortie neuroneS1 = new NeuroneSortie(560);
		NeuroneSortie[] neuronesSortie = new NeuroneSortie[] {neuroneS1};
		
		//Initialisation des couches 
		CoucheInput coucheEntree = new CoucheInput(neuronesEntree.length, neuronesEntree);
		CoucheOutput coucheSortie = new CoucheOutput(neuronesSortie.length, neuronesSortie);
		
		//Initialisation du réseau de neuronnes
		ReseauNeurones reseauNeurones = new ReseauNeurones(coucheEntree, coucheSortie, new CoucheHidden[0]);
		
	}
}


