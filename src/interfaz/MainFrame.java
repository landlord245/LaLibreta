package interfaz;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Dimension dimension;

    public MainFrame(Dimension dimension){
        this.dimension = dimension;

        this.setTitle("La Libreta");
        this.setSize(this.dimension);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
