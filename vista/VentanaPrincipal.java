package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public PanelEntradaDatos miPanelEntrada;
    public PanelOperaciones miPanelProceso;
    public PanelResultados miPanelSalida;

    public VentanaPrincipal() {
        this.setTitle("Producto Escalar");
        this.setSize(500, 410);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);

        miPanelEntrada = new PanelEntradaDatos();
        miPanelEntrada.setBounds(10, 10, 480, 180);
        this.add(miPanelEntrada);

        miPanelProceso = new PanelOperaciones();
        miPanelProceso.setBounds(10, 200, 480, 80);
        this.add(miPanelProceso);

        miPanelSalida = new PanelResultados();
        miPanelSalida.setBounds(10, 290, 480, 110);
        this.add(miPanelSalida);
    }
}