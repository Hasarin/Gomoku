import javax.swing.event.EventListenerList;

public class Partie {
	private Joueur joueur1;
	private Joueur joueur2;
	private int tourdejeu;
	
	
	
	public Partie(Joueur joueur1, Joueur joueur2) {
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
		tourdejeu = 1;
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

	public void setJoueur1(Joueur joueur1) {
		this.joueur1 = joueur1;
	}

	public void setJoueur2(Joueur joueur2) {
		this.joueur2 = joueur2;
	}

	public void setTourdejeu(int tourdejeu) {
		this.tourdejeu = tourdejeu;
	}
}
