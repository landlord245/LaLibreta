package interfaz;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        this.setTitle("La Libreta");
        this.setSize(500, 500);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
