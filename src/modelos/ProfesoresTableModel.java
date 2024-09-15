package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Adiestrado;
import logica.Docente;

public class ProfesoresTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	

	public ProfesoresTableModel(){
		String[] columnNames = {
				"Nombre", "CI", "Disponibilidad", "Años de trabajo", "Cat.Docente", "Cat.Cientifica", "Autorizacion"};
		this.setColumnIdentifiers(columnNames);
	}

	public ProfesoresTableModel(Docente [] docentes){
		String[] columnNames = {
				"Nombre", "CI", "Disponibilidad", "Años de trabajo", "Cat.Docente", "Cat.Cientifica", "Autorizacion"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < docentes.length; i++) {

			Object[] newRow = new Object[]{docentes[i].getNombre(), docentes[i].getiD(), 
					docentes[i].getDisponibilidad(), docentes[i].getAntiguedad(),
					docentes[i].getCatDoc(), docentes[i].getCatCientif(), ponerAutorizacion(docentes[i])};
			addRow(newRow);
		}
	}

	public void adicionar(String nombre, String iD, String disponibilidad, int antiguedad, 
	        String catDoc, String catCientif, boolean autorizacion){
	    Object[] newRow = new Object[]{
	        nombre, iD, disponibilidad, antiguedad, catDoc, catCientif, autorizacion ? "Si" : "No" 
	    };
	    addRow(newRow);
	}



	public void eliminar(int pos){
		removeRow(pos);
	}

	public void modificar(int pos, String nombre, String iD, String disponibilidad, int antiguedad, 
	        String catDoc, String catCientif, boolean autorizacion){
	    setValueAt(nombre, pos, 0);    
	    setValueAt(iD, pos, 1);    
	    setValueAt(disponibilidad, pos, 2);    
	    setValueAt(antiguedad, pos, 3);    
	    setValueAt(catDoc, pos, 4);    
	    setValueAt(catCientif, pos, 5);
	    
	    if (catDoc.equals("Adiestrado")) {
	        setValueAt(autorizacion ? "Si" : "No", pos, 6); 
	    }
	    else
	    	setValueAt(autorizacion, pos, 6);
	}

	public void actualizarTabla(){
		for(int i = 0; i< this.getRowCount(); i++){
			this.setValueAt(this.getValueAt(i, i),i,i);
			i++;
		}
	}

	
	public String ponerAutorizacion(Docente d){
	    if (d instanceof Adiestrado) {
	        return ((Adiestrado)d).isAutorizacion() ? "Si" : "No";
	    }
	    return "Si";
	}
}
