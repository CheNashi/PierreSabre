package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;


public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco= new Commercant("Marco",20);
		Commercant chonin= new Commercant("Chonin",40);
		Commercant kumi= new Commercant("Kumi",10);
		Yakuza yaku= new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		Ronin roro= new Ronin("Roro", 60, "shoshu");
		
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(roro);
		
		System.out.println("\n");
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
	}
}
	