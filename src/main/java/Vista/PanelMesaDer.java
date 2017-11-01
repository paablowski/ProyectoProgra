
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author consot
 */
public class PanelMesaDer extends JPanel{
    
    public JButton btnAgregar;
    public JButton btnCancelar;
    
    public PanelMesaDer(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        btnAgregar = new JButton("Agregar");
        add(btnAgregar);
        
        btnCancelar = new JButton("Cancelar");
        add(btnCancelar);
        
        TitledBorder borde = BorderFactory.createTitledBorder( "Total a Pagar" );
        borde.setTitleColor( Color.BLUE );
        
        JPanel totalPagarPanel = new JPanel();
        totalPagarPanel.setLayout(new GridLayout(3, 3,10,4));
        totalPagarPanel.setPreferredSize(new Dimension(180,10));
        add(totalPagarPanel);
        totalPagarPanel.setBorder(borde);
        
        
        int total =0;
        int propinaSugerida=0;
        int Total=0;
        JLabel totaltxt = new JLabel("Total: ");
        JLabel subtotaltxt = new JLabel("Subtotal: ");
        JCheckBox incluirPropina = new JCheckBox("Incluir propina: ",false);
        JLabel totalLabel = new JLabel("$ "+total);
        JLabel propinaLabel = new JLabel("+ $"+propinaSugerida);
        JLabel subtotalLabel = new JLabel("$ "+Total);
        
        totalPagarPanel.add(totaltxt);
        totalPagarPanel.add(totalLabel);
        totalPagarPanel.add(incluirPropina);
        totalPagarPanel.add(propinaLabel);
        totalPagarPanel.add(subtotaltxt);
        totalPagarPanel.add(subtotalLabel);
        
    }
}
