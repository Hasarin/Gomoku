import javax.swing.event.EventListenerList;

public class Partie {
	private Joueur joueur1;
	private Joueur joueur2;
	private int tourdejeu = 0;
	private int taille = 0;
	private int [][] plateau;
	
	
	
	public Partie(Joueur joueur1, Joueur joueur2) {
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
		tourdejeu = 1;
	}
	
	public Partie(int taille){
		this.taille = taille;
		plateau = new int[taille+1][taille+1];
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {
				plateau[i][j] = 0;
				
			}
		}
		plateau[5][4] = 1;
		plateau[4][5] = 2;
	}
	
	public Joueur getJoueur1() {
		return joueur1;
	}

	public Joueur getJoueur2() {
		return joueur2;
	}

	public int getTourdejeu() {
		return tourdejeu;
	}
	
	public int getTaille() {
		return this.taille;
	}

	public void setJoueur1(Joueur joueur1) {
		this.joueur1 = joueur1;
	}

	public void setJoueur2(Joueur joueur2) {
		this.joueur2 = joueur2;
	}

	public void setTourdejeu(int tourdejeu) {
		this.tourdejeu = tourdejeu;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public int[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(int a, int b, int v) {
		this.plateau[a][b] = v;
	}

	
	
	
}
