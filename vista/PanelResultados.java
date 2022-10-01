package vista;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

public class PanelResultados extends JPanel {
    public static JTextArea taResultados;
    public static JScrollPane spResultados;

    public PanelResultados() {
        this.setLayout(null);
        this.setBackground(Color.decode("#3d7cb8"));
        this.setVisible(true);

        taResultados = new JTextArea();
        taResultados.setFont(new Font("Consolas", Font.PLAIN, 16));
        taResultados.setForeground(Color.BLACK);
        taResultados.setBorder(BorderFactory.createLoweredBevelBorder());
        taResultados.setEditable(false);
        taResultados.setBounds(9, 15, 460, 80);

        spResultados = new JScrollPane(taResultados);
        spResultados.setBounds(9, 15, 460, 80);
        this.add(spResultados);
    }

    public void mostrarResultados(int productoEscalar) {
        taResultados.append("El producto escalar es " + productoEscalar + "!" + "\n");
    }

    public void borrarTa() {
        taResultados.setText("");
    }
}