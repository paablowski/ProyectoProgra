
package Vista;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author pasot
 */
public class PanelInventario extends JPanel{
    
    public JButton agregarbtn;
    public JTextField codigoTextField;
    public JTextField cantidadTextField;
    public JTextField descripcionTextField;
    public JTextField precioTextField;
    private final JLabel codigoLabel;
    private final JLabel cantidadLabel;
    private final JLabel descripcionLabel;
    private final JLabel precioLabel;
    public JTable tabla;
    
    public PanelInventario(){
        
        
        
        setLayout(new GridLayout(6, 2));
        setPreferredSize(new Dimension(0, 80));
        agregarbtn = new JButton("Agregar");

        codigoLabel = new JLabel("Codigo: ");
        cantidadLabel = new JLabel("Cantidad: ");
        descripcionLabel = new JLabel("Descripcion:");
        precioLabel = new JLabel("Precio: ");
        
        codigoTextField = new JTextField("");
        cantidadTextField = new JTextField("");
        descripcionTextField = new JTextField("");
        precioTextField = new JTextField("");
        
        add(codigoLabel);
        add(codigoTextField);
        add(cantidadLabel);
        add(cantidadTextField);
        add(descripcionLabel);
        add(descripcionTextField);
        add(precioLabel);
        add(precioTextField);
        add(agregarbtn);
        add(new JButton("Quitar"));
    }
    
}
