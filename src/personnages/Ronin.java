package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}

	public int getHonneur() {
		return honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		parler(beneficiaire.getNom() + " prend ces "+argent/10+" sous");
		beneficiaire.recevoir(argent/10);
	}
}
