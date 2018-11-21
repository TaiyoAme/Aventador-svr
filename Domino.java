
public class Domino {
	private String gauche;
	private String droit;
	private boolean collerd;
	private boolean collerg;
	
	public Domino(String g, String d){
		  this.gauche = g;
		  this.droit = d;
		  this.collerd=false;
		  this.collerg=false;
	  }
	
	  public String toString() {
		  return "Domino :"+this.gauche+"/"+this.droit;
	  }
	  public int getDroit() {
		  return Integer.parseInt(droit);
	  }
	  public int getGauche() {
		  return Integer.parseInt(gauche);
	  }

}
