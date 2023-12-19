package interfaz.panels;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Hub extends JPanel {
    private Color colorPrimario;
    private Color colorSecundario;
    private Color colorOscuro;

    public Hub(Dimension size, Color colorPrimario, Color colorSecundario, Color colorOscuro){
        this.setBackground(colorPrimario);
        int filas = calcularFilas();
        this.setLayout(new GridLayout(5,filas, 2, 2));
        this.setSize(size);
    }
    public int calcularFilas() {
        int number = 0;
        File file = new File("/home/gurjantsinght/Documentos/Test/");
        number = file.list().length/5;
        System.out.println(number);
        return number;
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
