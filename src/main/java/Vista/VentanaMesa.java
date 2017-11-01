package Vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author pasot
 */
public class VentanaMesa extends JFrame{
    
    private PanelMesaIzq panelIzq;
    private PanelMesaDer panelDer;
    private VentanaPagar ventanaPagar;
    private VentanaAgregar ventanaAgregar;
    
    public VentanaMesa(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        
        
        panelIzq = new PanelMesaIzq();
        panelDer = new PanelMesaDer();
        add(panelIzq, BorderLayout.WEST);
        add(panelDer,BorderLayout.EAST);
        
        ventanaPagar = new VentanaPagar();
        ventanaAgregar = new VentanaAgregar();
        
        panelDer.btnCancelar.addActionListener(
                (ActionEvent e) -> {
                    ventanaPagar.setVisible(true);
                }
        );
        
        panelDer.btnAgregar.addActionListener(
                (ActionEvent e) -> {
                    ventanaAgregar.setVisible(true);
                }
        );
        
        
        
        setTitle("Mesa 1");
        setSize(600, 400);
        
    }
    
}
