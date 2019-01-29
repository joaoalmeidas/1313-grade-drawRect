import java.awt.Graphics;

import javax.swing.JPanel;

public class Grade extends JPanel{
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		for(int x = getWidth()/8; x < getWidth()/8*7; x += getWidth()/8) {
			
			g.drawRect(x, -1, getWidth()/8, getHeight() + 1);
			
		}
		
		for(int y = getHeight()/8; y < getHeight()/8*7; y += getHeight()/8) {
			
			g.drawRect(-1, y, getWidth() + 1, getHeight()/8);
			
		}
		
	}
}
