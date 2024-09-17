package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Asignatura;
import logica.Dpto;

public class AsigPorProfTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public AsigPorProfTableModel(){
		String[] columnNames = {
				"Nombre", "Disciplina", "Semestre", "Carrera", "Horas Totales"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public AsigPorProfTableModel(Asignatura [] asig, Dpto d, String selectedProf){
		String[] columnNames = {
				"Nombre", "Disciplina", "Semestre", "Carrera", "Horas Totales"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < asig.length; i++) {
			Object[] newRow = new Object[]{asig[i].getNombre(), asig[i].getDisciplina(), 
					asig[i].getSemestre(), asig[i].getCarrera(), 
					d.devolverHorasPorProf(asig[i].getNombre(),selectedProf)};
			addRow(newRow);
		}
	}
}
