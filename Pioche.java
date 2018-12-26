import java.util.LinkedList;

public class Pioche{
	
	LinkedList<Domino> pioche = new LinkedList<Domino>(); 
	
	
	public Pioche(){
		int a = 0;
		int b = 0;
		for (int i = a; i <7; i++) {
			for (int j = b; j<7; j++) {
				pioche.add(new Domino(Integer.toString(i),Integer.toString(j)));

			}
			a++;
			b++;
		}

	}
	
	
	
}