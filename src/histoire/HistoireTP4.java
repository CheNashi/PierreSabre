package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof",54,"kombucha");
		prof.direBonjour();
		prof.parler("J'ai "+ prof.getArgent()+" sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
		prof.boire();
		prof.acheter("kombucha", 12); 
		System.out.println("jeu à 2 sous");
		prof.acheter("kimono", 50);
		
		System.out.println("\n");
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println("\n");
		
		Yakuza yaku = new Yakuza("Yaku le Noir",30, "whisky","Warsong");
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.parler(marco.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		yaku.extorquer(marco);
		
		System.out.println("\n");
		
		Ronin roro= new Ronin("Roro",60,"shochu");
		roro.direBonjour();
		roro.donner(marco);
		yaku.extorquer(marco);
		roro.provoquer(yaku);
	}

}
