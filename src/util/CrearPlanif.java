package util;

import interfaz.Principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import logica.AsigPorProf;
import logica.Dpto;
import logica.Planificacion;

import com.toedter.calendar.JDateChooser;

public class CrearPlanif extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblSemestre;
	private JComboBox comboBoxSemestre;
	private JLabel lblDatos;
	private JLabel lblProfesor;
	private JComboBox comboBoxProf;
	private JLabel lblAsignatura;
	private JComboBox comboBoxAsig;
	private JLabel lblTipoDeEnseanza;
	private JLabel lblGrupos;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JButton button;
	private JPanel panel;
	private JLabel lblAgregarPlanificaciones;
	private JButton button_1;
	private Principal p;
	/**
	 * @wbp.nonvisual location=451,224
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblHoras;
	private JSpinner spinner;
	/**
	 * @wbp.nonvisual location=91,634
	 */
	private final ButtonGroup buttonGroupAulas = new ButtonGroup();
	private JComboBox comboBoxCurso;
	private JComboBox comboBoxGrupo;
	private JComboBox comboBoxEnsenanza;
	private JLabel lblEnseanza;
	private JDateChooser dateChooser;

		
	private ArrayList<String> obtenerProfesoresValidos(Dpto dpto) {
	    ArrayList<String> profesoresValidos = new ArrayList<>();
	    
	    for (AsigPorProf asignacion : dpto.getAsignacionesAsignaturas()) {
	        String nombreProf = asignacion.getNombreProf();
	        int totalHoras = 0;

	        for (AsigPorProf asig : dpto.getAsignacionesAsignaturas()) {
	            if (asig.getNombreProf().equals(nombreProf)) {
	                totalHoras += asig.getHorasClase();
	            }
	        }

	        if (totalHoras < 12 && !profesoresValidos.contains(nombreProf)) {
	            profesoresValidos.add(nombreProf);
	        }
	    }

	    return profesoresValidos;
	}

	public CrearPlanif(final Principal ppal, final Dpto dpto) {

		
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		setUndecorated(true);
		setBounds(new Rectangle(0, 0, 530, 412));
		getContentPane().setLayout(null);
		p = ppal;

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setBounds(261, 74, 2, 240);
		getContentPane().add(separator);
		setLocationRelativeTo(null);

		lblSemestre = new JLabel("SEMESTRE");
		lblSemestre.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSemestre.setBounds(22, 115, 183, 16);
		getContentPane().add(lblSemestre);

		comboBoxSemestre = new JComboBox();
		comboBoxSemestre.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxSemestre.setBounds(173, 115, 76, 22);
		getContentPane().add(comboBoxSemestre);

		lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatos.setBounds(12, 74, 237, 16);
		getContentPane().add(lblDatos);

		lblProfesor = new JLabel("PROFESOR");
		lblProfesor.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblProfesor.setBounds(22, 163, 183, 16);
		getContentPane().add(lblProfesor);

		
		comboBoxProf = new JComboBox();
		comboBoxProf.setBounds(139, 163, 110, 22);
		getContentPane().add(comboBoxProf);
	    ArrayList<String> profesoresValidos = obtenerProfesoresValidos(dpto);
	    comboBoxProf.setModel(new DefaultComboBoxModel<>(profesoresValidos.toArray(new String[0])));

		lblAsignatura = new JLabel("ASIGNATURA");
		lblAsignatura.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAsignatura.setBounds(22, 220, 183, 16);
		getContentPane().add(lblAsignatura);

		comboBoxAsig = new JComboBox();
		comboBoxAsig.setBounds(139, 220, 110, 22);
		getContentPane().add(comboBoxAsig);
		String[]array = new String[dpto.getAsignacionesAsignaturas().size()];
		for(int i = 0; i < dpto.getAsignacionesAsignaturas().size(); i++){			
			array[i] =	dpto.getAsignacionesAsignaturas().get(i).getAsignatura();
		}
		comboBoxAsig.setModel(new DefaultComboBoxModel<>(array));
		

		lblTipoDeEnseanza = new JLabel("TIPO DE ENSE\u00D1ANZA");
		lblTipoDeEnseanza.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeEnseanza.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblTipoDeEnseanza.setBounds(275, 76, 243, 16);
		getContentPane().add(lblTipoDeEnseanza);

		lblGrupos = new JLabel("GRUPO");
		lblGrupos.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblGrupos.setBounds(291, 266, 116, 16);
		getContentPane().add(lblGrupos);

		separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(90, 100, 84, 2);
		getContentPane().add(separator_2);

		separator_3 = new JSeparator();
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(307, 100, 189, 2);
		getContentPane().add(separator_3);

		button = new JButton("");
		button.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int horas, grupo, semestre, curso;
		        String asig, tipoE, nombreProf;

		        horas = (int) spinner.getValue();
		        grupo = Integer.parseInt((String) comboBoxGrupo.getSelectedItem());
		        semestre = Integer.parseInt((String) comboBoxSemestre.getSelectedItem());
		        Date fecha = dateChooser.getDate();
		        String fechaString = fecha.toString();
		        asig = (String) comboBoxAsig.getSelectedItem();
		        tipoE = (String) comboBoxEnsenanza.getSelectedItem();
		        nombreProf = (String) comboBoxProf.getSelectedItem();
		        curso = Integer.parseInt((String) comboBoxCurso.getSelectedItem());
		        AsigPorProf a = new AsigPorProf(horas, asig, tipoE, nombreProf, grupo);

		        if (dpto.existePlanificacion(nombreProf, asig, tipoE, grupo, curso, semestre)) {
		            JOptionPane.showMessageDialog(CrearPlanif.this, "Ya existe una planificación con los mismos datos.", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		        dpto.agregarPlanif(fechaString, curso, semestre, a);
		        JOptionPane.showMessageDialog(CrearPlanif.this, "Planificación agregada al registro de manera satisfactoria");
		        ppal.cargarTablaPlanif();
		        dispose();
		    }
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setIcon(new ImageIcon(CrearPlanif.class.getResource("/imagenes/Button.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(184, 419, 161, 63);
		getContentPane().add(button);

		panel = new JPanel();
		panel.setBorder(null);
		panel.setLayout(null);
		panel.setBounds(0, 0, 530, 43);
		getContentPane().add(panel);

		lblAgregarPlanificaciones = new JLabel("AGREGAR PLANIFICACION");
		lblAgregarPlanificaciones.setHorizontalAlignment(SwingConstants.LEFT);
		lblAgregarPlanificaciones.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAgregarPlanificaciones.setBounds(12, 5, 448, 35);
		panel.add(lblAgregarPlanificaciones);

		button_1 = new JButton("X");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setToolTipText("Salir");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorder(null);
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(482, -1, 48, 40);
		panel.add(button_1);

		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblFecha.setBounds(22, 271, 116, 16);
		getContentPane().add(lblFecha);
		lblHoras = new JLabel("HORAS");
		lblHoras.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblHoras.setBounds(291, 221, 116, 16);
		getContentPane().add(lblHoras);

		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		spinner.setBounds(453, 211, 65, 22);
		getContentPane().add(spinner);

		JLabel lblCurso = new JLabel("CURSO");
		lblCurso.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCurso.setBounds(285, 115, 183, 16);
		getContentPane().add(lblCurso);

		comboBoxCurso = new JComboBox();
		comboBoxCurso.setModel(new DefaultComboBoxModel(new String[] {"2024", "2025"}));
		comboBoxCurso.setBounds(434, 115, 84, 22);
		getContentPane().add(comboBoxCurso);

		comboBoxGrupo = new JComboBox();
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"11", "12", "13", "14"}));
		comboBoxGrupo.setBounds(408, 265, 110, 22);
		getContentPane().add(comboBoxGrupo);

		comboBoxEnsenanza = new JComboBox();
		comboBoxEnsenanza.setBounds(413, 157, 105, 22);
		getContentPane().add(comboBoxEnsenanza);
		
		String[]arrayE = new String[dpto.getAsignacionesAsignaturas().size()];
		for(int i = 0; i < dpto.getAsignacionesAsignaturas().size(); i++){			
			arrayE[i] =	dpto.getAsignacionesAsignaturas().get(i).getTipoEnsenanza();
		}
		comboBoxEnsenanza.setModel(new DefaultComboBoxModel<>(arrayE));

		lblEnseanza = new JLabel("ENSE\u00D1ANZA");
		lblEnseanza.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblEnseanza.setBounds(285, 159, 116, 16);
		getContentPane().add(lblEnseanza);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(144, 267, 105, 22);
		dateChooser.setDate(new Date()); 
		dateChooser.setEnabled(false);  
		getContentPane().add(dateChooser);
		
	}
}

