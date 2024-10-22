package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof",54,"kombucha");
		prof.parler("J'ai "+prof.getArgent()+" sous en poche. Je vais pouvoir m'offir une boisson à 12 sous \n");
	}

}
