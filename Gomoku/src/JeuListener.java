
//Listener du model

import java.util.EventListener;

public interface JeuListener extends EventListener {

	public void jeuChanged(JeuListenerEvent event);
}
