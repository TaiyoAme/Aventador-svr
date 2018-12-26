import java.util.ArrayList;
import java.util.Random;

public class JeuDomino {
	Joueur[] listJoueur;
	ArrayList<Domino> pioche;
	int tour;
	
	public JeuDomino() {
		
	}
	public void piocher(Joueur player) {
		int a =(int) (Math.random() * (pioche.size()));
		Piece aj= pioche.get(a);
		player.mainsJoueur.add(aj);
	}
}
