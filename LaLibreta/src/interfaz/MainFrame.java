package interfaz;

import interfaz.panels.Hub;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Hub hub;
    private Color colorPrimario;
    private Color colorSecundario;
    private Color colorOscuro;
    public MainFrame() {
        colorPrimario = new Color(169, 218, 255);
        colorSecundario = new Color(16, 151, 255);
        colorOscuro = new Color(0, 60, 106);

        this.setTitle("La Libreta");
        this.setSize(500, 500);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        hub = new Hub(this.getSize(), colorPrimario, colorSecundario, colorOscuro);
        this.add(hub);
        this.setVisible(true);
    }

    public Hub getHub() {
        return hub;
    }

    public void setHub(Hub hub) {
        this.hub = hub;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Color getColorOscuro() {
        return colorOscuro;
    }

    public void setColorOscuro(Color colorOscuro) {
        this.colorOscuro = colorOscuro;
    }
}
