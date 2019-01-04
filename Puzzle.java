
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class Puzzle extends JPanel {
	BufferedImage b;
	ImageIcon i1 = new ImageIcon();
	ImageIcon i2 = new ImageIcon();
	ImageIcon i3 = new ImageIcon();
	ImageIcon i4 = new ImageIcon();
	JLabel j1;
	JLabel j2;
	JLabel j3;
	JLabel j4;
	MouseListener listener;
	ArrayList<JLabel> jp = new ArrayList<JLabel>();
	public Puzzle(String s, int l, int h, Color c) throws IOException {
		try {
		File f = new File(s);
		b = ImageIO.read(f);
		i1.setImage(b.getSubimage(0, 0, b.getWidth()/2, b.getHeight()/2));
		i2.setImage(b.getSubimage(b.getWidth()/2, 0, b.getWidth()/2, b.getHeight()/2));
		i3.setImage(b.getSubimage(0, b.getHeight()/2, b.getWidth()/2, b.getHeight()/2));
		i4.setImage(b.getSubimage(b.getWidth()/2, b.getHeight()/2, b.getWidth()/2, b.getHeight()/2));
		j1 = new JLabel(i1);
		j2 = new JLabel(i2);
		j3 = new JLabel(i3);
		j4 = new JLabel(i4);
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		jp.add(j4);
		listener = new DragMouseAdapter();
		setPreferredSize(new Dimension(l, h / 4));
		setBackground(c);
		setLayout(new FlowLayout());
		for(JLabel i : jp) {
			i.setTransferHandler(new TransferHandler("icon") {
				// Code qui permet d'utiliser la fonction MOVE (Par défaut le getSource Action ne 
				//permet que la copy).
				@Override
				  protected void exportDone(JComponent source, Transferable data, int action) {
			  if (action == MOVE){
			      ((JLabel) source).setEnabled(false);
			  }
			}
			@Override
			public  int getSourceActions(JComponent c) {
			return MOVE;
			}
				
			});
			i.addMouseListener(listener);
			add(i);
		}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}



	}
}