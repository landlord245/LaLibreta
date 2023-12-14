package interfaz.paneles;

import javax.swing.*;
import java.awt.*;

public class Editor extends JPanel {
    private Color[] colors;
    private Dimension dimension;
    public Editor(Color[] colors, Dimension dimension) {
        this.colors = colors;
        this.dimension = dimension;
    }
}
