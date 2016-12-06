import javax.swing.event.EventListenerList;

//MODEL
public class JeuModel{
	private Partie partie;
	private EventListenerList listeners;

	public JeuModel(Partie partie) {
		this.partie = partie;
		listeners = new EventListenerList();
	}

	
	
	public Partie getPartie() {
		return partie;
	}



	public void setPartie(Partie partie) {
		this.partie = partie;
		JeuListener();
	}



	public void addJeuListener(JeuListener listener){
		listeners.add(JeuListener.class, listener);
	}

	public void removeJeuListener(JeuListener l){
		 listeners.remove(JeuListener.class, l);
	}
	
	public void JeuListener(){
		JeuListener[] listenerList = (JeuListener[])listeners.getListeners(JeuListener.class);
 
		for(JeuListener listener : listenerList){
			listener.jeuChanged(new JeuListenerEvent(this, getPartie()));
		}
	}
	
	
	
	
}
