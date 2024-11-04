package personnages;

public class Humain {
	private String nom;
	protected int argent;
	protected String boisson;

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
		argent+=gain;
	}

	protected void perdreArgent(int perte) {
		argent-=perte;
	}

	public void acheter(String bien, int prix) {
		if (prix>argent) {
			parler("Je n'ai plus que "+ getArgent()+
					" sous en poche. Je ne peux même pas m'offrir un "+ bien+ " à "+ prix);
		}else {
		perdreArgent(prix);
		parler("J'ai "+getArgent()+" sous en poche. Je vais pouvoir m'offir un ");
		}
	}
	
	public void parler(String texte) {
		System.out.println("("+nom+")"+" - "+texte);
	}

	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

}
