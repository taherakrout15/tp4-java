package tp4;

public class Employe extends Salarie  {
	private double hsupp;
	private double phsupp;

	    public Employe(int matricule, String nom, int recrutement, double hsupp, double phsupp) {
	        super(matricule, nom, recrutement);
	        this.hsupp = hsupp;
	        this.phsupp = phsupp;
	    }

	    public double getHsupp() {
	        return hsupp;
	    }

	    public void setHsupp(double hsupp) {
	        this.hsupp = hsupp;
	    }

	    public double getPhsupp() {
	        return phsupp;
	    }

	    public void setPhsupp(double phsupp) {
	        this.phsupp = phsupp;
	    }
	    @Override
	    public void Affiche() {
	        super.Affiche();
	        System.out.println("Heures supplémentaires: " + hsupp + ", Prix par heure supplémentaire: " + phsupp);
	    }
	    @Override
	    public double Salaire() {
	        return super.Salaire() + (hsupp * phsupp);
	    }
	}


