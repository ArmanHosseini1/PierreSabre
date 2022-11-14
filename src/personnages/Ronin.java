package personnages;

public class Ronin extends Humain{
	private int nbHonneur;
	public Ronin(String nom, String boissonfavorite, int argent) {
		super(nom, boissonfavorite,  argent);
		this.nbHonneur = 1;
	}
	public void donner(Commercant beneficiaire) {
		int don = (int) 0.1*argent;
		parler(beneficiaire + " Prends ces " + don + " sous!");
		beneficiaire.recevoirArgent(don);
	}
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, je vais te faire payer pour ce que tu as fait à ce pauvre marchand!");
		int force = (int) 2*nbHonneur;
		if (force >= adversaire.getReputation()) {
			parler("J'ai détruit ce petit Yakuza!");
			adversaire.perdre(this);
		}
		else {
			parler("Et mince...");
			adversaire.gagner(argent, this);
		}
	}
}
