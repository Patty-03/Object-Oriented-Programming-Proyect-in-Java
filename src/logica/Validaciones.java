package logica;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Validaciones extends JOptionPane{
	
	
	
	
	public boolean validarVacio(JTextField entrada, String campo) {
	    if (entrada.getText().trim().isEmpty()) {
	        JOptionPane.showMessageDialog(this, "El campo " + campo + " no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    else {
	    	return true;
	    }
	}
	
	public boolean contieneNumeros(JTextField entrada, String campo) {
	    if (entrada.getText().matches(".*\\d.*")) {
	        JOptionPane.showMessageDialog(this, "El campo " + campo + " no puede contener números", "Error", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
        else
        	return true;
	    }
	    
	public boolean validarCI(JTextField entrada) {

	    if (entrada.getText().trim().isEmpty()) {
	        JOptionPane.showMessageDialog(this, "El campo CI no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    if (!entrada.getText().matches("\\d{11}")) {
	        JOptionPane.showMessageDialog(this, "El CI debe contener exactamente 11 caracteres numericos", "Error", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    else 
	    	return true;
	}
	}
        if (comboBoxCatDoc.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Categoría Docente", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (comboBoxCatCientif.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Categoría Científica", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (comboBoxDisp.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Disponibilidad", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
