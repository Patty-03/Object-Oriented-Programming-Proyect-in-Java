package modelos;

import javax.swing.table.DefaultTableModel;

import logica.Adiestrado;
import logica.Docente;
import logica.Dpto;

public class ProfesoresTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	

	public ProfesoresTableModel(){
		String[] columnNames = {
				"Nombre", "CI", "Disponibilidad", "Salario Base", "Años de trabajo", "Cat.Docente", "Cat.Cientifica", "Autorizacion"};
		this.setColumnIdentifiers(columnNames);
	}

	public ProfesoresTableModel(Docente [] docentes){
		String[] columnNames = {
				"Nombre", "CI", "Disponibilidad", "Salario Base", "Años de trabajo", "Cat.Docente", "Cat.Cientifica", "Autorizacion"};
		this.setColumnIdentifiers(columnNames);
		for (int i = 0; i < docentes.length; i++) {

			Object[] newRow = new Object[]{docentes[i].getNombre(), docentes[i].getiD(), 
					docentes[i].getDisponibilidad(), docentes[i].getSalarioBase(), docentes[i].getAntiguedad(),
					docentes[i].getCatDoc(), docentes[i].getCatCientif(), ponerAutorizacion(docentes[i])};
			addRow(newRow);
		}
	}

	public void adicionar(String nombre, String iD, String disponibilidad,float salarioBase, int antiguedad, 
	        String catDoc, String catCientif, boolean autorizacion){
	    Object[] newRow = new Object[]{
	        nombre, iD, disponibilidad, salarioBase, antiguedad, catDoc, catCientif, autorizacion ? "Si" : "No" 
	    };
	    addRow(newRow);
	}



	public void eliminar(int pos){
		removeRow(pos);
	}

	public void modificar(int pos, String nombre, String iD, String disponibilidad, float salarioBase, int antiguedad, 
	        String catDoc, String catCientif, boolean autorizacion){
	    setValueAt(nombre, pos, 0);    
	    setValueAt(iD, pos, 1);    
	    setValueAt(disponibilidad, pos, 2);
	    setValueAt(salarioBase, pos, 3);
	    setValueAt(antiguedad, pos, 4);    
	    setValueAt(catDoc, pos, 5);    
	    setValueAt(catCientif, pos, 6);
	    
	    if (catDoc.equals("Adiestrado")) {
	        setValueAt(autorizacion ? "Si" : "No", pos, 7); 
	    }
	    else
	    	setValueAt(autorizacion, pos, 7);
	}

	public void actualizarTabla(Dpto d){

		for(int i = 0; i< d.getDocentes().size(); i++){
			System.out.println(d.getDocentes().get(i).getNombre());
			setValueAt(d.getDocentes().get(i).getNombre(), i, 0);    
		    setValueAt(d.getDocentes().get(i).getiD(), i, 1);    
		    setValueAt(d.getDocentes().get(i).getDisponibilidad(), i, 2);
		    setValueAt(d.getDocentes().get(i).getSalarioBase(), i, 3);
		    setValueAt(d.getDocentes().get(i).getAntiguedad(), i, 4);    
		    setValueAt(d.getDocentes().get(i).getCatDoc(), i, 5);    
		    setValueAt(d.getDocentes().get(i).getCatCientif(), i, 6);
		    setValueAt(ponerAutorizacion(d.getDocentes().get(i)), i, 7);
		}
		
		System.out.println("Tabla Docentes Reescrita");
	}

	
	public String ponerAutorizacion(Docente d){
	    if (d instanceof Adiestrado) {
	        return ((Adiestrado)d).isAutorizacion() ? "Si" : "No";
	    }
	    return "Si";
	}
}
