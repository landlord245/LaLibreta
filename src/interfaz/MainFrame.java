package interfaz;

import interfaz.paneles.Editor;
import interfaz.paneles.Hub;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MainFrame extends JFrame {
    private Color cPrimario = new Color(144, 214, 184);
    private Color cSecundario = new Color(40, 115, 83);
    private Color cOscuro = new Color(0, 59, 34);
    private Dimension dimension = new Dimension(700, 700);
    private String rutaPrincipal = "src/Documentos";
    private Editor editor;
    private Hub hub;
    public MainFrame(Editor editor, Hub hub) {
        this.editor = editor;
        this.hub = hub;
//        this.hub.setSize(this.dimension);
        this.editor.setSize(this.dimension);

        ajustarTamanyo();

        this.setTitle("Libreta");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(this.dimension);
        this.setLocationRelativeTo(this);

        this.add(hub);
        this.setVisible(true);
    }
    void ajustarTamanyo() {
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                System.out.println(getSize());
            }
        });
    }
}