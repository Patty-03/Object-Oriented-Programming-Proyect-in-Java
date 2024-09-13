package modelos;

import java.util.Date;

import javax.swing.table.DefaultTableModel;

import logica.AsigPorProf;
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
	
	public void adicionar(Date fecha, int curso, int semestre, AsigPorProf asignacion){
		Object[] newRow = new Object[]{fecha, curso, semestre, asignacion.getNombreProf(), asignacion.getAsignatura(), asignacion.getGrupo(),
				asignacion.getHorasClase(), asignacion.getTipoEnsenanza()};
		addRow(newRow);
	}
	
	public void eliminar(int pos){
		removeRow(pos);
	}
	
	public void modificar(int pos, Date fecha, int curso, int semestre, AsigPorProf asignacion){
		setValueAt(fecha, pos, 0);
		setValueAt(curso, pos, 1);
		setValueAt(semestre, pos, 2);
		setValueAt(asignacion.getNombreProf(), pos, 3);
		setValueAt(asignacion.getAsignatura(), pos, 4);
		setValueAt(asignacion.getGrupo(), pos, 5);
		setValueAt(asignacion.getHorasClase(), pos, 6);
		setValueAt(asignacion.getTipoEnsenanza(), pos, 7);
	}
	
	public void actualizarTabla(){
		for(int i = 0; i< this.getRowCount(); i++){
			this.setValueAt(this.getValueAt(i, i),i,i);
			i++;
		}
	}
}
