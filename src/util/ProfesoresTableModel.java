package util;

import javax.swing.table.DefaultTableModel;

import logica.Profesor;

public class ProfesoresTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public ProfesoresTableModel() {
		String[] columnNames = {
				"Nombre", "CI", "Cat.Docente", "Cat.Cientifica", "Salario", "Estado", "Autorizacion"
		};	
		this.setColumnIdentifiers(columnNames);
	}

	public ProfesoresTableModel(Profesor [] profesores){
		String[] columnNames = {
				"Nombre", "CI", "Cat.Docente", "Cat.Cientifica", "Salario", "Estado", "Autorizacion"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < profesores.length; i++) {
			//FALTAN METODOS Y PUSE ALGUNOS AQUI PA RELLENAR
			//HAZ LO MISMO CON LOS OTROS MODELOS DE TABLA
			Object[] newRow = new Object[]{profesores[i].getNombre(), profesores[i].getiD(), profesores[i].getCatDoc(), 
					profesores[i].getCatCientif(), profesores[i].getSalarioBase(), profesores[i].getDisponibilidad(), 
					profesores[i].getAntiguedad()};
			addRow(newRow);
		}
	}
}
