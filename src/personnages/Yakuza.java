package personnages;

public class Yakuza extends Humain {
	private int reputation=0;
	private String clan;

	public Yakuza(String nom, int argent,String boisson,String clan) {
		super(nom,argent,boisson);
		this.clan=clan;
	}
	public int getReputation() {
		return reputation;
	}
	public String getClan() {
		return clan;
	}
	
	public void extorquer(Commercant commercant){
		argent+=commercant.argent;
		int argentCommercant=commercant.getArgent();
		reputation+=1;
		parler("J'ai piqué les "+argentCommercant+" de "+commercant.getNom()+
				" ,ce qui me fait "+ getArgent()+ " sous dans ma poche HI! HI!");
		commercant.perdreArgent(argentCommercant);
	}
	
	public int perdre() {
		parler("J’ai perdu mon duel et mes "+ getArgent() +" sous, snif . J'ai déshonoré le clan de "+getClan());
		perdreArgent(argent);
		reputation-=1;
		return argent;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+getNom() +" du clan de "+getClan()+" ? Je l'ai dépouillé "
				+ "de ses "+ gain + " sous.");
	}

}
