import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class ViewDomino extends JFrame {
	
	public ViewDomino(boolean b,int l , int h) {

		GameWin j1 = new GameWin(l,h,Color.WHITE) ;
		
		Mains j2 = new Mains(l,h,Color.WHITE);
		
		setSize(l,h);
		setVisible(b);
		setLayout(new BorderLayout());
		add(j1,BorderLayout.CENTER);
		add(j2,BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
