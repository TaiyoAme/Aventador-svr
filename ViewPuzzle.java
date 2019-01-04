import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;


public class ViewPuzzle extends JFrame {
	public ViewPuzzle(boolean b,int l , int h) throws IOException  {

		GameWin j1 = new GameWin(l,h,Color.WHITE) ;
		
		Puzzle j2 = new Puzzle("Image/GTR2.jpg",l,h,Color.ORANGE); 
		
		setSize(l,h);
		setVisible(b);
		setLayout(new BorderLayout());
		add(j1,BorderLayout.CENTER);
		add(j2,BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
