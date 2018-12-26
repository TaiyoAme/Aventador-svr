import java.util.LinkedList;
<<<<<<< HEAD

public class Pioche{
	
=======
public class Pioche{	
>>>>>>> df3e1b99dbc140ffc04538511989df05a2cb9fa5
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