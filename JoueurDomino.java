import java.util.LinkedList;

public class JoueurDomino extends Joueur{
	
	public JoueurDomino(int n ,String s) {
		super(n,s);
		this.mainsJoueur = new LinkedList<Piece>();
	}
	
}
 