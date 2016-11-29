package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import jeu.Coordonée;

public class Plateau extends JPanel {

	private Mouse mouse;
	public List<Coordonée> liste = new ArrayList<Coordonée>();
	public Plateau() {
		this.setLayout(new GridLayout(8, 8));
		mouse = new Mouse(liste);
		this.addMouseListener(mouse);
			
			
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);
		for (int i = 0; i < 10; i++) {
			for (int y = 0; y < 10; y++) {
				Coordonée c = new Coordonée(i*40+10, y*40+10);
				Coordonée c2 = new Coordonée(i*40+10, y*40+10+40);
				g.drawRect(i * 40 + 10, y*40+10, 40, 40);
				Boolean b = false;
				for (Coordonée coor : liste) {
					if(c.compare(coor)){
						b = true;
					}
				}
				if(!b){
					liste.add(c);
					liste.add(c2);
				}
				
			}
			liste.add(new Coordonée(10*40+10, i*40+10));
			liste.add(new Coordonée(i*40+10, 10*40+10));
			

		}
		liste.add(new Coordonée(10*40+10, 10*40+10));
		for (Coordonée coordonée : liste) {
			g.fillRect(coordonée.getX()-5, coordonée.getY()-5, 10, 10);
		}
		
	}
	
	public List getListe() {
		return liste;
	}
}
