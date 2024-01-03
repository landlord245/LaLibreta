package interfaz;

import interfaz.paneles.Editor;
import interfaz.paneles.Hub;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Hub hub = new Hub();
        MainFrame mainFrame = new MainFrame(editor, hub);
    }
}