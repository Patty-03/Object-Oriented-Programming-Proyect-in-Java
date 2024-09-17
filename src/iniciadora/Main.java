package iniciadora;

import interfaz.PantallaDeCarga;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;

import logica.Adiestrado;
import logica.AsigPorProf;
import logica.Asignatura;
import logica.Docente;
import logica.Dpto;
import logica.Planificacion;
import logica.TipoEnsenanza;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dpto dpto = new Dpto("Ingeniería de Software", "Sonia Pérez Lovelle", "Ingeniería Informática");
					inicializarDatos(dpto);
					PantallaDeCarga frame = new PantallaDeCarga(dpto);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@SuppressWarnings("deprecation")
	public static void inicializarDatos(Dpto dpto){
		
		//Inicializar Profes
		Docente prof1 = new Docente("63041918976", "Sonia Perez", "Disponible", 5000, 30, "Profesor Titular", "Doctor en Ciencias");
		Docente prof2 = new Docente("85121067683", "Fermin Rivas", "Disponible", 4500, 11, "Ninguno", "Ninguno");
		Adiestrado ad1 = new Adiestrado("00122158945", "Daniel Pardo", "Disponible", 3000, 1,"Adiestrado", "Ninguno", true);
		Adiestrado ad2 = new Adiestrado("00122158945", "Sheila Pérez", "Disponible", 3000, 2,"Adiestrado", "Ninguno", false);
		Docente prof3 = new Docente("70051918956", "Raisa Socorro", "Disponible", 5000, 30, "Profesor Titular", "Doctor en Ciencias");
		Docente prof4 = new Docente("70051918956", "Alejandro Rosette", "Beca", 5000, 30, "Profesor Titular", "Doctor en Ciencias");
		Docente prof5 = new Docente("03081598657", "Omar David", "Disponible", 2500, 0, "ATD", "Ninguno");
		
		dpto.getDocentes().add(prof1);
		dpto.getDocentes().add(prof2);
		dpto.getDocentes().add(ad1);
		dpto.getDocentes().add(ad2);
		dpto.getDocentes().add(prof3);
		dpto.getDocentes().add(prof4);
		dpto.getDocentes().add(prof5);
		
		//Inicializas Asignaturas
		//DPOO
		ArrayList<TipoEnsenanza> ensenanzasDpoo = new ArrayList<TipoEnsenanza>();
		TipoEnsenanza tp1 = new TipoEnsenanza("Conferencia", 7);
		TipoEnsenanza tp2 = new TipoEnsenanza("Clase Práctica", 12);
		TipoEnsenanza tp3 = new TipoEnsenanza("Laboratorio", 6);
		
		ensenanzasDpoo.add(tp1);
		ensenanzasDpoo.add(tp2);
		ensenanzasDpoo.add(tp3);

		Asignatura asig1 = new Asignatura("Diseño y Programación Orientada a Objetos", "Programación", 'E', 1, "Informática", 1, "Evaluación Final", ensenanzasDpoo);	
		
		//MD
		ArrayList<TipoEnsenanza> ensenanzasMD = new ArrayList<TipoEnsenanza>();
		TipoEnsenanza tp4 = new TipoEnsenanza("Conferencia", 7);
		TipoEnsenanza tp5 = new TipoEnsenanza("Seminario", 5);
		
		ensenanzasMD.add(tp4);
		ensenanzasMD.add(tp5);


		Asignatura asig2 = new Asignatura("Matematica Discreta", "Inteligencia Artificial", 'E', 1, "Informática", 1, "Ninguna", ensenanzasMD);	
		
		//IP
		ArrayList<TipoEnsenanza> ensenanzasIP = new ArrayList<TipoEnsenanza>();
		TipoEnsenanza tp6 = new TipoEnsenanza("Conferencia", 5);
		TipoEnsenanza tp7 = new TipoEnsenanza("Clase Práctica", 10);
		TipoEnsenanza tp8 = new TipoEnsenanza("Laboratorio", 3);
		
		ensenanzasIP.add(tp6);
		ensenanzasIP.add(tp7);
		ensenanzasIP.add(tp8);

		Asignatura asig3 = new Asignatura("Introducción a la Programación", "Programación", 'E', 2, "Informática", 1, "Evaluación Final", ensenanzasIP);	
		
		dpto.getAsignaturas().add(asig1);
		dpto.getAsignaturas().add(asig2);
		dpto.getAsignaturas().add(asig3);

		//Inicializando Asignaturas por Profesor
		ArrayList<AsigPorProf> aProf = new ArrayList<AsigPorProf>();
		
		AsigPorProf asp1 = new AsigPorProf(5, "Introducción a la Programación", "Conferencia", "Fermin Rivas", 11);
		AsigPorProf asp2 = new AsigPorProf(5, "Matematica Discreta", "Seminario", "Raisa Socorro", 14);
		AsigPorProf asp3 = new AsigPorProf(12, "Diseño y Programación Orientada a Objetos", "Clase Práctica", "Sonia Perez", 13);
		
		aProf.add(asp1);
		aProf.add(asp2);
		aProf.add(asp3);

		dpto.setAsignacionesAsignaturas(aProf);
		
		//Inicializar Planificaciones
		ArrayList<Planificacion> registro = new ArrayList<Planificacion>();
		
		Planificacion p1 = new Planificacion("2024-7-25", 2024, 1, asp1);
		Planificacion p2 = new Planificacion("2024-7-28", 2024, 1, asp2);
		Planificacion p3 = new Planificacion("2024-8-3", 2024, 1, asp3);
		
		registro.add(p1);
		registro.add(p2);
		registro.add(p3);

		dpto.setRegistro(registro);

	}
	
}
