
package Vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pasot
 */
public class VentanaInventario extends JFrame{
    
    public String linea;
    private JTable tabla;
    private final String ARCHIVO = "data\\inventario.csv";
    public BufferedWriter output;
    private PanelInventario panelInventario;
    
    public VentanaInventario(){
        setTitle("INVENTARIO");
        setSize(400,400);
        panelInventario = new PanelInventario();
        add(panelInventario,BorderLayout.SOUTH);
        leerInventario();
        
        
        panelInventario.agregarbtn.addActionListener(
                (ActionEvent e) -> {
                    String codigo = panelInventario.codigoTextField.getText();
                    String cantidad = panelInventario.cantidadTextField.getText();
                    String descripcion = panelInventario.descripcionTextField.getText();
                    String precio = panelInventario.precioTextField.getText();
                    String[] nuevaFila = new String[]{
                        codigo,cantidad,descripcion,precio
                    };
                    agregar(nuevaFila,tabla);
                }
        );
        
        
    }
    
    public void agregar(String []nuevaFila, JTable table){
        System.out.println(nuevaFila);
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.addRow(nuevaFila);
        escribirInventario(nuevaFila);
    }
    
    private void leerInventario(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(ARCHIVO)));

            List<String[]> elements = new ArrayList<>();
            
            while((linea = br.readLine()) != null){
                String[] splitted = linea.split(",");
                elements.add(splitted);
                
            }
            br.close();
            
            tabla = new JTable();
            String[] columNames = new String[]{
                "CODIGO","CANTIDAD","DESCRIPCION","PRECIO"
            };
            
            JScrollPane scroll =new JScrollPane(tabla);
            add(tabla.getTableHeader(),BorderLayout.PAGE_START);
            add(tabla,BorderLayout.CENTER);
            
            Object[][] content = new Object[elements.size()][4];
            
            for(int i=0; i<elements.size(); i++) {
                content[i][0] = elements.get(i)[0];
                content[i][1] = elements.get(i)[1];
                content[i][2] = elements.get(i)[2];
                content[i][3] = elements.get(i)[3];
            }
            
            tabla.setModel(new DefaultTableModel(content,columNames));
            
        } catch (IOException ex) {
            
        }
    }
    
    
    
    private void escribirInventario(String []nuevaFila){
        
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(ARCHIVO,true));
            
            output.newLine();
            for (String nuevaFila1 : nuevaFila) {
                output.write(nuevaFila1+",");
            }
            
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        } finally {
            try {
            output.close();
            } catch (IOException ex) {
            System.out.println("Imposible abrir el archivo");
            }
        }
    }
    
}
