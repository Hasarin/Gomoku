

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;


public class Plateau extends JPanel implements MouseListener {

	
	public List<Coordonnée> liste = new ArrayList<Coordonnée>();
	int taille;

	public Plateau(Partie partie) {
		taille = partie.getTaille();
		addMouseListener(this);

	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);

		for (int i = 0; i < taille; i++) {
			for (int y = 0; y < taille; y++) {
				Coordonnée c = new Coordonnée(i * 40 + 20, y * 40 + 10);
				Coordonnée c2 = new Coordonnée(i * 40 + 20, y * 40 + 10 + 40);
				g.drawRect(i * 40 + 20, y * 40 + 10, 40, 40);
				Boolean b = false;
				for (Coordonnée coor : liste) {
					if (c.compare(coor)) {
						b = true;
					}
				}
				if (!b) {
					liste.add(c);
					liste.add(c2);
				}

			}
			liste.add(new Coordonnée(taille * 40 + 20, i * 40 + 10));
			liste.add(new Coordonnée(i * 40 + 20, taille * 40 + 10));

		}
		liste.add(new Coordonnée(taille * 40 + 20, taille * 40 + 10));
		for (Coordonnée Coordonnée : liste) {
			g.fillRect(Coordonnée.getX() - 5, Coordonnée.getY() - 5, 10, 10);
		}
		

	}
	

	public List getListe() {
		return liste;
	}

	public void mouseClicked(MouseEvent e) {
		for (Coordonnée c : liste) {
			if (c.getX() - 10 < e.getX() && c.getX() + 10 > e.getX()) {
				if (c.getY() - 10 < e.getY() && c.getY() + 10 > e.getY()) {
					
					getGraphics().fillOval(c.getX() - 10, c.getY() - 10, 20, 20);

				}
			}

		}
	}

	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
