
public class Gomoku {
	public static void main(String[] args) {
		JeuModel model = new JeuModel(new Partie(new Joueur(), new Joueur()));
		JeuController controller = new JeuController(model);
		controller.displayViews();
	}
}
