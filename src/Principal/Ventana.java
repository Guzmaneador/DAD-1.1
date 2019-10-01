package Principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author 2dama
 */


public class Ventana extends JFrame implements ActionListener{
     
     private int ancho,alto;
     JPanel pS = new JPanel();
     JPanel pC = new JPanel();

     ButtonGroup grupo=new ButtonGroup();
     JRadioButton img1 = new JRadioButton("Meme 1");
     JRadioButton img2 = new JRadioButton("Meme 2");
     JRadioButton img3 = new JRadioButton("Meme 3");
     
     Lienzo lienzo = new Lienzo();
     
     String escribir ="";
     
      Point cordenadas ;
     
    public Ventana(){
        this.ancho=640;
        this.alto =480;
        init();
    }
    
    private void init(){
        setTitle("La ventana de guzmi");
        setSize(new Dimension(ancho,alto));
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
       
        //contendor.setLayout();
        getContentPane().setLayout(new BorderLayout());
        
        
        
        pC.add(lienzo);
        //lienzo.setVisible(true);
        getContentPane().add(pC,BorderLayout.CENTER);
        lienzo.setVisible(rootPaneCheckingEnabled);
        
        

        
        
        
        
        img1.setSelected(true);
        img1.setMnemonic(KeyEvent.VK_B);
        img1.setActionCommand("IMG1");
            grupo.add(img1);
            pS.add(img1);       
        img2.setMnemonic(KeyEvent.VK_B);
        img2.setActionCommand("IMG2");
            grupo.add(img2);
            pS.add(img2);     
        img3.setMnemonic(KeyEvent.VK_B);
        img3.setActionCommand("IMG3");
            grupo.add(img3);
            pS.add(img3);
            
            
        getContentPane().add(pS,BorderLayout.SOUTH);
        img1.addActionListener(this);
        img2.addActionListener(this);
        img3.addActionListener(this);
        //
    
 
        lienzo.addMouseMotionListener(new MouseMotionAdapter(){
             @Override
            public void mouseMoved(MouseEvent evento){
//                      evento.getX();
//                      evento.getY();

                     // lienzo.dibujaPunto(evento.getPoint());
                      
             }                        
          });
        //------------------------------------------------------------//
        lienzo.addMouseListener(new MouseListener(){
            String Texto;
            
            @Override
            //Se llama cuando se oprime y se suelta un botón en el mouse.
            public void mouseClicked(MouseEvent evento) {
                //registramos las cordenadas al hacer click para usarlas mas adelnate 
                cordenadas = evento.getPoint();
                escribir ="";
                //lienzo.escribirTexto(evento.getPoint());
                  
            }                       
            @Override
             //Ocurre cuando el cursor entra dentro de los límites del componente.
            public  void mouseEntered(MouseEvent evento){
                
            }
            @Override
            //Ocurre cuando el cursor sale dentro de los límites del componente.
            public  void mouseExited(MouseEvent evento){
                    
                }
            
            @Override
            //es llamado cuando se oprime un botón en el Mouse
            public void mousePressed(MouseEvent evento) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            // Ocurre cuando se suelta un botón en el Mouse.
            public void mouseReleased(MouseEvent evento) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }           
          });
        
         ///--------------------------------------------///  
        lienzo.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
               
                 char letra= e.getKeyChar();
                 escribir += Character.toString(letra);
                 lienzo.escribirTexto(cordenadas, escribir );
            }

            @Override
            /**Este metodo se ejecuta cuando se presiona una tecla*/
            public void keyPressed(KeyEvent e) {
            }

            @Override
            /**Este metodo se ejecuta cuando se suelta una tecla*/
            public void keyReleased(KeyEvent e) {
            }
      });
          
    }
 

    
    
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       grupo.clearSelection();
      // String botonElegido = e.getSource();     
       String comando = e.getActionCommand();
        if (comando.equals("IMG1")){
            img1.setSelected(true);
         }
        if (comando.equals("IMG2")){
            img2.setSelected(true);

         }
        if (comando.equals("IMG3")){
            img3.setSelected(true);

         }
        
      
    }
    
}
//Panel transparente y JtexFil para redimensionar el tamaño //setOpcaque false