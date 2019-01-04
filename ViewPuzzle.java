import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;


public class ViewPuzzle extends JFrame {
	public ViewPuzzle(boolean b,int l , int h) throws IOException  {

		GameWinDomino j1 = new GameWinDomino(l,h,Color.WHITE) ;
		
		Puzzle j2 = new Puzzle("Image/Python.jpg",l,h,Color.ORANGE); 
		setTitle("Puzzle");
		setSize(l,h);
		setVisible(b);
		setLayout(new BorderLayout());
		add(j1,BorderLayout.CENTER);
		add(j2,BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
