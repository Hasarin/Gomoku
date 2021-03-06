

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JWindow;


public class Plateau extends JPanel implements MouseListener {

	
	public List<Coordonnée> liste = new ArrayList<Coordonnée>();
	Partie partie;
	

	public Plateau(Partie partie) {
		this.partie = partie;
		addMouseListener(this);

	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);
		

		for (int i = 0; i < partie.getTaille(); i++) {
			for (int y = 0; y < partie.getTaille(); y++) {
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
			liste.add(new Coordonnée(partie.getTaille() * 40 + 20, i * 40 + 10));
			liste.add(new Coordonnée(i * 40 + 20, partie.getTaille() * 40 + 10));

		}
		liste.add(new Coordonnée(partie.getTaille() * 40 + 20, partie.getTaille() * 40 + 10));
		
		
		for (int i = 0; i < partie.getPlateau().length; i++) {
			for (int j = 0; j < partie.getPlateau().length; j++) {
				if(partie.getPlateau()[i][j] == 1){
					if(gagner() == true){
						JOptionPane jo = new JOptionPane();
						int reply = jo.showConfirmDialog(null,"rejouer ?", "Gagner", JOptionPane.YES_NO_OPTION);
						if(reply == JOptionPane.NO_OPTION)
							System.exit(0);
						if(reply == JOptionPane.YES_OPTION)
							liste.clear();
						}
					g.setColor(Color.WHITE);
					g.fillOval(i*40 +10, j*40, 20, 20);
				}
				if(partie.getPlateau()[i][j]==2){
					if(gagner() == true){
						JOptionPane jo = new JOptionPane();
						int reply = jo.showConfirmDialog(null,"rejouer ?", "Gagner", JOptionPane.YES_NO_OPTION);
						if(reply == JOptionPane.NO_OPTION)
							System.exit(0);						
					}
					g.setColor(Color.BLACK);
					g.fillOval(i*40 +10, j*40, 20, 20);
				}
			}
		}
	}
	

	public List getListe() {
		return liste;
	}

	public void mouseClicked(MouseEvent e) {
		for (Coordonnée c : liste) {
			if (c.getX() - 10 < e.getX() && c.getX() + 10 > e.getX()) {
				if (c.getY() - 10 < e.getY() && c.getY() + 10 > e.getY()) {		
					
					//getGraphics().fillOval(c.getX() - 10, c.getY() - 10, 20, 20);
					if(partie.getPlateau()[(c.getX()-10)/40][c.getY()/40]== 0){
					if(partie.getTourdejeu()%2 == 0){
						partie.getPlateau()[(c.getX()-10)/40][c.getY()/40] = 1;
						partie.setTourdejeu(partie.getTourdejeu()+1);
					}
					else{
						partie.getPlateau()[(c.getX()-10)/40][c.getY()/40] = 2;
						partie.setTourdejeu(partie.getTourdejeu()+1);
					}
					}
				}
			}
		}
		repaint();
	}
	
	
	public boolean gagner(){
		for (int i = 0; i < partie.getPlateau().length; i++) {
			for (int j = 0; j < partie.getPlateau().length; j++) {
				if(partie.getPlateau()[i][j] == 1){
					if(checkVertical(i,j,1) || checkHorizon(i, j, 1) || checkVertiHB(i, j, 1) || checkVertiBH(i, j, 1)){
						return true;
					}
				}
				if(partie.getPlateau()[i][j] == 2){
					if(checkVertical(i,j,2) || checkHorizon(i, j, 2) || checkVertiHB(i, j, 2) || checkVertiBH(i, j, 2)){
						return true;
					}
				}
			}
		}
		return false;
		
	}

	
	

	private boolean checkVertical(int i,int j,int joueur) {
		
			int check = partie.getPlateau()[i][j];
			for (int k = 0; k < 5; k++) {
				if(j+k == 10){
					return false;
				}
				if(partie.getPlateau()[i][j+k] != joueur){
					return false;
				}
			
		}
		return true;
	}
	private boolean checkHorizon(int i,int j,int joueur) {
		int check = partie.getPlateau()[i][j];
		for (int k = 0; k < 5; k++) {
			if(i+k == 10){
				return false;
			}
			if(partie.getPlateau()[i+k][j] != joueur){
				return false;
			}
		}
		return true;
	}
	private boolean checkVertiHB(int i,int j,int joueur) {
		int check = partie.getPlateau()[i][j];
		for (int k = 0; k < 5; k++) {
			if(j+k == 10 || i+k == 10){
				return false;
			}
			if(partie.getPlateau()[i+k][j+k] != joueur){
				return false;
			}
		}
		return true;
	}
	private boolean checkVertiBH(int i,int j,int joueur) {
		int check = partie.getPlateau()[i][j];
		for (int k = 0; k < 5; k++) {
			if(j-k == 0 || i+k == 10){
				return false;
			}
			if(partie.getPlateau()[i+1][j-k] != joueur){
				return false;
			}
		}
		return true;
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
