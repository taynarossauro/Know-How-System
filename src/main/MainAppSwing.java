package main;
import modulos.*;
import javax.swing.SwingUtilities;

public class MainAppSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PaginaInicial paginaInicial = new PaginaInicial();
            paginaInicial.setVisible(true);
        });
    }
}
