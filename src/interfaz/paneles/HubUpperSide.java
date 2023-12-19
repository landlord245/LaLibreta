package interfaz.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class HubUpperSide extends JPanel {
    /**
     * colors[0] = cPrimario;
     * colors[1] = cSecundario;
     * colors[2] = cOscuro;
     */
    private Color[] colors;
    private JLabel iconoAdd;
    private Dimension dimension;
    public HubUpperSide(Color[] colors, Dimension dimension) {
        this.colors = colors;
        this.dimension = dimension;
        this.setSize(this.dimension);
        this.setBackground(colors[1]);
        this.setLayout(null);

        this.add(crearIconoAdd());
        this.setVisible(true);
    }

    public void ventanaAdaptable(Dimension dimension) {
    }

    public JLabel crearIconoAdd(){
        String path = "src/source/icons/agregar.png";
        Image img = new ImageIcon(path).getImage();
        ImageIcon img2 = new ImageIcon(img.getScaledInstance(75,75, Image.SCALE_SMOOTH));
        this.iconoAdd = new JLabel(img2);
        this.iconoAdd.setSize(75, 75);
        this.iconoAdd.setLocation(20, this.getHeight()/2-this.iconoAdd.getHeight()/2);
        this.iconoAdd.setToolTipText("Nuevo documento.");
        this.iconoAdd.setBackground(this.getColors()[0]);
        this.iconoAdd.setOpaque(true);
        return this.iconoAdd;
    }

    public JLabel getIconoAdd() {
        return iconoAdd;
    }

    public void setIconoAdd(JLabel iconoAdd) {
        this.iconoAdd = iconoAdd;
    }

    /**
    public void abrirExplorador() {
        this.iconoAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    FileSystem fileSystems = FileSystems.getDefault();
                    Path home = fileSystems.getPath("");
                    Process process = new ProcessBuilder("explorer.exe", "/select,"+home.toAbsolutePath()).start();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }
     **/



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
