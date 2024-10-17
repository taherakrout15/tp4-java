package tp4;

public class Entreprise {

	public static void main(String[] args) {
		 Salarie[] tabSalarie = new Salarie[5];

	        tabSalarie[0] = new Employe(12345, "Walid", 2002, 15, 4);
	        tabSalarie[1] = new Vendeur(23445, "Yessine", 2007, 1000, 0.1);
	        tabSalarie[2] = new Vendeur(65478, "Nassime", 2000, 700, 0.1);
	        tabSalarie[3] = new Employe(87698, "Aymen", 2003, 19, 5);
	        tabSalarie[4] = new Employe(12345, "Khaled", 2008, 7, 4);
	        
	        System.out.println("********** Liste des Employés **********");
	        for (Salarie s : tabSalarie) {
	            if (s instanceof Employe) {
	                s.Affiche();
	            }
	        }
	        System.out.println("********** Liste des Vendeur **********");
	        for (Salarie s : tabSalarie) {
	            if (s instanceof Vendeur) {
	                s.Affiche();
	            }
	        }
	       
	        Salarie plusAncien = tabSalarie[0];
	        for (Salarie s : tabSalarie) {
	            if (s.getRecrutement() < plusAncien.getRecrutement()) {
	                plusAncien = s;
	            }
	        }
	        System.out.println("Le salarié le plus ancien est: " + plusAncien.getNom() + ", recruté en " + plusAncien.getRecrutement());

	        Vendeur meilleurVendeur = null;
	        double maxSalaire = 0;
	        for (Salarie s : tabSalarie) {
	            if (s instanceof Vendeur) {
	                double salaire = s.Salaire();
	                if (salaire > maxSalaire) {
	                    maxSalaire = salaire;
	                    meilleurVendeur = (Vendeur) s;
	                }
	            }
	        }
	        if (meilleurVendeur != null) {
	            System.out.println("Le vendeur avec le plus grand salaire est: " + meilleurVendeur.getMatricule() + " avec un salaire de " + maxSalaire + " Dt");
	        }
	    }

	        
	       
	
}

