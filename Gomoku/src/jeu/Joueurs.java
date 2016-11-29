package jeu;

import java.util.ArrayList;
import java.util.List;

public class Joueurs {
	private Couleur couleur;
	private List<Pion> listepion;
	
	public Joueurs(Couleur couleur) {
		this.couleur = couleur;
		listepion = new ArrayList<Pion>(60);
	}
	
	public Couleur getCouleur() {
		return couleur;
	}

	
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	
	
	
	
}
