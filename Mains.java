import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.*;

import javax.swing.JPanel;

public class Mains extends JPanel {



	public Mains(int l, int h, Color c) {
		Domino d1 = new Domino("1","5");
		Domino d2 = new Domino("2","2");
		Domino d3 = new Domino("2","3");
		Domino d4 = new Domino("1","1");
		Domino d5 = new Domino("0","1");
		Domino d6 = new Domino("0","0");
		setPreferredSize(new Dimension(l, h / 4));
		setBackground(c);
		setLayout(new FlowLayout());
		add(d1.jl);
		add(d2.jl);
		add(d3.jl);
		add(d4.jl);
		add(d5.jl);
		add(d6.jl);
	}

}
