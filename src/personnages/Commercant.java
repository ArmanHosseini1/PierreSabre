package personnages;

public class Commercant extends Humain {
	private String boissonfavorite = "thé";
	public Commercant(String nom, int argent) {
		super(nom, "thé",  argent);
	}
	public void seFaireExtorquer() {
		parler("Le monde est vraiment trop injuste!");
		argent = 0;
	}
	public void recevoirArgent(int ArgentRecu) {
		argent += ArgentRecu;
		parler(ArgentRecu + " sous, Merci pour cet argent ronin!");
	}
	

}
