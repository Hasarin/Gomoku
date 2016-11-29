package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.management.ListenerNotFoundException;

import jeu.Coordonée;

public class Mouse implements MouseListener {

	private List<Coordonée> liste = new ArrayList<Coordonée>();

	public Mouse(List liste) {
		this.liste = liste;
	}

	public void mouseClicked(MouseEvent e) {
		for (Coordonée c : liste) {
			  if(c.getX()-10 < e.getX() && c.getX()+10 > e.getX()){
				  if(c.getY()-10 < e.getY() && c.getY()+10 > e.getY()){
					  System.out.println("toucher");
					  
					  
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
