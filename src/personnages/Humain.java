package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public int getArgent() {
		return argent;
	}

	private String direBonjour() {
		return "Bonjour, je m'appelle " + getNom() + " et j'aime boire du " + getBoisson()+"\n";

	}

	private String boire() {
		return "Mmmm, un bon verre de " + getBoisson() + " ! GLOUPS ! \n";
	}

	private void gagnerArgent(int gain) {
		argent+=gain;
	}

	private void perdreArgent(int perte) {
		argent-=perte;
	}

	public void acheter(String bien, int prix) {
		perdreArgent(prix);
		System.out.println(getNom() + " a acheté " + bien + " à " + prix + " il a maintenant " + argent + " euros");
	}

	public void parler(String texte) {
		System.out.println(direBonjour() +texte +boire() );
	}

	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

}
