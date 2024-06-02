package Composants;


public class ReseauNeurones {
	private CoucheInput coucheEntree;
	private CoucheOutput coucheSortie;
	private CoucheHidden[] coucheCachees;
	
	public ReseauNeurones(CoucheInput coucheEntree, CoucheOutput coucheSortie, CoucheHidden[] coucheCachees) {
		this.coucheEntree = coucheEntree;
		this.coucheSortie = coucheSortie;
		this.coucheCachees = coucheCachees;
	}
	
	public void simulation() {
		//Cas où il n'y a qu'une couche cachée
		if (coucheCachees.length == 1) {
			double[] valeursSuivantes = new double[maxTailleCouche()];
			valeursSuivantes = coucheEntree.valeurProchaineCouche(coucheCachees[0].getNbNeurones());
			valeursSuivantes = coucheCachees[0].valeurProchaineCouche(coucheSortie.getNbNeurones(), valeursSuivantes);
			coucheSortie.afficherResultat(valeursSuivantes);
		//Cas où il y'a plusieurs couches cachées
		} else if(coucheCachees.length>1) {
			double[] valeursSuivantes = new double[maxTailleCouche()];
			valeursSuivantes = coucheEntree.valeurProchaineCouche(coucheCachees[0].getNbNeurones());
			valeursSuivantes = coucheCachees[0].valeurProchaineCouche(coucheCachees[1].getNbNeurones(), valeursSuivantes);
			for(int i=1; i<coucheCachees.length-1; i++){
				valeursSuivantes = coucheCachees[i].valeurProchaineCouche(coucheCachees[i+1].getNbNeurones(), valeursSuivantes);
			}
			valeursSuivantes = coucheCachees[coucheCachees.length-1].valeurProchaineCouche(coucheSortie.getNbNeurones(), valeursSuivantes);
			coucheSortie.afficherResultat(valeursSuivantes);
		//Cas où il n'y a pas de couche cachée
		} else {
			coucheSortie.afficherResultat(coucheEntree.valeurProchaineCouche(coucheSortie.getNbNeurones()));
		}
	}
	
	// Calcul de la plus haute taille de couche
	public int maxTailleCouche() {
		int max = coucheEntree.getNbNeurones();
		if(max<coucheSortie.getNbNeurones()) {
			max = coucheSortie.getNbNeurones();
		}
		if (coucheCachees.length>0) {
			for(int i=0; i<coucheCachees.length; i++) {
				if(max<coucheCachees[i].getNbNeurones()) {
					max = coucheCachees[i].getNbNeurones();
				}
			}
		}
		return max;
	}
}
