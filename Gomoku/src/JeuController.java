public class JeuController {
	public JeuView menuView = null;
	public JeuView plateauView = null;
	private JeuModel model = null;
	
	public JeuController (JeuModel model){
		this.model = model;
 
		menuView = new MenuView(this, model.getPartie());
		addListenersToModel();
	}

	private void addListenersToModel() {
		model.addJeuListener(menuView);
		
	}

	public void displayMenuView() {
		menuView.display();
		
	}

	public void closeMenuView() {
		menuView.close();
	
	}
	
	public void displayPlateauView() {
		plateauView = new PlateauView(this,model.getPartie());
		model.addJeuListener(plateauView);
		plateauView.display();
		
	}

	public void closePlateauView() {
		plateauView.close();
	
	}

	public void notifyJeuChanged(Partie partie) {
		model.setPartie(partie);
	}
}