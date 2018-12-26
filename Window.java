import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Window extends JFrame{
	public Window () {
		this.setVisible(true);
		this.setLocationRelativeTo(null);	
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void startView() {
		Dimension buttonSize = new Dimension(80 , 40);
		JPanel pChoix = new JPanel();
		this.setLayout(new GridLayout(3,1));
		
		JButton domino = new JButton ("Domino");
		domino.setSize(buttonSize);

		JButton dominoColor = new JButton ("Domino Couleur");
		dominoColor.setSize(buttonSize);
		JButton puzzle = new JButton ("Puzzle");
		puzzle.setSize(buttonSize);
		JButton saboteur = new JButton ("Saboteur");
		saboteur.setSize(buttonSize);
		pChoix.add(domino);
		pChoix.add(dominoColor);
		pChoix.add(puzzle);
		pChoix.add(saboteur);
		JPanel pane = new JPanel();
		JLabel image = new JLabel( new ImageIcon( "Menu.png"));
		pane.add(image);
		JPanel remp = new JPanel();
		this.add(pane);
		this.add(pChoix);
		this.add(remp);
		 
		
	}
}
