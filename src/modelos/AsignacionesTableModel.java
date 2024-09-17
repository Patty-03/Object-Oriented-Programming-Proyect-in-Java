package modelos;

import javax.swing.table.DefaultTableModel;

import logica.AsigPorProf;
import logica.Dpto;

public class AsignacionesTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	
	public AsignacionesTableModel(){
		String[] columnNames = {
				"Nombre Profesor", "Asignatura", "Tipo de enseñanza", "Horas Clase", "Grupo"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public AsignacionesTableModel(AsigPorProf [] asignaciones){
		String[] columnNames = {
				"Nombre Profesor", "Asignatura", "Tipo de enseñanza", "Horas Clase", "Grupo"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < asignaciones.length; i++) {
			Object[] newRow = new Object[]{asignaciones[i].getNombreProf(), asignaciones[i].getAsignatura(), asignaciones[i].getTipoEnsenanza(),
					asignaciones[i].getHorasClase(), asignaciones[i].getGrupo()};
			addRow(newRow);
		}
	}
	
	public void adicionar(String nombreProf, String asig, String tipoE, int horasClase, int grupo){
		Object[] newRow = new Object[]{nombreProf, asig, tipoE, horasClase, grupo};
		addRow(newRow);
	}
	
	public void eliminar(int pos){
		removeRow(pos);
	}
	
	public void modificar(int pos,String nombreProf, String asig, String tipoE, int horasClase, int grupo){
		setValueAt(nombreProf, pos, 0);
		setValueAt(asig, pos, 1);
		setValueAt(tipoE, pos, 2);
		setValueAt(horasClase, pos, 3);
		setValueAt(grupo, pos, 4);
	}

	public void actualizarTabla(){
		for(int i = 0; i< this.getRowCount(); i++){
			this.setValueAt(this.getValueAt(i, i),i,i);
			System.out.println(this.getValueAt(i, i));
			i++;
		}
	}
}
