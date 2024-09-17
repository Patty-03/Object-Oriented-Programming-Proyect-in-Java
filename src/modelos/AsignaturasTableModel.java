package modelos;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import logica.Asignatura;
import logica.TipoEnsenanza;

public class AsignaturasTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public AsignaturasTableModel(){
		String[] columnNames = {
				"Nombre", "Disciplina", "Plan", "Semestre", "Carrera", "Año", "Evaluacion Final", "Conf", "CP", "Lab", "Sem", "Taller"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public AsignaturasTableModel(Asignatura [] asignaturas){
		String[] columnNames = {
				"Nombre", "Disciplina", "Plan", "Semestre", "Carrera", "Año", "Evaluacion Final", "Conf", "CP", "Lab", "Sem", "Taller"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < asignaturas.length; i++) {
			Object[] newRow = new Object[]{asignaturas[i].getNombre(), asignaturas[i].getDisciplina(), 
					asignaturas[i].getPlanEstudio(), asignaturas[i].getSemestre(),asignaturas[i].getCarrera(),
					asignaturas[i].getAnio(), asignaturas[i].getEvaluacionFinal(), asignaturas[i].getHoras("Conferencia"), 
					asignaturas[i].getHoras("Clase Práctica"), asignaturas[i].getHoras("Laboratorio"), asignaturas[i].getHoras("Seminario"),
					asignaturas[i].getHoras("Taller")};
			addRow(newRow);
		}
	}
	
	public void adicionar(String nombre, String disciplina, char planEstudio, int semestre, String carrera, int anio, String evaluacionFinal, ArrayList<TipoEnsenanza> tipos){
		Object[] newRow = new Object[]{nombre, disciplina, planEstudio, semestre, carrera, anio, evaluacionFinal, tipos.get(0).getHoras(), tipos.get(1).getHoras(), 
				tipos.get(2).getHoras(), tipos.get(3).getHoras(), tipos.get(4).getHoras()};
		addRow(newRow);
	}
	
	public void eliminar(int pos){
		removeRow(pos);
	}
	
	public void modificar(int pos, String nombre, String disciplina, char planEstudio, int semestre, String carrera, int anio, String evaluacionFinal, ArrayList<TipoEnsenanza> tipos){
		setValueAt(nombre, pos, 0);
		setValueAt(disciplina, pos, 1);
		setValueAt(planEstudio, pos, 2);
		setValueAt(semestre, pos, 3);
		setValueAt(carrera, pos, 4);
		setValueAt(anio, pos, 5);
		setValueAt(evaluacionFinal, pos, 6);
		setValueAt(tipos.get(0).getHoras(), pos, 7);
		setValueAt(tipos.get(1).getHoras(), pos, 8);
		setValueAt(tipos.get(2).getHoras(), pos, 9);
		setValueAt(tipos.get(3).getHoras(), pos, 10);
		setValueAt(tipos.get(4).getHoras(), pos, 11);
	}
	
	public void actualizarTabla(){
		for(int i = 0; i< this.getRowCount(); i++){
			this.setValueAt(this.getValueAt(i, i),i,i);
			i++;
		}
	}
}
