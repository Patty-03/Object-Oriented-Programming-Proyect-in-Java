package modelos;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import logica.Docente;
import logica.Dpto;

public class ProfPorDispTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	public ProfPorDispTableModel(){
		String[] columnNames = {
				"Nombre", "CI", "Años de trabajo", "Cat. Docente", "Cat. cientifica"};
		this.setColumnIdentifiers(columnNames);
	}
	
	public ProfPorDispTableModel(Docente [] profesores){
		String[] columnNames = {
				"Nombre", "CI", "Años de trabajo", "Cat. Docente", "Cat. cientifica"};
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
    
    public void actualizarTabla(Dpto d, String disp){
    	ArrayList<Docente> valores = d.buscarProfPorDisp(disp);

		for(int i = 0; i< valores.size(); i++){
			setValueAt(valores.get(i).getNombre(), i, 0);    
		    setValueAt(valores.get(i).getiD(), i, 1);
		    setValueAt(valores.get(i).getAntiguedad(), i, 2);    
		    setValueAt(valores.get(i).getCatDoc(), i, 3);    
		    setValueAt(valores.get(i).getCatCientif(), i, 4);
		}
		
		System.out.println("Tabla ProfPorDisp Reescrita");
	}
}
