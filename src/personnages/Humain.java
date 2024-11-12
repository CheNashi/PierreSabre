package personnages;

public class Humain {
	private String nom;
	private int argent;
	protected String boisson;
	protected int nbConnaissance;
	static int maxMemoire = 3;
	protected Humain[] memoire = new Humain[maxMemoire];

	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour, je m'appelle " + getNom() + " et j'aime boire du " + getBoisson());

	}

	public void boire() {
		parler("Mmmm, un bon verre de " + getBoisson() + " ! GLOUPS !");
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à "
					+ prix);
		} else {
			perdreArgent(prix);
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offir un ");
		}
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")" + " - " + texte);
	}

	private void memoriser(Humain humain) {
		nbConnaissance++;
		if (nbConnaissance >= maxMemoire) {
			for (int i = 0; i < maxMemoire - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[maxMemoire - 1] = humain;
		} else {
			memoire[nbConnaissance] = humain;
		}
	}

	private void repondre(Humain humain) {
		humain.direBonjour();
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(autreHumain);
		memoriser(autreHumain);
		autreHumain.memoriser(this);
	}

	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance-1; i++) {
			if (memoire[i] != null) {
				System.out.println(memoire[i].getNom());
			}
		}
	}

}
