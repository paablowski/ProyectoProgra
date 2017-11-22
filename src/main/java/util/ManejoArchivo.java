
package util;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JScrollPane;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Inventario;
import Vista.VentanaInventario;

/**
 *
 * @author pasot
 */
public class ManejoArchivo {
    
    BufferedReader br = null;
    String csvFile = "data\\data.csv";
    String line = "";
    String csvSplitBy = ",";
    
    public ManejoArchivo(){
        
    }
    
    public void cargarInventario(){
        try {
            Inventario inventario = Inventario.getInstance();
            br = new BufferedReader(new FileReader(csvFile));
            
            while ((line = br.readLine()) != null) {
                
                String[] productos = line.split(csvSplitBy);
                inventario.agregarProducto(productos[0], Integer.parseInt(productos[1]), Integer.parseInt(productos[2]), Integer.parseInt(productos[3]));
                //System.out.println(productos[0]+"\t"+productos[1]+"\t"+productos[2]+"\t"+productos[3]+"\t");
                
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally{
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void cargarVentanaInventario(){
        
        VentanaInventario ventanaInventario = new VentanaInventario();
        String[] nombreColumnas = new String[]{
            "CODIGO","CANTIDAD","DESCRIPCION","PRECIO"
        };
        try {
            br = new BufferedReader(new FileReader(csvFile));
            List<String[]> elements = new ArrayList<>();
            String linea;
            while ((linea = br.readLine()) != null) {
                String [] quitarComa = linea.split(",");
                elements.add(quitarComa);
            }
            br.close();
            JTable tabla = new JTable();
            JScrollPane scroll = new JScrollPane(tabla);
            
            ventanaInventario.add(tabla.getTableHeader(),BorderLayout.PAGE_START);
            ventanaInventario.add(tabla,BorderLayout.CENTER);
            
            Object[][] contenido = new Object[elements.size()][4];
            for (int i = 0; i < elements.size(); i++) {
                contenido[i][0]= elements.get(i)[0];
                contenido[i][1]= elements.get(i)[1];
                contenido[i][2]= elements.get(i)[2];
                contenido[i][3]= elements.get(i)[3];
            }
            tabla.setModel(new DefaultTableModel(contenido,nombreColumnas));
            
        } catch (Exception e) {
        }
        
    }
    
}
