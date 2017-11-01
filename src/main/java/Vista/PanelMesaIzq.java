
package Vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author consot
 */
public class PanelMesaIzq extends JPanel{
    
    public PanelMesaIzq(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        
        String[] nombreColumnas = {"CODIGO", "CANTIDAD", "DESCRIPCION", "PRECIO",};
        Object[][] pedido = {
            {001, 2,"Papas", 1400},
            {043, 3,"Pollo frito", 2000},
            {103, 3,"Coca-Cola", 1500}
        };
        
        JTable tabla = new JTable(pedido, nombreColumnas);
        JScrollPane scrollPane = new JScrollPane(tabla);
        tabla.setFillsViewportHeight(true);
        tabla.setEnabled(false);
        setLayout(new BorderLayout());
        add(tabla.getTableHeader(),BorderLayout.PAGE_START);
        add(tabla,BorderLayout.CENTER);
        
    }
}
