package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Asignatura;

public class AsigPorDisciplinaTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public AsigPorDisciplinaTableModel(){
		String[] columnNames = {
				"Nombre", "Semestre", "Carrera"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public AsigPorDisciplinaTableModel(Asignatura [] asignaturas){
		String[] columnNames = {
				"Nombre", "Semestre", "Carrera"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < asignaturas.length; i++) {
			Object[] newRow = new Object[]{asignaturas[i].getNombre(), asignaturas[i].getSemestre(), asignaturas[i].getCarrera()};
			addRow(newRow);
		}
	}
}
