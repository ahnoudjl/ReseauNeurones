package Tests;

import Composants.CoucheHidden;
import Composants.CoucheInput;
import Composants.CoucheOutput;
import Composants.Echantillon;
import Composants.LotEchantillons;
import Composants.NeuroneCache;
import Composants.NeuroneEntree;
import Composants.NeuroneSortie;
import Composants.ReseauNeurones;

public class TestMention {
	public static void main(String[] args) {
			
		//Initialisation des neurones
		NeuroneEntree neuroneE1 = new NeuroneEntree(new double[] {12, 12, 12, 12});
		NeuroneEntree neuroneE2 = new NeuroneEntree(new double[] {16, 16, 16, 16});
		NeuroneEntree neuroneE3 = new NeuroneEntree(new double[] {10, 10, 10, 10});
		NeuroneEntree neuroneE4 = new NeuroneEntree(new double[] {8, 8, 8, 8});
		NeuroneEntree neuroneE5 = new NeuroneEntree(new double[] {8, 8, 8, 8});
		NeuroneEntree[] neuronesEntree = new NeuroneEntree[] {neuroneE1, neuroneE2, neuroneE3, neuroneE4, neuroneE5};
		NeuroneCache neuroneC1 = new NeuroneCache(new double[] {-1, 1, 1, 0, 0, 0, 0, 0}, 539);
		NeuroneCache neuroneC2 = new NeuroneCache(new double[] {0, 1, 1, 1, 1, 0, 0, 0}, 647);
		NeuroneCache neuroneC3 = new NeuroneCache(new double[] {0, 0, 0, 1, 1, 1, 1, 0}, 755);
		NeuroneCache neuroneC4 = new NeuroneCache(new double[] {0, 0, 0, 0, 0, 1, 1, 1}, 863);
		NeuroneCache[] neuronesCachees1 = new NeuroneCache[] {neuroneC1, neuroneC2, neuroneC3, neuroneC4};
		NeuroneCache neuroneC5 = new NeuroneCache(new double[] {1, 0, 0, 0, 0}, -1);
		NeuroneCache neuroneC6 = new NeuroneCache(new double[] {0, 1, 0, 0, 0}, 0);
		NeuroneCache neuroneC7 = new NeuroneCache(new double[] {0, -2, 0, 0, 0}, 1);
		NeuroneCache neuroneC8 = new NeuroneCache(new double[] {0, 0, 1, 0, 0}, 0);
		NeuroneCache neuroneC9 = new NeuroneCache(new double[] {0, 0, -2, 0, 0}, 1);
		NeuroneCache neuroneC10 = new NeuroneCache(new double[] {0, 0, 0, 1, 0}, 0);
		NeuroneCache neuroneC11 = new NeuroneCache(new double[] {0, 0, 0, -2, 0}, 1);
		NeuroneCache neuroneC12 = new NeuroneCache(new double[] {0, 0, 0, 0, 1}, 0);
		NeuroneCache[] neuronesCachees2 = new NeuroneCache[] {neuroneC5, neuroneC6, neuroneC7, neuroneC8, neuroneC9, neuroneC10, neuroneC11, neuroneC12};
		NeuroneSortie neuroneS1 = new NeuroneSortie(0);
		NeuroneSortie neuroneS2 = new NeuroneSortie(0);
		NeuroneSortie neuroneS3 = new NeuroneSortie(0);
		NeuroneSortie neuroneS4 = new NeuroneSortie(0);
		NeuroneSortie neuroneS5 = new NeuroneSortie(0);
		NeuroneSortie[] neuronesSortie = new NeuroneSortie[] {neuroneS1, neuroneS2, neuroneS3, neuroneS4, neuroneS5};
		
		//Initialisation des couches 
		CoucheInput coucheEntree = new CoucheInput(neuronesEntree.length, neuronesEntree);
		CoucheHidden coucheCachee1 = new CoucheHidden(neuronesCachees1.length, neuronesCachees1);
		CoucheHidden coucheCachee2 = new CoucheHidden(neuronesCachees2.length, neuronesCachees2);
		CoucheHidden[] couchesCachees = new CoucheHidden[] {coucheCachee1, coucheCachee2};
		CoucheOutput coucheSortie = new CoucheOutput(neuronesSortie.length, neuronesSortie);
		
		//Initialisation du réseau de neuronnes
		ReseauNeurones reseauNeurones = new ReseauNeurones(coucheEntree, coucheSortie, couchesCachees);
		
		neuroneE1.setValeur(11);
		neuroneE2.setValeur(11);
		neuroneE3.setValeur(11);
		neuroneE4.setValeur(11);
		neuroneE5.setValeur(11);

		// 0, 14, 20
		
		reseauNeurones.simulation();
	}
}