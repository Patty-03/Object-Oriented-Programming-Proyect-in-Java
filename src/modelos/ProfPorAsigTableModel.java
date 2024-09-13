package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Docente;

public class ProfPorAsigTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public ProfPorAsigTableModel(){
		String[] columnNames = {
				"Nombre", "CI", "A�os de trabajo", "Cat. Docente", "Cat. Cient�fica"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public ProfPorAsigTableModel(Docente [] profesores){
		String[] columnNames = {
				"Nombre", "CI", "A�os de trabajo", "Cat. Docente", "Cat. Cient�fica"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < profesores.length; i++) {
			Object[] newRow = new Object[]{profesores[i].getNombre(), profesores[i].getiD(), 
					profesores[i].getAntiguedad(), profesores[i].getCatDoc(), profesores[i].getCatCientif()};
			addRow(newRow);
		}
	}
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
	
}
