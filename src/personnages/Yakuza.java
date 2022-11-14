package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int nbReputation;
	public Yakuza(String nom, String boissonfavorite, int argent, String clan) {
		super(nom, boissonfavorite,  argent);
		this.clan = clan;
		this.nbReputation = 0;
	}
	public void extorquer(Commercant victime) {
		int local = victime.getArgent();
		argent += local;
		nbReputation += 1;
		victime.seFaireExtorquer();
		parler("Je viens d'extorquer " + local + " sous à " + victime.getNom());
		
	}
	public void perdre(Ronin ronin) {
		int var = argent;
		ronin.argent = ronin.argent + argent;
		argent = 0;
		nbReputation -= 1;
		parler("J'ai perdu " + var + " sous... J'ai déshonoré le clan de " + clan);
	}
	public void gagner(int gain, Ronin ronin) {
		ronin.argent = ronin.argent - gain;
		argent += gain;
		nbReputation += 1;
		parler("J'ai gagné " + gain + " sous! Gloire au clan "+ clan);
	}
	public int getReputation() {
		return nbReputation;
	}

}
