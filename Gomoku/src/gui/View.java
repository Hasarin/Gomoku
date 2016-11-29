package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame {

	private Plateau plateau;

	public View() {
		this.setTitle("Gomoku Game");
		this.setSize(430, 450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		plateau = new Plateau();

		this.add(plateau, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
