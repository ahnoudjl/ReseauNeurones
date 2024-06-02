package Tests;

import Composants.CoucheHidden;
import Composants.CoucheInput;
import Composants.CoucheOutput;
import Composants.Echantillon;
import Composants.LotEchantillons;
import Composants.NeuroneEntree;
import Composants.NeuroneSortie;
import Composants.ReseauNeurones;

public class TestPorteLogiqueOr {
	public static void main(String[] args) {
		//Initialisation des échantillons
		Echantillon echantillon1 = new Echantillon(new double[]{0,0},0);
		Echantillon echantillon2 = new Echantillon(new double[]{0,1},1);
		Echantillon echantillon3 = new Echantillon(new double[]{1,0},1);
		Echantillon echantillon4 = new Echantillon(new double[]{1,1},1);
		Echantillon[] echantillons = new Echantillon[] {echantillon1, echantillon2, echantillon3, echantillon4};
		LotEchantillons lotEchantillons = new LotEchantillons(echantillons);
		
		//Initialisation des neurones
		NeuroneEntree neuroneE1 = new NeuroneEntree(new double[] {1});
		NeuroneEntree neuroneE2 = new NeuroneEntree(new double[] {1});
		NeuroneEntree[] neuronesEntree = new NeuroneEntree[] {neuroneE1, neuroneE2};
		NeuroneSortie neuroneS1 = new NeuroneSortie(0);
		NeuroneSortie[] neuronesSortie = new NeuroneSortie[] {neuroneS1};
		
		//Initialisation des couches
		CoucheInput coucheEntree = new CoucheInput(2, neuronesEntree);
		CoucheOutput coucheSortie = new CoucheOutput(1, neuronesSortie);
		
		//Initialisation du réseau de neuronnes
		ReseauNeurones reseauNeurones = new ReseauNeurones(coucheEntree, coucheSortie, new CoucheHidden[0]);
		
		//Lancement du test 
		for(int i=0; i<lotEchantillons.getEchantillons().length; i++) {
			neuroneE1.setValeur(lotEchantillons.getEchantillons()[i].getValeursEntree()[0]);
			neuroneE2.setValeur(lotEchantillons.getEchantillons()[i].getValeursEntree()[1]);
			reseauNeurones.simulation();
			System.out.println("Resultat attendu:\n" + lotEchantillons.getEchantillons()[i].getValeurSortie());
		}
	}
}
