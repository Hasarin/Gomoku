package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Menu extends JFrame {
	public JLabel pImage;
    public JPanel panel1;
    public JPanel panel2;
    public JButton bouton1;
    public JSlider slider;


	public Menu(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 200, 300);
        panel1 = new JPanel();
        /*System.out.println(getClass().getClassLoader().getResource("Ressources/gamebox.jpg"));
        ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("Ressources/gamebox.jpg"));
        pImage = new JLabel(image);
        panel1.add(pImage);
        this.getContentPane().add(pImage, BorderLayout.CENTER);*/
        
        bouton1 = new JButton("Game");
        slider = new JSlider(3,15);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        this.getContentPane().add(bouton1, BorderLayout.SOUTH);
        this.getContentPane().add(slider);


        bouton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Fenetre f = new Fenetre(slider.getValue());
                f.setVisible(true);

			}
		});
        this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Menu m = new Menu();
	}
}
