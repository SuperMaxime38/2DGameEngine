package fr.maxime38.engine2d;

import javax.swing.JFrame;

public class Game2D {
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Engine");
		
		GamePanel panel = new GamePanel();
		window.add(panel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}
