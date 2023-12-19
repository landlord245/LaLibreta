package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MainFrame extends JFrame {
    private Dimension dimension;

    public MainFrame(Dimension dimension){
        this.dimension = dimension;
        this.setTitle("La Libreta");
        this.setSize(this.dimension);
        this.setMinimumSize(new Dimension(700, 700));
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
