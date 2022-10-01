package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelOperaciones extends JPanel {
    public JButton btnAgregar;
    public JButton btnCalcular;
    public JButton btnBorrar;
    public JButton btnSalir;

    public PanelOperaciones() {
        this.setLayout(null);
        this.setBackground(Color.decode("#3d7cb8"));
        this.setVisible(true);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnAgregar.setForeground(Color.BLACK);
        btnAgregar.setBackground(Color.WHITE);
        btnAgregar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnAgregar.setBounds(30, 22, 95, 40);
        btnAgregar.setActionCommand("agregarValor");
        this.add(btnAgregar);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCalcular.setForeground(Color.BLACK);
        btnCalcular.setBackground(Color.WHITE);
        btnCalcular.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCalcular.setBounds(135, 22, 95, 40);
        btnCalcular.setActionCommand("calcularProducto");
        this.add(btnCalcular);

        btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnBorrar.setForeground(Color.BLACK);
        btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBorrar.setBounds(240, 22, 95, 40);
        btnBorrar.setActionCommand("borrarTexto");
        this.add(btnBorrar);

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSalir.setBounds(345, 22, 95, 40);
        btnSalir.setActionCommand("cerrarVentana");
        this.add(btnSalir);
    }
}