//import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.event.MouseListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.TransferHandler;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class GameWin extends JPanel {
	ImageIcon im;
	MouseListener listener;
	JLabel[] tj;
		public GameWin(int l, int h, Color c) {
			listener = new DragMouseAdapter();
			tj = new JLabel[203];
			im = new ImageIcon("Image/point.jpg");
			FlowLayout fl = new FlowLayout();
			fl.setHgap(0);
			fl.setVgap(0);
			setLayout(fl);
//			setLayout(new FlowLayout());
			for (int i = 0; i < 203; i++) {
				tj[i] = new JLabel(im);
				tj[i].setName(""+i);
				tj[i].addMouseListener(listener);
				tj[i].setTransferHandler(new TransferHandler("icon"));
				add(tj[i]);
			}
			setBackground(c); 
			
		}
}
