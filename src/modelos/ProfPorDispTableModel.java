package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Docente;

public class ProfPorDispTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public ProfPorDispTableModel(){
		String[] columnNames = {
				"Nombre", "CI", "A�os de trabajo", "Cat. Docente", "Cat. cient�fica"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public ProfPorDispTableModel(Docente [] profesores){
		String[] columnNames = {
				"Nombre", "CI", "A�os de trabajo", "Cat. Docente", "Cat. cient�fica"};
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
