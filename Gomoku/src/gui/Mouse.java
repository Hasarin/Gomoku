package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.management.ListenerNotFoundException;

import jeu.Coordonée;
import jeu.Joueurs;

public class Mouse implements MouseListener {

	private List<Coordonée> liste = new ArrayList<Coordonée>();
	private Joueurs joueur1;
	private Plateau plateau;
	public Mouse(List liste, Plateau plateau, Joueurs joueur1) {
		this.liste = liste;
		this.plateau = plateau;
		this.joueur1 = joueur1;
		
	}

	public void mouseClicked(MouseEvent e) {
		for (Coordonée c : liste) {
			  if(c.getX()-10 < e.getX() && c.getX()+10 > e.getX()){
				  if(c.getY()-10 < e.getY() && c.getY()+10 > e.getY()){
					  
					
					  plateau.getGraphics().fillOval(c.getX()-10,c.getY()-10, 20, 20);
					  
					  
					  
					  
					  
					  }
				  }
			 
			
		}
	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

}
