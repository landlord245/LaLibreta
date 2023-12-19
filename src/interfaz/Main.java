package interfaz;

import interfaz.paneles.Editor;
import interfaz.paneles.Hub;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    private static Color cPrimario = new Color(144, 214, 184);
    private static Color cSecundario = new Color(40, 115, 83);
    private static Color cOscuro = new Color(0, 59, 34);
    private static Dimension dimension = new Dimension(700, 700);
    private static String rutaPrincipal = "src/Documentos";
    private static Editor editor;
    private static Hub hub;
    private static MainFrame mainFrame;

    public static void main(String[] args) {
        Color[] colors = arrayDeColores();
        hub = new Hub(colors, dimension);
        editor = new Editor(colors, dimension);
        mainFrame = new MainFrame(dimension);
        adaptabilidad();
        lanzarMenu();
    }

    public static void adaptabilidad() {
        mainFrame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                dimension = mainFrame.getSize();
                hub.ventanaAdaptable(dimension);
            }
        });
    }

    public static void lanzarMenu() {
        mainFrame.add(hub);
    }

    @Contract(pure = true)
    static Color @NotNull [] arrayDeColores() {
        Color[] colors = new Color[3];
        colors[0] = cPrimario;
        colors[1] = cSecundario;
        colors[2] = cOscuro;
        return colors;
    }
}
