package util; 
import javax.swing.table.DefaultTableModel;

public class AsignaturasTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	
	public AsignaturasTableModel(){
		@SuppressWarnings("unused")
		String[] columnNames = {
				"Nombre", "Disciplina", "Plan Estudio", "Semestre",
				"Año", "Evaluación Final", "Carrera"
		};
		
		/*public AsignaturasTableModel(Asignatura [] asignaturas){
			String[] columnNames = {
					"Nombre", "Disciplina", "Plan Estudio", "Semestre",
					"Año", "Evaluación Final", "Carrera"
			};		}*/
	}

}
