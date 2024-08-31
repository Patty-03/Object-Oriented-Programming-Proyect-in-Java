package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Docente;

public class ProfesoresTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public ProfesoresTableModel(){
		String[] columnNames = {
				"Nombre", "CI", "Disponibilidad", "Años de trabajo", "Tipo", "Cat.Docente", "Cat.Cientifica"};
		this.setColumnIdentifiers(columnNames);
	}

	public ProfesoresTableModel(Docente [] docentes){
		String[] columnNames = {
				"Nombre", "CI", "Disponibilidad", "Años de trabajo", "Tipo", "Cat.Docente", "Cat.Cientifica"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < docentes.length; i++) {

			Object[] newRow = new Object[]{docentes[i].getNombre(), docentes[i].getiD(), 
					docentes[i].getDisponibilidad(), docentes[i].getAntiguedad(),docentes[i].getClass().getSimpleName(),
					docentes[i].getCatDoc(), docentes[i].getCatCientif()};
			addRow(newRow);
		}
	}

	public void adicionar(String nombre, String iD, String disponibilidad, int antiguedad, boolean isAdiestrado, 
			String catDoc, String catCientif){
		Object[] newRow = new Object[]{nombre, iD, disponibilidad, antiguedad, catDoc, catCientif};
		addRow(newRow);
	}

	public void eliminar(int pos){
		removeRow(pos);
	}

	public void modificar(int pos, String nombre, String iD, String disponibilidad, int antiguedad, String tipo, 
			String catDoc, String catCientif){
		setValueAt(nombre, pos, 0);	
		setValueAt(iD, pos, 1);	
		setValueAt(disponibilidad, pos, 2);	
		setValueAt(antiguedad, pos, 3);	
		setValueAt(tipo, pos, 4);	
		setValueAt(catDoc, pos, 5);	
		setValueAt(catCientif, pos, 6);	
	}

	public void actualizarTabla(){
		for(int i = 0; i< this.getRowCount(); i++){
			this.setValueAt(this.getValueAt(i, i),i,i);
			i++;
		}
	}
}
