
package Vista;

import java.awt.BorderLayout;
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
        add(new PanelAgregarInventario(), BorderLayout.NORTH);
        add(new PanelAgregarCentral(),BorderLayout.CENTER);
        add(new PanelAgregarPedidos(),BorderLayout.SOUTH);
        
    }
    
}
