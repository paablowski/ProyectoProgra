
package Vista;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author pasot
 */
public class PanelAgregarPedidos extends JPanel{
    
    public JButton btnAgregar;
    public JButton btnAceptar;
    public JTable tabla;
    public JScrollPane scroll;
    
    public PanelAgregarPedidos(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        String column[]={"CODIGO","CANTIDAD","PRODUCTO","PRECIO"};
        String data[][]={ {"001","2","Papas Fritas","$ 1000"},    
                          {"013","3","Fanta express","$ 600"},    
                          {"005","6","Empanadas Queso","$ 1250"}};
        
        tabla = new JTable(data,column);
        scroll =new JScrollPane(tabla);
        add(tabla.getTableHeader(),BorderLayout.PAGE_START);
        this.add(this.tabla);  
        
        
    }
    
}
