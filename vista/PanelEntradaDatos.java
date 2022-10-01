package vista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import modelo.Modelo;

public class PanelEntradaDatos extends JPanel {
    private JLabel lbTitulo;
    private JLabel lbX;
    private JLabel lbY;
    private static JLabel lbVectorA;
    private static JLabel lbVectorB;
    private static JTextField tfX;
    private static JTextField tfY;
    private static int[] vectorComodinA = new int[10];
    private static int[] vectorComodinB = new int[10];
    private static int indiceA = 0;
    private static int indiceB = 0;
    static Modelo miModelo = new Modelo();

    public PanelEntradaDatos() {
        this.setLayout(null);
        this.setBackground(Color.decode("#3d7cb8"));
        this.setVisible(true);

        lbTitulo = new JLabel("PRODUCTO ESCALAR", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(10, 10, 480, 30);
        this.add(lbTitulo);

        lbX = new JLabel("X =");
        lbX.setFont(new Font("Serif", Font.PLAIN, 18));
        lbX.setForeground(Color.BLACK);
        lbX.setBounds(10, 70, 480, 30);
        this.add(lbX);

        tfX = new JTextField();
        tfX.setFont(new Font("Arial", Font.PLAIN, 18));
        tfX.setForeground(Color.BLACK);
        tfX.setBounds(50, 70, 190, 30);
        this.add(tfX);

        lbY = new JLabel("Y =");
        lbY.setFont(new Font("Serif", Font.PLAIN, 18));
        lbY.setForeground(Color.BLACK);
        lbY.setBounds(10, 120, 480, 30);
        this.add(lbY);

        tfY = new JTextField();
        tfY.setFont(new Font("Arial", Font.PLAIN, 18));
        tfY.setForeground(Color.BLACK);
        tfY.setBounds(50, 120, 190, 30);
        this.add(tfY);

        lbVectorA = new JLabel("A: [");
        lbVectorA.setFont(new Font("Serif", Font.PLAIN, 16));
        lbVectorA.setForeground(Color.BLACK);
        lbVectorA.setBounds(248, 70, 480, 30);
        this.add(lbVectorA);

        lbVectorB = new JLabel("B: [");
        lbVectorB.setFont(new Font("Serif", Font.PLAIN, 16));
        lbVectorB.setForeground(Color.BLACK);
        lbVectorB.setBounds(248, 120, 480, 30);
        this.add(lbVectorB);
    }

    public static String getTfX() {
        return tfX.getText();
    }

    public static String getTfY() {
        return tfY.getText();
    }

    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Producto Escalar",
                JOptionPane.WARNING_MESSAGE);
        tfX.setText("");
        tfY.setText("");
        lbVectorA.setText("");
        lbVectorB.setText("");
        indiceA = 0;
        indiceB = 0;
        Modelo.resultado = 0;
        Modelo.productoEscalar = 0;
        PanelResultados.taResultados.setText("");
    }

    public static void agregarValor() {
        try {
            vectorComodinA[indiceA] = Integer.parseInt(getTfX());
            if (indiceA < 9) {
                lbVectorA.setText(lbVectorA.getText() + String.valueOf(vectorComodinA[indiceA]) + ", ");
            } else {
                lbVectorA.setText(lbVectorA.getText() + String.valueOf(vectorComodinA[indiceA]) + "]");
            }
            indiceA++;
            if (indiceA == vectorComodinA.length) {
                miModelo.setvectorA(vectorComodinA);
            }
            vectorComodinB[indiceB] = Integer.parseInt(getTfY());
            if (indiceB < 9) {
                lbVectorB.setText(lbVectorB.getText() + String.valueOf(vectorComodinB[indiceB]) + ", ");
            } else {
                lbVectorB.setText(lbVectorB.getText() + String.valueOf(vectorComodinB[indiceB]) + "]");
            }
            indiceB++;
            if (indiceB == vectorComodinB.length) {
                miModelo.setvectorB(vectorComodinB);
                JOptionPane.showMessageDialog(null, "El vector B está lleno!", "Producto Escalar",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos.\nLos datos deben tener un valor real",
                    "Producto Escalar", JOptionPane.ERROR_MESSAGE);
        }
    }
}