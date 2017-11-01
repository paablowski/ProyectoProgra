
package Vista;

import javax.swing.JFrame;

/**
 *
 * @author consot
 */
public class VentanaPagar extends JFrame{
    
    private PanelPagar panelPagar;
    
    public VentanaPagar(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        setSize(400, 400);
        add(panelPagar);
        
    }
}