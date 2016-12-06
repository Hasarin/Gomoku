import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class MenuView extends JeuView {


	public JFrame frame;
	public JLabel pImage;
	public JPanel panel1;
	public JPanel panel2;
	public JButton bouton1;
	public JSlider slider;

	public MenuView(JeuController controller) {
		super(controller);
		
	}


	
	public MenuView(JeuController jeuController, Partie partie) {
		super(jeuController);
		configFrame(partie);
	}



	public void configFrame(Partie partie){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 200, 300);
		panel1 = new JPanel();
		
		bouton1 = new JButton("Game");
		slider = new JSlider(3, 15);
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		frame.getContentPane().add(bouton1, BorderLayout.SOUTH);
		frame.getContentPane().add(slider);

		bouton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//frame.setVisible(false);
				getController().MenuView.close();
				

			}
		});
		
	}

	@Override
	public void jeuChanged(JeuListenerEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		frame.dispose();
	}

}
