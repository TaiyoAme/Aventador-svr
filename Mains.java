import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.*;

import javax.swing.JPanel;

public class Mains extends JPanel {



	public Mains(int l, int h, Color c) {
		Domino d1 = new Domino("Domino/0-0-h.jpg",c);
		Domino d2 = new Domino("Domino/0-0.jpg",c);
		Domino d3 = new Domino("Domino/2-2.jpg",c);
		Domino d4 = new Domino("Domino/3-4.jpg",c);
		Domino d5 = new Domino("Domino/2-5.jpg",c);
		Domino d6 = new Domino("Domino/1-1.jpg",c);
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
