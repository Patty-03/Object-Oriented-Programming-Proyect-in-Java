package modelos;

import javax.swing.table.DefaultTableModel;
import logica.Docente;
import logica.AsigPorProf;
import logica.Dpto; 
import java.util.ArrayList;

public class ProfMas12Horas extends DefaultTableModel {
    private static final long serialVersionUID = 1L;

    public ProfMas12Horas() {
        String[] columnNames = {
            "Nombre", "CI", "Años de trabajo", "Cat. Docente", "Cat. Científica", "Horas clase"
        };
        this.setColumnIdentifiers(columnNames);
    }

    public ProfMas12Horas(Dpto dpto) {
        String[] columnNames = {
            "Nombre", "CI", "Años de trabajo", "Cat. Docente", "Cat. Científica", "Horas clase"
        };
        this.setColumnIdentifiers(columnNames);
        
        ArrayList<Docente> profesores = dpto.getDocentes(); 
        ArrayList<AsigPorProf> asignaciones = dpto.getAsignacionesAsignaturas(); 
        
        for (Docente profesor : profesores) {
            int horasClase = calcularHorasClase(profesor.getNombre(), asignaciones);
            if (horasClase > 12) {
                Object[] newRow = new Object[]{
                    profesor.getNombre(),
                    profesor.getiD(),
                    profesor.getAntiguedad(),
                    profesor.getCatDoc(),
                    profesor.getCatCientif(),
                    horasClase
                };
                addRow(newRow);
            }
        }
    }

    private int calcularHorasClase(String nombreProfesor, ArrayList<AsigPorProf> asignaciones) {
        int totalHoras = 0;
        for (AsigPorProf asignacion : asignaciones) {
            if (asignacion.getNombreProf().equals(nombreProfesor)) {
                totalHoras += asignacion.getHorasClase();
            }
        }
        return totalHoras;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
