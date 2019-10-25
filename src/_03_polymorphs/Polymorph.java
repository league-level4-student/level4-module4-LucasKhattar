package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;

public abstract class Polymorph implements MouseMotionListener, MouseListener{
    protected int x;
    protected int y;
    protected int width = 50;
    protected int height = 50;
    BufferedImage image;
    public int getX() {
    	return x;
    }
    
    public int getY() {
    	return y;
    }
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public void setX(int x) {
    	if(x < 0 ) {
    		x = 0;
    	}
    	else if (x > 900) {
    		x = 900;
    	}
    	this.x = x;
    }
    
    public void setY(int y) {
    	if(y < 0 ) {
    		y = 0;
    	}
    	else if (y > 600) {
    		y = 600;
    	}
    	this.y = y;
    }
    
    public void setWidth(int width) {
    	if(width != 50) {
    		width = 50;
    	}
    	this.width = width;
    }
    
    public void setHeight(int height) {
    	if(height != 50) {
    		height = 50;
    	}
    	this.height = height;
    }
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    int X = 5;
    int Y = 5;
    public void update(){
    	if(x < 0) {
    		X = 5;
    	}
    	else if(y < 0) {
    		Y = 5;
    	}
    	else if(x > 1850) {
    		X = -5;
    	}
    	else if(y > 900) {
    		Y = -5;
    	}
    	
    	x += X;
    	y += Y;
    }
    
    public abstract void draw(Graphics g);

}
class RedPolymorph extends Polymorph implements MouseListener{

	RedPolymorph(int x, int y) {
		super(x, y);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Message");
	}
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
	
	@Override
	public void mouseDragged(MouseEvent e) {}
	
	@Override
	public void mouseMoved(MouseEvent e) {}	
	
}
class CirclePolymorph extends Polymorph{
	CirclePolymorph(int x, int y){
		super(x, y);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}
	int angle = 0;
	public void update() {
		x += Math.sin(angle) * 50;
		y += Math.cos(angle) * 50;
		angle++;
	}
	@Override
	public void mouseDragged(MouseEvent e) {}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
	
}

class MousePolymorph extends Polymorph implements MouseMotionListener{
	MousePolymorph(int x, int y){
		super(x, y);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}
	int angle = 0;
	public void update() {}
	@Override
	public void mouseDragged(MouseEvent e) {}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX() - 25;
		y = e.getY() - 50;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}

}

class MovingMorph extends Polymorph {
	
	MovingMorph(int x, int y) {
		super(x, y);
	}

	public void update(){

    }

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}