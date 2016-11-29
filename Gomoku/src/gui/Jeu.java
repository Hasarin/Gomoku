package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import jeu.Joueurs;

public class Jeu extends JFrame {

	int taille;
	private Plateau plateau;

	public Jeu(int taille, Joueurs joueur1, Joueurs joueur2) {
		this.taille = taille;
		this.setTitle("Gomoku Game");
		this.setSize(taille * 40 + 50, taille * 40 + 50);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		plateau = new Plateau(taille, joueur1, joueur2);
		this.add(plateau);
		this.setVisible(true);
	}

	public int getTaille() {
		return taille;
	}

}
