/**
 * 
 * Classe permettant de connaitre les coordonnes sur la fenetre en renseignant x
 * et y
 * 
 * @author Clement
 *
 */
public class Coordonnée {

	public int x;
	public int y;

	public Coordonnée(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void addCoord(Coordonnée coord) {
		this.x = this.x + coord.getX();
		this.y = this.y + coord.getY();
	}

	public boolean compare(Coordonnée coord) {
		return ((this.x == coord.getX()) && (this.y == coord.getY()));
	}

	public String toString() {
		return "Coord : [" + x + " ; " + y + "]";
	}

}
