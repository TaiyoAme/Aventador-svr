
public abstract class Joueur {
	protected final int age;
	protected final String name;
	public Joueur(int age , String name) {
		this.age=age;
		this.name=name;
	}
	
	public abstract void jeuEnMain(); 
	
	public String toString() {
		return "Nom : "+this.name+" âge : "+this.age;
	}
	
	
	
}
