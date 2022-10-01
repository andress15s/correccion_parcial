// Define al paquete apropiado
package controlador;

// Importa las clases necesarias 
import modelo.Modelo;
import vista.PanelEntradaDatos;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

// Crea la clase controlador e implementa la interfaz ActionListener
public class Controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Modelo modelo;

    // Método constructor de la clase controlador
    public Controlador(VentanaPrincipal miVentanaPrincipal, Modelo modelo) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.modelo = modelo;
        this.miVentanaPrincipal.miPanelProceso.btnAgregar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
    }

    // Método para la atención de eventos
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        // Identifica el comando recibido y ejecuta el método correspondiente
        if (comando.equals("agregarValor")) {
            PanelEntradaDatos.agregarValor();
        } else if (comando.equals("calcularProducto")) {
            Modelo.hallarProductoEscalar();
            this.miVentanaPrincipal.miPanelSalida.mostrarResultados(this.modelo.getProductoEscalar());
        } else if (comando.equals("borrarTexto")) {
            vista.PanelEntradaDatos.borrarTf();
            this.miVentanaPrincipal.miPanelSalida.borrarTa();
        } else if (comando.equals("cerrarVentana")) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Producto Escalar",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}