package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Asignatura;

public class AsignaturasTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public AsignaturasTableModel(){
		String[] columnNames = {
				"Nombre", "Disciplina", "Plan", "Semestre", "Carrera", "Aï¿½o", "Evaluacion Final"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public AsignaturasTableModel(Asignatura [] asignaturas){
		String[] columnNames = {
				"Nombre", "Disciplina", "Plan", "Semestre", "Carrera", "Año", "Evaluacion Final"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < asignaturas.length; i++) {
			Object[] newRow = new Object[]{asignaturas[i].getNombre(), asignaturas[i].getDisciplina(), 
					asignaturas[i].getPlanEstudio(), asignaturas[i].getSemestre(),asignaturas[i].getCarrera(),
					asignaturas[i].getAnio(), asignaturas[i].getEvaluacionFinal()};
			addRow(newRow);
		}
	}
	
	public void adicionar(String nombre, String disciplina, char planEstudio, int semestre, String carrera, int anio, String evaluacionFinal){
		Object[] newRow = new Object[]{nombre, disciplina, planEstudio, semestre, carrera, anio, evaluacionFinal};
		addRow(newRow);
	}
	
	public void eliminar(int pos){
		removeRow(pos);
	}
	
	public void modificar(int pos, String nombre, String disciplina, char planEstudio, int semestre, String carrera, int anio, String evaluacionFinal){
		setValueAt(nombre, pos, 0);
		setValueAt(disciplina, pos, 1);
		setValueAt(planEstudio, pos, 2);
		setValueAt(semestre, pos, 3);
		setValueAt(carrera, pos, 4);
		setValueAt(anio, pos, 5);
		setValueAt(evaluacionFinal, pos, 6);	
	}
	
	public void actualizarTabla(){
		for(int i = 0; i< this.getRowCount(); i++){
			this.setValueAt(this.getValueAt(i, i),i,i);
			i++;
		}
	}
}
