package Principal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author 2dama
 */
public class Lienzo extends Canvas{
//                                implements MouseListener,MouseMotionListener {
    private URL url = getClass().getResource("/img/programer.jpg");
    Image image = new ImageIcon(url).getImage();
    Graphics g = getGraphics();
    
    public Lienzo(){
        
    }
    @Override
    public Dimension getPreferredSize(){return new Dimension(640, 480);}
    
    @Override
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        g.setColor(Color.black);
        g.drawLine(14, 20, 30, 60);
        
        //BufferedImage
        
    }
    
    @Override
    public void update (Graphics g){
          
    }
    
    void dibujaPunto(Point p){
     Graphics g=getGraphics();
     g.setColor(Color.red);
     g.fillOval(p.x-4, p.y-4, 8, 8);
     g.dispose();
    }
    
}
