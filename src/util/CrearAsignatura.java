package util;

import interfaz.Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import logica.Asignatura;
import logica.Dpto;
import logica.TipoEnsenanza;
import modelos.AsignaturasTableModel;

public class CrearAsignatura extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldDisciplina;
	private JSeparator separator;
	private JLabel label;
	private JTextField textFieldNombre;
	private JLabel label_1;
	private JLabel label_2;
	private JComboBox<String> comboBoxPlanEstudio;
	private JLabel label_3;
	private JCheckBox checkBoxConf;
	private JLabel label_4;
	private JCheckBox checkBoxCP;
	private JLabel label_5;
	private JCheckBox checkBoxLab;
	private JLabel label_6;
	private JCheckBox checkBoxTaller;
	private JLabel label_7;
	private JCheckBox checkBoxSem;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JComboBox<Object> comboBoxAnio;
	private JComboBox<Object> comboBoxEvFinal;
	private JLabel label_12;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JLabel label_13;
	private JComboBox<String> comboboxCarrera;
	private JSeparator separator_3;
	private JLabel label_14;
	private JSeparator separator_4;
	private JSpinner spinnerConf;
	private JSpinner spinnerCP;
	private JSpinner spinnerLab;
	private JSpinner spinnerTaller;
	private JSpinner spinnerSem;
	private JPanel panel;
	private JButton button_1;
	private Principal pPrincipal;
	private JLabel lblSemestre;
	private JComboBox<Object> comboBoxSemestre;
	private JButton button;
	private AsignaturasTableModel a1;
	private Validaciones validaciones;


	@SuppressWarnings("rawtypes")
	public CrearAsignatura(Principal p, final Dpto dpto) {
		validaciones = new Validaciones();
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setType(Type.UTILITY);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setUndecorated(true);
		setBounds(100, 100, 705, 627);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		pPrincipal = p;

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setBounds(312, 92, 1, 356);
		contentPanel.add(separator);

		label = new JLabel("NOMBRE");
		label.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label.setBounds(37, 148, 65, 21);
		contentPanel.add(label);

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(157, 149, 116, 22);
		contentPanel.add(textFieldNombre);

		textFieldDisciplina = new JTextField();
		textFieldDisciplina.setColumns(10);
		textFieldDisciplina.setBounds(157, 205, 116, 22);
		contentPanel.add(textFieldDisciplina);

		label_1 = new JLabel("DISCIPLINA");
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_1.setBounds(37, 204, 108, 21);
		contentPanel.add(label_1);

		label_2 = new JLabel("PLAN DE ESTUDIO");
		label_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_2.setBounds(37, 260, 183, 16);
		contentPanel.add(label_2);

		comboBoxPlanEstudio = new JComboBox<String>();
		comboBoxPlanEstudio.setModel(new DefaultComboBoxModel(new Character[] {'A', 'B', 'C', 'D', 'E'}));
		comboBoxPlanEstudio.setSelectedItem('E');
		comboBoxPlanEstudio.setBounds(208, 259, 65, 22);
		contentPanel.add(comboBoxPlanEstudio);

		label_3 = new JLabel("CONFERENCIA");
		label_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_3.setBounds(325, 153, 116, 21);
		contentPanel.add(label_3);

		checkBoxConf = new JCheckBox("");
		checkBoxConf.setEnabled(false);
		checkBoxConf.setSelected(true);
		checkBoxConf.setBounds(505, 153, 31, 21);
		contentPanel.add(checkBoxConf);

		label_4 = new JLabel("CLASE PRACTICA");
		label_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_4.setBounds(325, 214, 149, 21);
		contentPanel.add(label_4);

		checkBoxCP = new JCheckBox("");
		checkBoxCP.setBounds(505, 214, 31, 21);
		contentPanel.add(checkBoxCP);

		label_5 = new JLabel("LABORATORIO");
		label_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_5.setBounds(325, 275, 149, 21);
		contentPanel.add(label_5);

		checkBoxLab = new JCheckBox("");
		checkBoxLab.setBounds(505, 275, 31, 21);
		contentPanel.add(checkBoxLab);

		label_6 = new JLabel("TALLER");
		label_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_6.setBounds(325, 336, 149, 21);
		contentPanel.add(label_6);

		checkBoxTaller = new JCheckBox("");
		checkBoxTaller.setBounds(505, 336, 31, 21);
		contentPanel.add(checkBoxTaller);

		label_7 = new JLabel("SEMINARIO");
		label_7.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_7.setBounds(325, 397, 149, 21);
		contentPanel.add(label_7);

		checkBoxSem = new JCheckBox("");
		checkBoxSem.setBounds(505, 397, 31, 21);
		contentPanel.add(checkBoxSem);

		label_8 = new JLabel("TIPO ENSE\u00D1ANZA");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_8.setBounds(312, 92, 224, 21);
		contentPanel.add(label_8);

		label_9 = new JLabel("DATOS GENERALES");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_9.setBounds(37, 92, 259, 21);
		contentPanel.add(label_9);

		label_10 = new JLabel("CARRERA");
		label_10.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_10.setBounds(37, 311, 108, 21);
		contentPanel.add(label_10);

		label_11 = new JLabel("A\u00D1O");
		label_11.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_11.setBounds(37, 367, 183, 16);
		contentPanel.add(label_11);

		comboBoxAnio = new JComboBox<Object>();
		comboBoxAnio.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		comboBoxAnio.setBounds(208, 366, 65, 22);
		contentPanel.add(comboBoxAnio);

		comboBoxEvFinal = new JComboBox<Object>();
		comboBoxEvFinal.setModel(new DefaultComboBoxModel(new String[] {"Trabajo de curso", "Examen Final", "Ninguna"}));
		comboBoxEvFinal.setBounds(157, 417, 116, 22);
		contentPanel.add(comboBoxEvFinal);

		label_12 = new JLabel("EV. FINAL");
		label_12.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_12.setBounds(37, 418, 183, 16);
		contentPanel.add(label_12);

		separator_1 = new JSeparator();
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setBounds(84, 111, 165, 2);
		contentPanel.add(separator_1);

		separator_2 = new JSeparator();
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(345, 111, 165, 2);
		contentPanel.add(separator_2);

		label_13 = new JLabel("");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_13.setBounds(25, 452, 680, 31);
		contentPanel.add(label_13);

		comboboxCarrera = new JComboBox<String>();
		comboboxCarrera.setModel(new DefaultComboBoxModel(new String[] {"Informatica"}));
		comboboxCarrera.setBounds(157, 312, 116, 22);
		contentPanel.add(comboboxCarrera);

		separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(548, 92, 1, 356);
		contentPanel.add(separator_3);

		label_14 = new JLabel("HORAS");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_14.setBounds(548, 92, 157, 21);
		contentPanel.add(label_14);

		separator_4 = new JSeparator();
		separator_4.setBackground(Color.LIGHT_GRAY);
		separator_4.setBounds(574, 111, 103, 2);
		contentPanel.add(separator_4);

		spinnerConf = new JSpinner();
		spinnerConf.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		spinnerConf.setBounds(592, 149, 49, 22);
		contentPanel.add(spinnerConf);

		spinnerCP = new JSpinner();
		spinnerCP.setModel(new SpinnerNumberModel(0, 0, 30, 1));
		spinnerCP.setBounds(592, 205, 49, 22);
		contentPanel.add(spinnerCP);

		spinnerLab = new JSpinner();
		spinnerLab.setModel(new SpinnerNumberModel(0, 0, 30, 1));
		spinnerLab.setBounds(592, 276, 49, 22);
		contentPanel.add(spinnerLab);

		spinnerTaller = new JSpinner();
		spinnerTaller.setModel(new SpinnerNumberModel(0, 0, 30, 1));
		spinnerTaller.setBounds(592, 337, 49, 22);
		contentPanel.add(spinnerTaller);

		spinnerSem = new JSpinner();
		spinnerSem.setModel(new SpinnerNumberModel(0, 0, 30, 1));
		spinnerSem.setBounds(592, 398, 49, 22);
		contentPanel.add(spinnerSem);

		panel = new JPanel();
		//panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel.setBounds(0, 0, 705, 43);
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel lblAgregarAsignatura = new JLabel("AGREGAR ASIGNATURA");
		lblAgregarAsignatura.setBounds(12, 5, 533, 35);
		lblAgregarAsignatura.setHorizontalAlignment(SwingConstants.LEFT);
		lblAgregarAsignatura.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel.add(lblAgregarAsignatura);

		button = new JButton("X");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setToolTipText("Salir");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Segoe UI", Font.BOLD, 25));
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorder(null);
		button.setBackground(Color.GRAY);
		button.setBounds(657, 0, 48, 40);
		panel.add(button);

		button_1 = new JButton("");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validaciones.validarVacio(textFieldNombre, "Nombre") && 
	                    validaciones.contieneNumeros(textFieldNombre, "Nombre") &&
	                	validaciones.validarVacio(textFieldDisciplina, "Disciplina") &&
	                	validaciones.contieneNumeros(textFieldDisciplina, "Disciplina")){
				a1 = crearAsignatura(dpto);
				JOptionPane.showMessageDialog(CrearAsignatura.this, "Asignatura agregada de manera satisfactoria");
				dispose();}
			}
		});
		button_1.setIcon(new ImageIcon(CrearAsignatura.class.getResource("/imagenes/Button.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(267, 551, 161, 63);
		contentPanel.add(button_1);

		lblSemestre = new JLabel("SEMESTRE");
		lblSemestre.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSemestre.setBounds(37, 479, 183, 16);
		contentPanel.add(lblSemestre);

		comboBoxSemestre = new JComboBox<Object>();
		comboBoxSemestre.setModel(new DefaultComboBoxModel(new Integer[] {1,2}));
		comboBoxSemestre.setBounds(157, 478, 116, 22);
		contentPanel.add(comboBoxSemestre);
	}
	
	public AsignaturasTableModel crearAsignatura(Dpto dpto) {
	    String nombre, disciplina, carrera, evFinal;
	    char planEstudio;
	    int anio;
	    int semestre;
	    int c = 0, cP = 0, lab = 0, sem = 0, taller = 0;

	    nombre = textFieldNombre.getText().trim().toLowerCase();  
	    disciplina = textFieldDisciplina.getText().trim();
	    planEstudio = (char) comboBoxPlanEstudio.getSelectedItem();
	    carrera = (String) comboboxCarrera.getSelectedItem();
	    evFinal = (String) comboBoxEvFinal.getSelectedItem();
	    anio = (int) comboBoxAnio.getSelectedItem();
	    semestre = (int) comboBoxSemestre.getSelectedItem();
	    ArrayList<TipoEnsenanza> tipos = new ArrayList<TipoEnsenanza>();


	    for (Asignatura asignatura : dpto.getAsignaturas()) {
	        if (asignatura.getNombre().trim().toLowerCase().equals(nombre)) { 
	            JOptionPane.showMessageDialog(CrearAsignatura.this, "Ya existe una asignatura con el nombre ingresado.", "Error", JOptionPane.ERROR_MESSAGE);
	            return null;
	        }
	    }

	    

	    
	    	System.out.println((int) spinnerConf.getValue());
	        c = (int) spinnerConf.getValue();
	        TipoEnsenanza t1 = new TipoEnsenanza("Conferencia", c);
	        tipos.add(t1);
	    

	   
	    	cP = (int) spinnerCP.getValue();
	        TipoEnsenanza t2 = new TipoEnsenanza("Clase Practica", cP);
	        tipos.add(t2);
	    

	    
	    	lab = (int) spinnerLab.getValue();
	        TipoEnsenanza t3 = new TipoEnsenanza("Laboratorio", lab);
	        tipos.add(t3);
	    

	    
	    	sem = (int) spinnerSem.getValue();
	        TipoEnsenanza t4 = new TipoEnsenanza("Seminario", sem);
	        tipos.add(t4);
	    

	   
	    	taller = (int) spinnerTaller.getValue();
	        TipoEnsenanza t5 = new TipoEnsenanza("Taller", taller);
	        tipos.add(t5);
	    

	    dpto.agregarAsignatura(nombre, disciplina, planEstudio, semestre, carrera, anio, evFinal, tipos);
	    a1 = pPrincipal.getAsignaturasTableModel();
	    a1.adicionar(nombre, disciplina, planEstudio, semestre, carrera, anio, evFinal, tipos);
	    return a1;
	}
}