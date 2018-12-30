
public class Domino extends Piece{
	private String gauche;
	private String droit;
	private boolean vertical;
	private boolean cd; 		//Cot� gauche
	private boolean cg;			//Cot� gauche haut
	private boolean cgh; 		//Cot� gauche bas
	private boolean cgb; 		//Cot� droit
	private boolean cdh; 		//Cot� droit haut
	private boolean cdb; 		//Cot� droit bas
	private boolean cmh; 		//Cot� milieu haut
	private boolean cmb; 		//Cot� milieu haut
	
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
	public boolean accord() {
		int a = 0;
		if(cd) {a++;}
		if(cg) {a++;}
		if(cdh) {a++;}
		if(cdb) {a++;}
		if(cgh) {a++;}
		if(cgb) {a++;}
		if(cmh) {a++;}
		if(cmb) {a++;}
		if(a==2 && a==1)return true;
		
		return false;
	}
}
