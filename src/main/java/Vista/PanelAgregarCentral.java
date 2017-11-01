
package Vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author pasot
 */
public class PanelAgregarCentral extends JPanel{
    
    public JButton btnAgregar;
    public JButton btnQuitar;
    public JComboBox comboBoxCantidad;
    
    
    
    public PanelAgregarCentral(){
        inicializarComponentes();

    }
    
    private void inicializarComponentes(){
        setLayout(new FlowLayout());
        
        comboBoxCantidad = new JComboBox();
        btnAgregar = new JButton("Agregar");
        btnQuitar = new JButton("Quitar");
        add(comboBoxCantidad);
        add(btnAgregar);
        add(btnQuitar);
        
        
    }
    
}
