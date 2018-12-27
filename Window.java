import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Window extends JFrame{
	JButton quitter = new JButton ("quitter");
	ArrayList<Joueur> listJ= new ArrayList<Joueur>();


	public Window (ArrayList<Joueur> lis) {
		this.setVisible(true);
		
		this.setSize(850, 600);
		this.setLocationRelativeTo(null);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}
	public void init() {
		//INITIALISATION DES JOUEURS
	}
	
	
	public void startView() {
		this.setLayout(new GridLayout(3,1));
		JPanel pChoix = new JPanel();
		pChoix.setLayout(null);
		JButton domino = new JButton ("Domino");
		JButton dominoColor = new JButton ("Domino Couleur");
		JButton saboteur = new JButton ("Saboteur");
		JButton puzzle = new JButton ("Puzzle");
		
		domino.addActionListener(e -> {
			this.getContentPane().removeAll();
			this.dominoView();
			this.repaint();
		});
		
		dominoColor.addActionListener(e -> {
			this.getContentPane().removeAll();
			this.dominoColorView();
			this.repaint();
		});
		
		puzzle.addActionListener(e -> {
			this.getContentPane().removeAll();
			this.puzzleView();
			this.repaint();
		});
		
		saboteur.addActionListener(e -> {
			this.getContentPane().removeAll();
			this.saboteurView();
			this.repaint();
		});
		quitter.addActionListener(e -> {
			System.exit(0);
		});
		
		
		domino.setBounds(50, 60, 150, 50);
		dominoColor.setBounds(250, 60, 150, 50);
		puzzle.setBounds(450, 60, 150, 50);
		saboteur.setBounds(650, 60, 150, 50);
		quitter.setBounds(400, 120, 150, 50);
		
		pChoix.add(domino);
		pChoix.add(dominoColor);
		pChoix.add(puzzle);
		pChoix.add(saboteur);
		pChoix.add(quitter);
		PanelImage img = new PanelImage(new File("D:\\L2 info\\POOIG\\ProjectPOOS3\\src\\Menu.png"));
		JPanel remp = new JPanel();
		this.add(img);
		
		this.add(pChoix);
		remp.setBackground(Color.yellow);
		pChoix.setBackground(Color.black);
		this.add(remp);
		 
		
	}
	public void dominoView() {
		PanelImage idf = new PanelImage (new File("D:\\L2 info\\POOIG\\ProjectPOOS3\\src\\ImageDominoFond.jpg"));
		this.add(idf);
		this.setLayout(new GridLayout(1,1));
	}
	
	public void dominoColorView() {
		PanelImage idf = new PanelImage (new File("D:\\L2 info\\POOIG\\ProjectPOOS3\\src\\IdfDC.jpg"));
		this.add(idf);
		this.setLayout(new GridLayout(1,1));
	}
	public void puzzleView() {
		PanelImage idf = new PanelImage (new File("D:\\L2 info\\POOIG\\ProjectPOOS3\\src\\PuzzleFond.jpg"));
		this.add(idf);
		this.setLayout(new GridLayout(1,1));
	}
	public void saboteurView() {
		PanelImage idf = new PanelImage (new File("D:\\L2 info\\POOIG\\ProjectPOOS3\\src\\SaboteurFond.jpg"));
		this.add(idf);
		this.setLayout(new GridLayout(1,1));
	}
	
	
	public class PanelImage extends JPanel{
		private BufferedImage image;

	    public PanelImage(File f) {
	       try {                
	          image = ImageIO.read(f);
	       } catch (IOException ex) {
	            System.out.println("Fichier introuvable");
	       }
	    }
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, this);          
	    }

	}
}
