
package Vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author consot
 */
public class VentanaMesas extends JFrame{
    
    private PanelMesas panelMesas;
    
    public VentanaMesas(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        JMenuItem itemInventario = new JMenuItem("Inventario");
        JMenuItem itemSalir = new JMenuItem("Salir");
        menuBar.add(menu);
        menu.add(itemInventario);
        menu.add(itemSalir);
        setJMenuBar(menuBar);
        
        VentanaInventario ventanaInventario = new VentanaInventario();
        itemInventario.addActionListener(
                (ActionEvent e) -> {
                    ventanaInventario.setVisible(true);
                }
        );
        
        
        itemSalir.addActionListener(
                (ActionEvent e) -> {
                    System.exit(0);
                }
        );
        
        
        panelMesas = new PanelMesas();
        add(panelMesas, BorderLayout.CENTER);
        VentanaMesa mesa1 = new VentanaMesa();
        
        panelMesas.botonMesa1.addActionListener(
                (ActionEvent e) -> {
                    mesa1.setVisible(true);
                }
        );
        
        setTitle("CONSOT");
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}