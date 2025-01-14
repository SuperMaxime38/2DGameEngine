package fr.maxime38.engine2d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3167508994780516050L;
	
	
	//Screen settings
	final int originalTileSize = 32;
	final int scale = 3;
	
	final int tileSize = originalTileSize*scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol; //768
	final int screenHeight = tileSize * maxScreenRow; // 576
	
	Thread gameLoop;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
	}
	
	public void startGameLoop() {
		gameLoop = new Thread(this);
		gameLoop.start();
	}

	@Override
	public void run() {
		
		while(gameLoop != null) {
			
			//Update infos
			update();
			
			//Draw
			repaint(); // call 'paintComponent()'
		}
		
	}
	
	public void update() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		
		g2.fillRect(100, 100, tileSize, tileSize);
		g2.dispose();
	}
}
