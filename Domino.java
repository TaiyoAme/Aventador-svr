
public class Domino {
	private String gauche;
	private String droit;
	private boolean cd; 		//Coté gauche
	private boolean cg;			//Coté gauche haut
	private boolean cgh; 		//Coté gauche bas
	private boolean cgb; 		//Coté droit
	private boolean cdh; 		//Coté droit haut
	private boolean cdb; 		//Coté droit bas
	private boolean cmh; 		//Coté milieu haut
	private boolean cmb; 		//Coté milieu haut
	
	public Domino(String g, String d){
		  this.gauche = g;
		  this.droit = d;
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
