package tp4;

public class Vendeur extends Salarie {
	private double vente;
    private double pourcentage;

    public Vendeur(int matricule, String nom, int recrutement, double vente, double pourcentage) {
        super(matricule, nom, recrutement);
        this.vente = vente;
        this.pourcentage = pourcentage;
    }

    public double getVente() {
        return vente;
    }

    public void setVente(double vente) {
        this.vente = vente;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    @Override
    public void Affiche() {
        super.Affiche();
        System.out.println("Ventes: " + vente + ", Pourcentage: " + pourcentage);
    }

    @Override
    public double Salaire() {
        return super.Salaire() + (vente * pourcentage);
    }


}
