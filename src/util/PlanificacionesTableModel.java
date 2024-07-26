package util;

import javax.swing.table.DefaultTableModel;

public class PlanificacionesTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public PlanificacionesTableModel() {
		@SuppressWarnings("unused")
		String[] columnNames = {
			"Fecha", "Semestre", "Asignatura", "Profesor",
		};	

	}
}
