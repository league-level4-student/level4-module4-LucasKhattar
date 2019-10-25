package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> poly = new ArrayList();
    Polymorph bluePoly = new BluePolymorph(220, 54);
  	Polymorph redPoly = new RedPolymorph(200, 321);
  	Polymorph circlePoly = new CirclePolymorph(1000, 500);
  	Polymorph mousePoly = new MousePolymorph(50, 50);
  	
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(2000, 1000));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 poly.add(redPoly);
   	 poly.add(bluePoly);
   	 poly.add(circlePoly);
   	 poly.add(mousePoly);
   	 window.addMouseMotionListener(mousePoly);
   	 window.addMouseListener(redPoly);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 2000, 1000);
   	
   	 //draw polymorph
   	 for(Polymorph poly: poly) {
   		 poly.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for(Polymorph poly: poly) {
   		 poly.update();
   	 }
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

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}

}
