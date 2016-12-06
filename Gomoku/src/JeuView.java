
public abstract class JeuView implements JeuListener {
	private JeuController controller = null;

	public JeuView(JeuController controller) {
		super();

		this.controller = controller;
	}

	public final JeuController getController() {
		return controller;
	}

	public abstract void display();

	public abstract void close();
}
