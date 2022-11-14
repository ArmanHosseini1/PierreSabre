package histoire;

import personnages.Ronin;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String args[]) {
		Ronin roro = new Ronin("roro", "ocaml", 5);
		Yakuza Yaku = new Yakuza("Yaku le noir", "sabron", 3, "Wowo");
		roro.provoquer(Yaku);
	}
}
