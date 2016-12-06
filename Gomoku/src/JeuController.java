public class JeuController {
	public JeuView MenuView = null;
	private JeuModel model = null;

	public JeuController (JeuModel model){
		this.model = model;
 
		MenuView = new MenuView(this, model.getPartie());
		
		addListenersToModel();
	}

	private void addListenersToModel() {
		model.addJeuListener(MenuView);
		
	}

	public void displayViews() {
		MenuView.display();
		
	}

	public void closeViews() {
		MenuView.close();
	
	}

	public void notifyJeuChanged(Partie partie) {
		model.setPartie(partie);
	}
}