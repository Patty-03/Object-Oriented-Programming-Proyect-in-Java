package util;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.JDialog;

@SuppressWarnings("serial")
public class Validaciones extends JOptionPane {

    private void showErrorMessage(Component parentComponent, String message) {
        JOptionPane optionPane = new JOptionPane(message, JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog(parentComponent, "Error");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    public boolean validarVacio(JTextField entrada, String campo) {
        boolean resultado = true;
        try {
            if (entrada.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("El campo " + campo + " no puede estar vacío");
            }
        } catch (IllegalArgumentException e) {
            showErrorMessage(entrada, e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public boolean contieneNumeros(JTextField entrada, String campo) {
        boolean resultado = true;
        try {
            if (entrada.getText().matches(".*\\d.*")) {
                throw new IllegalArgumentException("El campo " + campo + " no puede contener números");
            }
        } catch (IllegalArgumentException e) {
            showErrorMessage(entrada, e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public boolean validarCI(JTextField entrada) {
        boolean resultado = true;
        try {
            if (entrada.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("El campo CI no puede estar vacío");
            }
            if (!entrada.getText().matches("\\d{11}")) {
                throw new IllegalArgumentException("El CI debe contener exactamente 11 caracteres numéricos");
            }
        } catch (IllegalArgumentException e) {
            showErrorMessage(entrada, e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public boolean validarSeleccion(JComboBox<?> entrada, String campo) {
        boolean resultado = true;
        try {
            if (entrada.getSelectedIndex() == -1) {
                throw new IllegalArgumentException("Debe seleccionar una opción en " + campo);
            }
        } catch (IllegalArgumentException e) {
            showErrorMessage(entrada, e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    
}