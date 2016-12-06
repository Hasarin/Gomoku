import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlateauView extends JeuView {
	public JFrame frame;
	public JLabel pImage;
	public Plateau p;

	public PlateauView(JeuController controller) {
		super(controller);
		
	}
	
	public PlateauView(JeuController jeuController, Partie partie) {
		super(jeuController);
		configFrame(partie);
	}

	private void configFrame(Partie partie) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		p = new Plateau(partie);
		frame.getContentPane().add(p);
		
		
	}


	
	@Override
	public void jeuChanged(JeuListenerEvent event) {
		
		
	}

	@Override
	public void display() {
	
		frame.setVisible(true);
	}

	@Override
	public void close() {
	
		frame.dispose();
	}

}
