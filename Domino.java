import java.awt.Color;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

class DragMouseAdapter extends MouseAdapter {
	  public void mousePressed(MouseEvent e) {
	    JComponent c = (JComponent) e.getSource();
	    TransferHandler handler = c.getTransferHandler();
	    handler.exportAsDrag(c, e, TransferHandler.MOVE);
	  }

	}

public class Domino extends Piece{
	private String gauche;
	private String droit;
	 String s;
	 ImageIcon i;
	 JLabel jl;
	MouseListener listener;
	private boolean vertical;
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
		  
		s ="Domino/"+gauche+"-"+droit+".jpg";
		listener = new DragMouseAdapter();
		i = new ImageIcon(s);
		jl = new JLabel(i);
		jl.addMouseListener(listener);
		jl.setTransferHandler(new TransferHandler("icon") {
			// Code qui permet d'utiliser la fonction MOVE (Par défaut le getSource Action ne 
			//permet que la copy).
			@Override
			  protected void exportDone(JComponent source, Transferable data, int action) {
		  if (action == MOVE){
		      ((JLabel) source).setVisible(false);
		      
		  }
		}
		@Override
		public  int getSourceActions(JComponent c) {
		return MOVE;
		}
			
		});
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
