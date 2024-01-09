package clases;

import clases.paneles.Hub;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Main {
    public static Color cPrimario = new Color(144, 214, 184);
    public static Color cSecundario = new Color(40, 115, 83);
    public static Color cOscuro = new Color(0, 59, 34);
    public static Dimension dimension = new Dimension(700, 700);
    public static String rutaPrincipal = "src/Documentos";
    public static void main(String[] args) {
        JFrame mainFrame = crearFrame();
    }
    public static JFrame crearFrame() {
        JFrame frame = new JFrame("La Book");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.setLayout(null);
        frame.setVisible(true);
        frame = adaptabilidad(frame);
        return frame;
    }

    public static JPanel insertarHub() {
        Hub hub = new Hub(dimension);
        hub.setBackground(cPrimario);
        hub.
        return hub;
    }

    public static JFrame adaptabilidad(JFrame frame) {
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                System.out.println(frame.getHeight());
            }
        });
        return frame;
    }
}
