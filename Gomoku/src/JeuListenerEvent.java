import java.util.EventObject;

public class JeuListenerEvent extends EventObject {
	private Partie newPartie;
	 
	public JeuListenerEvent(Object source, Partie newPartie){
		super(source);
 
		this.newPartie = newPartie;
	}
 
	public Partie getNewPartie(){
		return newPartie;
	}
}
