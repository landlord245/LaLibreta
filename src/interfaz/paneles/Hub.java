package interfaz.paneles;

import javax.swing.*;
import java.awt.*;

public class Hub extends JPanel {
    /**
     * colors[0] = cPrimario;
     * colors[1] = cSecundario;
     * colors[2] = cOscuro;
     */
    private Color[] colors;
    private Dimension dimension;
    private HubUpperSide upperSide;
    public Hub(Color[] colors, Dimension dimension) {
        this.colors = colors;
        this.dimension = dimension;
        this.setSize(dimension);
        this.setBackground(colors[0]);
        this.setLayout(null);
        this.add(crearUpperSide(), BorderLayout.NORTH);
        this.setVisible(true);
    }
    public void ventanaAdaptable(Dimension dimension) {
        this.setDimension(dimension);
        this.setSize(this.getDimension());
        this.remove(upperSide);
        this.add(crearUpperSide());
    }

    public HubUpperSide crearUpperSide() {
        int alto, ancho;
        alto = 200;
        ancho = (int) this.getDimension().getWidth();
        Dimension dimension1 = new Dimension(ancho, alto);
        upperSide = new HubUpperSide(this.getColors(), dimension1);
        return upperSide;
    }

    public HubUpperSide getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(HubUpperSide upperSide) {
        this.upperSide = upperSide;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }
}
