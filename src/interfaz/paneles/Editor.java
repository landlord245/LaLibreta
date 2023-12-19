package interfaz.paneles;

import javax.swing.*;
import java.awt.*;

public class Editor extends JPanel {
    private Color[] colors;
    private Dimension dimension;
    public Editor(Color[] colors, Dimension dimension) {
        this.colors = colors;
        this.dimension = dimension;
        this.setSize(this.dimension);
        this.setLayout(null);
        this.setBackground(this.getColors()[0]);
        this.setVisible(true);
    }

    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }
}
