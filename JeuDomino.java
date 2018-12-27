import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
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
	ArrayList<Domino> pioche;
	int tour;
	InitJoueur iJ;
	
	public JeuDomino() {
		
		iJ = new InitJoueur();
	}
	public void piocher(Joueur player) {
		int a =(int) (Math.random() * (pioche.size()));
		Piece aj= pioche.get(a);
		player.mainsJoueur.add(aj);
	}
	public class InitJoueur extends JFrame{
		private JPanel container = new JPanel();
		private JTextField jtf1 = new JTextField("ex: Kévin");
		private JTextField jtf2 = new JTextField("ex: 13");;
		private JLabel label1 = new JLabel("Pseudo/Prénom");
		private JLabel label2 = new JLabel("Age du joueur    ");
		JButton b1 = new JButton ("Ajouter un autre joueur");
		JButton b2 = new JButton ("Choix du jeu");
		
		public InitJoueur() {
			//INITIALISATION DES JOUEURS
			this.setTitle("Initialisation des joueurs");
		    this.setSize(300, 300);
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
		    	for (Joueur j : listJoueur) {
					System.out.println(j);
				}
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
		public ArrayList<Joueur> getJ(){
			return listJoueur;
		}
	}
}
