package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    int width = 900;
    int height = 600;
    public int getX() {
    	return x;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setX() {
    	if(x < 0 ) {
    		x = 0;
    	}
    	else if (x > 900) {
    		x = 900;
    	}
    	this.x = x;
    }
    
    public void setY() {
    	if(y < 0 ) {
    		y = 0;
    	}
    	else if (y > 600) {
    		y = 600;
    	}
    	this.y = y;
    }
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
