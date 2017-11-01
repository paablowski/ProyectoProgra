
package Vista;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pasot
 */
public class PanelAgregarInventario extends JPanel{
    
    public JTable tabla;
    public JScrollPane scroll;
    
    public PanelAgregarInventario(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        String column[]={"CODIGO","CANTIDAD","PRODUCTO","PRECIO"};
        String data[][]={ {"001","2","Papas Fritas","$ 1000"},    
                          {"013","3","Fanta express","$ 600"},    
                          {"005","6","Empanadas Queso","$ 1250"}};
        
//        tabla = new JTable(data,column);
//        scroll =new JScrollPane(tabla);
//        add(tabla.getTableHeader(),BorderLayout.PAGE_START);
//        add(tabla);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data\\inventario.csv")));

            List<String[]> elements = new ArrayList<String[]>();
            
            String line = null;
            while((line = br.readLine()) != null){
                String[] splitted = line.split(",");
                elements.add(splitted);
                
            }
            br.close();
            
            JTable table = new JTable();
            String[] columNames = new String[]{
                "CODIGO","CANTIDAD","PRODUCTO","PRECIO"
            };
            
            table = new JTable(data,column);
            scroll =new JScrollPane(tabla);
            add(table.getTableHeader(),BorderLayout.PAGE_START);
            add(table);
            
            Object[][] content = new Object[elements.size()][4];
            
            for(int i=0; i<elements.size(); i++) {
                content[i][0] = elements.get(i)[0];
                content[i][1] = elements.get(i)[1];
                content[i][2] = elements.get(i)[2];
                content[i][3] = elements.get(i)[3];
            }
            
            table.setModel(new DefaultTableModel(content,columNames));

            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
