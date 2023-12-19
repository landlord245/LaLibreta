package interfaz;

import interfaz.paneles.Editor;
import interfaz.paneles.Hub;

import java.awt.*;

public class Main {
    private static Color cPrimario = new Color(144, 214, 184);
    private static Color cSecundario = new Color(40, 115, 83);
    private static Color cOscuro = new Color(0, 59, 34);
    private static Dimension dimension = new Dimension(700, 700);
    private static String rutaPrincipal = "src/Documentos";
    public static void main(String[] args) {
        Color[] colors = arrayDeColores();
        Editor editor = new Editor(colors, dimension);
        Hub hub = new Hub(colors, dimension);
        MainFrame mainFrame = new MainFrame(dimension, editor, hub);

    }
    static Color[] arrayDeColores() {
        Color[] colors = new Color[3];
        colors[0] = cPrimario;
        colors[1] = cSecundario;
        colors[2] = cOscuro;
        return colors;
    }
}
