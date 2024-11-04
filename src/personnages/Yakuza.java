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
		reputation+=1;
		parler("J'ai piqué les "+commercant.getArgent()+" de "+commercant.getNom()+
				" ,ce qui me fait "+ getArgent()+ " sous dans ma poche HI! HI!");
	}
	

}
