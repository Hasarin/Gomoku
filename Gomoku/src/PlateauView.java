import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PlateauView extends JeuView {
	public JFrame frame;
	public JLabel pImage;
	public JPanel panel1;
	public JButton jtext;
	public List<Coordonée> liste = new ArrayList<Coordonée>();
	
	public PlateauView(JeuController controller) {
		super(controller);
		
	}
	
	public PlateauView(JeuController jeuController, Partie partie) {
		super(jeuController);
		configFrame(partie);
	}

	private void configFrame(Partie partie) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 200, 300);
		panel1 = new JPanel();
		jtext = new JButton();
		jtext.setText((""+partie.getTaille()));
		panel1.add(jtext);
		frame.getContentPane().add(panel1);
		
		
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);

		for (int i = 0; i < taille; i++) {
			for (int y = 0; y < taille; y++) {
				Coordonée c = new Coordonée(i * 40 + 20, y * 40 + 10);
				Coordonée c2 = new Coordonée(i * 40 + 20, y * 40 + 10 + 40);
				g.drawRect(i * 40 + 20, y * 40 + 10, 40, 40);
				Boolean b = false;
				for (Coordonée coor : liste) {
					if (c.compare(coor)) {
						b = true;
					}
				}
				if (!b) {
					liste.add(c);
					liste.add(c2);
				}

			}
			liste.add(new Coordonée(taille * 40 + 20, i * 40 + 10));
			liste.add(new Coordonée(i * 40 + 20, taille * 40 + 10));

		}
		liste.add(new Coordonée(taille * 40 + 20, taille * 40 + 10));
		for (Coordonée coordonée : liste) {
			g.fillRect(coordonée.getX() - 5, coordonée.getY() - 5, 10, 10);
		}
		

	}
	
	@Override
	public void jeuChanged(JeuListenerEvent event) {
		
		
	}

	@Override
	public void display() {
	
		frame.setVisible(true);
	}

	@Override
	public void close() {
	
		frame.dispose();
	}

}
