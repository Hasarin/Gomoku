package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame {
	

	int taille;
	private Plateau plateau;
	public View(int taille) {
		this.taille=taille;
		this.setTitle("Gomoku Game");
		this.setSize(taille*40+50, taille*40+50);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		plateau = new Plateau(taille);
		
		
		
		this.add(plateau,BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public int getTaille() {
		return taille;
	}
	

}
