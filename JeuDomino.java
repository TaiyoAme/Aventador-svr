import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JeuDomino {
	ArrayList<Joueur> listJoueur = new ArrayList<Joueur>();
	Pioche pioche = new Pioche();
	int tour;
	InitJoueur iJ;
	Window dableyou;
	Domino premier ;
	
	public JeuDomino() {
		iJ = new InitJoueur();
		
	}
	public void piocher(Joueur player) {
		int a =(int) (Math.random() * (pioche.taille()));
		Piece aj= pioche.getP(a);
		player.mainsJoueur.add(aj);
		pioche.removeP(a);
	}
	public class InitJoueur extends JFrame{
		private JPanel container = new JPanel();
		private JTextField jtf1 = new JTextField("ex: Herve");
		private JTextField jtf2 = new JTextField("ex: 13");;
		private JLabel label1 = new JLabel("Pseudo/Prénom");
		private JLabel label2 = new JLabel("Age du joueur    ");
		JButton b1 = new JButton ("Ajouter un autre joueur");
		JButton b2 = new JButton ("Choix du jeu");
		
		public InitJoueur() {
			//INITIALISATION DES JOUEURS
			this.setTitle("Initialisation des joueurs");
		    this.setSize(300, 150);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    container.setBackground(Color.white);
		    container.setLayout(new BorderLayout());
		    JPanel top = new JPanel();
		    jtf1.setFont(new Font("Arial", Font.BOLD, 14));
		    jtf1.setPreferredSize(new Dimension(150, 30));
		    jtf1.setForeground(Color.BLUE);
		    jtf2.setPreferredSize(new Dimension(150, 30));
		    b1.addActionListener(e -> {
		    	try {Integer.parseInt(jtf2.getText());}
		    	catch(NumberFormatException exc) {System.out.println();}
		    	JoueurDomino ajout = new JoueurDomino(Integer.parseInt(jtf2.getText()),jtf1.getText());
		    	System.out.print(ajout);
		    	listJoueur.add(ajout);
		    	if(listJoueur.size()>=2) {
		    		b1.setEnabled(false);
		    		b2.setEnabled(true);
		    		}
		    });
		    b2.addActionListener(e -> {
		    	this.dispose();
		    	dableyou = new Window(listJoueur);
		    	
		    });
		    b2.setEnabled(false);
		    top.add(label1);
		    top.add(jtf1);
		    top.add(label2);
		    top.add(jtf2);
		    top.add(b1);
		    top.add(b2);
		    this.setContentPane(top);
		    this.setVisible(true);
		}
	}
	public Joueur fin() {				// Fonction returnant le vainqueur et null si il y en a pas.
		for (Joueur j : listJoueur) {   // Victoire si une personne n'a plus de domino , pioche vide ou pas
			if (j.mainsJoueur.size()==0) {
				return j;
			}
		}int min  = 28;
		if(pioche.taille()==0) {
			for(Joueur k :listJoueur) {
				if(k.mainsJoueur.size()<min) {
					min = k.mainsJoueur.size();
				}
			}for(Joueur l :listJoueur) {		// Victoire de celui ayant le moins de domino lorsque la pioche est vide
				if(l.mainsJoueur.size()==min) {
					return l;
				}
			}
		}
		return null;
	}
	
	public void distributionD() {
		for (Joueur j : listJoueur) {
			for (int i = 0; i<5 ; i++) {
				this.piocher(j);
			}
		}
	}
	/*public boolean correct() {
		if (tour>0 && premier.accord()) {
			return true;
		}
		
		
		
		return false;
	}*/
}
