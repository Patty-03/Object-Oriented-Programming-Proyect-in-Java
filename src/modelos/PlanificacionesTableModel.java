package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Planificacion;

public class PlanificacionesTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public PlanificacionesTableModel(){
		String[] columnNames = {
				"Fecha", "Curso", "Semestre", "Profesor", "Asignatura", "Grupo", "Horas Clase", "Enseñanza"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public PlanificacionesTableModel(Planificacion [] planificaciones){
		String[] columnNames = {
				"Fecha", "Curso", "Semestre", "Profesor", "Asignatura", "Grupo", "Horas Clase", "Enseñanza"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < planificaciones.length; i++) {
			Object[] newRow = new Object[]{
					planificaciones[i].getFecha(), planificaciones[i].getCurso(), 
					planificaciones[i].getSemestre(), planificaciones[i].getAsignacion().getNombreProf(), 
					planificaciones[i].getAsignacion().getAsignatura(), planificaciones[i].getAsignacion().getGrupo(),
					planificaciones[i].getAsignacion().getHorasClase(), planificaciones[i].getAsignacion().getTipoEnsenanza()};
			addRow(newRow);
		}
	}
	
	public void adicionar(String fecha, int curso, int semestre, String nombreProf, String asig, int grupo, int horas, String tipoE){
		Object[] newRow = new Object[]{fecha, curso, semestre, nombreProf, asig, grupo, horas, tipoE};
		addRow(newRow);
	}
	
	public void eliminar(int pos){
		removeRow(pos);
	}
	
	public void modificar(int pos, String fecha, int curso, int semestre, String nombreProf, String asig, int grupo, int horas, String tipoE){
		setValueAt(fecha, pos, 0);
		setValueAt(curso, pos, 1);
		setValueAt(semestre, pos, 2);
		setValueAt(nombreProf, pos, 3);
		setValueAt(asig, pos, 4);
		setValueAt(grupo, pos, 5);
		setValueAt(horas, pos, 6);
		setValueAt(tipoE, pos, 7);
	}
	
	public void actualizarTabla(){
		for(int i = 0; i< this.getRowCount(); i++){
			this.setValueAt(this.getValueAt(i, i),i,i);
			i++;
		}
	}
}
