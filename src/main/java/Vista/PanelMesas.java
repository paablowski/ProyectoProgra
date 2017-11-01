
package Vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author consot
 */
public class PanelMesas extends JPanel{
    
    public JButton botonMesa1;
    
    public PanelMesas(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        
        setLayout(new GridLayout(3, 2, 20, 10));        
        
        botonMesa1 = new JButton("Mesa 1");
        add(botonMesa1);
        
        
        
        for (int i = 2; i < 7; i++) {
            add(new JButton("Mesa "+i));
        }
        
        
    }
    
}
