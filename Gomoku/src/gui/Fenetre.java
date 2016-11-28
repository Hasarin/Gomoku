package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	
	public static void main(String[] args) {
		new Fenetre();
	}
	
	private Plateau plateau;
	public Fenetre() {
		this.setTitle("Gomoku Game");
		this.setSize(430, 450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		plateau = new Plateau();
		
		
		
		this.add(plateau,BorderLayout.CENTER);
		this.setVisible(true);
	}
	

}
