
package sistema;
import modelo.*;
import util.ManejoArchivo;
import Vista.VentanaInventario;
/**
 *
 * @author pasot
 */
public class Restaurante {
    public static void main(String[] args) {
        
        ManejoArchivo manejo = new ManejoArchivo();
        manejo.cargarInventario();
        manejo.cargarVentanaInventario();
        Mesa mesa1 = new Mesa();
        mesa1.mostrarPedido();
        
        Inventario inv = Inventario.getInstance();
        
        System.out.println("Productos en inventario: ");
        inv.mostrar();
        mesa1.agregarProducto(0, 4);
        mesa1.agregarProducto(2, 6);
        mesa1.mostrarPedido();
        inv.mostrar();
        mesa1.calcularTotal();
        
        
        //VentanaInventario ventanaInventario = new VentanaInventario();
        

    }
}
