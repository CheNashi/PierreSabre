package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent,"thé");

	}
	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste.");
		int argentExtorquer=getArgent();
		perdreArgent(argentExtorquer);
		return argentExtorquer;
	}
	public void recevoir(int donation) {
		gagnerArgent(donation);
		parler(donation+" sous ! Je te remercie généreux donateur!");
}
}
