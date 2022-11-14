package personnages;

public class Humain {
	private String nom;
	private String boissonfavorite;
	protected int argent;
	public Humain(String nom, String boissonfavorite, int argent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = 0;
	}
	public String getNom(){
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	protected void parler(String texte) {
		System.out.println(nom + " : - " + texte);
	}
	public void direBonjour() {
		parler("Bonjour, je m'appelle "+ nom + " et ma boisson préférée est " + boissonfavorite);
	}
	public void boire() {
		parler("Mmmh... du " + boissonfavorite);
	}
	public void acheter(String bien, int prix) {
		if (argent > prix) {
			parler("J'ai "+ argent + " sous en poche, je peux m'appeler un " + bien);
			argent -= prix;
		}
		else
			parler("Je n'ai plus que "+ argent + " sous, je ne peux même pas m'acheter un " + bien);
	}
	public void gagnerargent(int gain) {
		argent += gain;
	}
	public void perdreargent(int perte) {
		argent -= perte;
	}
	}
	
