import java.util.LinkedList;

public class Pioche {
	LinkedList<Piece> pioche = new LinkedList<Piece>();

	public Pioche() {
		int a = 0;
		int b = 0;
		for (int i = a; i < 7; i++) {
			for (int j = b; j < 7; j++) {
				pioche.add(new Domino(Integer.toString(i), Integer.toString(j)));
			}
			a++;
			b++;
		}
	}

	public int taille() {
		return pioche.size();
	}

	public Piece getP(int a) {
		return pioche.get(a);
	}

	public void removeP(int a) {
		pioche.remove(a);
	}
}
