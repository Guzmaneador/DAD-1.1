package Principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 2dama
 */


public class Ventana extends JFrame implements ActionListener{
     
     private int ancho,alto;
     JPanel pS = new JPanel();
     JPanel pC = new JPanel();

     JButton boton = new JButton("Limpiar");
     
     Lienzo lienzo = new Lienzo();
     
     String contenido="";
     
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
        
        

        boton.setActionCommand("Limpiar");
        pS.add(boton);
        getContentPane().add(pS,BorderLayout.SOUTH);
        boton.addActionListener(this);
        //
    
 
        lienzo.addMouseMotionListener(new MouseMotionAdapter(){
             @Override
            public void mouseMoved(MouseEvent evento){
             // JLabel.setText(String.format("Sus coordenadas son [%d, %d]",
                   //getX y getY devuelve valores de las coordenadas del puntero.
                      evento.getX();
                      evento.getY();
                      lienzo.dibujaPunto(evento.getPoint());
                      
             }
          });
          
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
      // String botonElegido = e.getSource();     
       String comando = e.getActionCommand();
        if (comando.equals("Limpiar")){
       // if(e.getSource() == boton){     
            //contenido = campo.getText();
           // mostrarDatos.setText(contenido);
          //  int factorialNumero = factorial.obtenerFactorial(Integer.parseInt(contenido));
           // mostrarDatos.setText(Integer.toString(factorialNumero));
      
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
