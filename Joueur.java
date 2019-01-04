import java.util.LinkedList;

public abstract class Joueur {
	protected final int age;
	protected final String name;
	public LinkedList<Piece> mainsJoueur;
	
	public Joueur(int age , String name) {
		this.age=age;
		this.name=name;
		mainsJoueur = new LinkedList<Piece>();
	}

	public void jeuEnMain() {
		for (int i = 0 ; i<mainsJoueur.size();i++) {
			System.out.println(mainsJoueur.get(i));
		}
	} 
	
	public String toString() {
		return "Nom : "+this.name+" age : "+this.age ;
	}
	

}
