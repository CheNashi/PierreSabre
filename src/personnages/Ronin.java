package personnages;

public class Ronin extends Humain {

	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);

	}

	public int getHonneur() {
		return honneur;
	}

	public void donner(Commercant beneficiaire) {
		int argent = getArgent();
		parler(beneficiaire.getNom() + " prend ces " + argent / 10 + " sous");
		beneficiaire.recevoir(argent / 10);
		perdreArgent(argent/10);
	}

	public void provoquer(Yakuza adversaire) {
		if (getHonneur() * 2 >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
			honneur ++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur --;
			adversaire.gagner(getArgent());
		}
	}
}
