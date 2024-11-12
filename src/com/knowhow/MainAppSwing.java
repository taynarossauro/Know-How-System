package com.knowhow;
import javax.swing.SwingUtilities;

import com.knowhow.modulos.*;

public class MainAppSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PaginaInicial paginaInicial = new PaginaInicial();
            paginaInicial.setVisible(true);
        });
    }
}
