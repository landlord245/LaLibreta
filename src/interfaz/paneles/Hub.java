package interfaz.paneles;

import javax.swing.*;
import java.awt.*;

public class Hub extends JPanel {
    private Color[] colors;
    private Dimension dimension;
    public Hub(Color[] colors, Dimension dimension) {
        this.colors = colors;
        this.dimension = dimension;
    }
}
