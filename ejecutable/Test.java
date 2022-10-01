// Define al paquete apropiado
package ejecutable;

// Importa las clases necesarias 
import controlador.Controlador;
import modelo.Modelo;
import vista.VentanaPrincipal;

// Crea la clase Test
public class Test{
    // Método main de la clase Test
    public static void main(String[] args) {
        Modelo miModelo = new Modelo();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miModelo);
    }
}