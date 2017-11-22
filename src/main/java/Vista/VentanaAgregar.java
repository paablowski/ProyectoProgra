
package Vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author pasot
 */
public class VentanaAgregar extends JFrame{
    
    
    public VentanaAgregar(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        setSize(400, 400);
        setLayout(new GridLayout(3, 1));
        PanelAgregarInventario panelInventario = new PanelAgregarInventario();
        add(panelInventario);
        
        PanelAgregarCentral panelAgregarCentral = new PanelAgregarCentral();
        add(panelAgregarCentral);
        
        PanelAgregarPedidos panelAgregarPedidos = new PanelAgregarPedidos();
        add(panelAgregarPedidos);
        
    }
    
}
