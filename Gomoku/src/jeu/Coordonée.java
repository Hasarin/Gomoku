package jeu;

public class Coordonée {
	private int x;
	private int y;
	
	public Coordonée(int x,int y) {
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
	
	
	public boolean compare(Coordonée coord) {
		return ((this.x == coord.getX()) && (this.y == coord.getY()));
	}

}
