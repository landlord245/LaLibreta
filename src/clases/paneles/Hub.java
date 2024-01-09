package clases.paneles;

import javax.swing.*;
import java.awt.*;

public class Hub extends JPanel {
    private JPanel cabezera;
    private JPanel cuerpo;
    private Dimension dimension;
    public Hub(Dimension dimension) {
        this.dimension = dimension;
        this.setSize(dimension);
        this.setLayout(null);

    }

    public JPanel crearCabezera() {
        this.cabezera = new JPanel();
        this.cabezera.setSize(this.getWidth(), 200);
        return cabezera;
    }
}
