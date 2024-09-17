package util;

import interfaz.Principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import logica.Dpto;
import modelos.ProfesoresTableModel;

public class CrearProfesor extends JDialog{
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldCI;
	private JLabel labelNombre;
	private JLabel labelCI;
	private JLabel labelCatDoc;
	private JLabel labelCatCientif;
	private JLabel labelDisponibilidad;
	private JLabel labelSalarioBase;
	private JSpinner spinnerAntiguedad;
	private JLabel labelAutorizacion;
	private JRadioButton autorizado;
	private JRadioButton noAutorizado;
	private JLabel lblDatosPersonales;
	private JLabel lblDatosProfesionales;
	private JButton button_1;
	private JComboBox comboBoxCatCientif;
	private JComboBox comboBoxCatDoc;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBoxDisp;
	private Principal ppal;
	private ProfesoresTableModel p1;
	/**
	 * @wbp.nonvisual location=361,644
	 */
	private final ButtonGroup buttonGroup;
	private JSpinner spinnerSalario;
	
	private Validaciones validaciones;
	
	
	
	public CrearProfesor(Principal p, final Dpto dpto) {
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		buttonGroup = new ButtonGroup();
		validaciones = new Validaciones();
		getContentPane().setForeground(new Color(0, 0, 0));
		ppal = p;
		setUndecorated(true);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
				
		labelNombre = new JLabel("NOMBRE");
		labelNombre.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelNombre.setBounds(33, 141, 76, 16);
		getContentPane().add(labelNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(144, 140, 161, 22);
		getContentPane().add(textFieldNombre);
		
		labelCI = new JLabel("CI");
		labelCI.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelCI.setBounds(33, 201, 116, 16);
		getContentPane().add(labelCI);
		
		textFieldCI = new JTextField();
		textFieldCI.setColumns(10);
		textFieldCI.setBounds(145, 200, 161, 22);
		getContentPane().add(textFieldCI);
		
		labelCatCientif = new JLabel("CAT. CIENTIFICA");
		labelCatCientif.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelCatCientif.setBounds(354, 201, 116, 16);
		getContentPane().add(labelCatCientif);
		
		labelCatDoc = new JLabel("CAT. DOCENTE");
		labelCatDoc.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelCatDoc.setBounds(354, 141, 116, 16);
		getContentPane().add(labelCatDoc);
		
		labelDisponibilidad = new JLabel("DISPONIBILIDAD");
		labelDisponibilidad.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelDisponibilidad.setBounds(352, 256, 132, 16);
		getContentPane().add(labelDisponibilidad);
		
		labelSalarioBase = new JLabel("SALARIO BASE");
		labelSalarioBase.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelSalarioBase.setBounds(33, 256, 116, 16);
		getContentPane().add(labelSalarioBase);
		
		spinnerAntiguedad = new JSpinner();
		spinnerAntiguedad.setModel(new SpinnerNumberModel(0, 0, 80, 1));
		spinnerAntiguedad.setFocusable(false);
		spinnerAntiguedad.setBounds(144, 309, 55, 22);
		getContentPane().add(spinnerAntiguedad);
		JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor)spinnerAntiguedad.getEditor();
		editor.getTextField().setEditable(false);
		
		noAutorizado = new JRadioButton("No");
		noAutorizado.setEnabled(false);
		noAutorizado.setBounds(562, 307, 50, 25);
		getContentPane().add(noAutorizado);
		
		autorizado = new JRadioButton("S\u00ED");
		autorizado.setSelected(true);
		autorizado.setEnabled(false);
		autorizado.setBounds(507, 307, 55, 25);
		getContentPane().add(autorizado);
		
		labelAutorizacion = new JLabel("AUTORIZACI\u00D3N");
		labelAutorizacion.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelAutorizacion.setBounds(352, 310, 132, 16);
		getContentPane().add(labelAutorizacion);
		
		comboBoxDisp = new JComboBox();
		comboBoxDisp.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "Beca", "Licencia", "Liberado"}));
		comboBoxDisp.setBounds(496, 256, 116, 22);
		getContentPane().add(comboBoxDisp);
		
		lblDatosPersonales = new JLabel("DATOS PERSONALES");
		lblDatosPersonales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPersonales.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatosPersonales.setBounds(84, 77, 235, 21);
		getContentPane().add(lblDatosPersonales);
		
		lblDatosProfesionales = new JLabel("DATOS PROFESIONALES");
		lblDatosProfesionales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosProfesionales.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatosProfesionales.setBounds(354, 77, 235, 21);
		getContentPane().add(lblDatosProfesionales);
		
		JPanel panel = new JPanel();
		//panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel.setLayout(null);
		panel.setBounds(0, 0, 654, 43);
		getContentPane().add(panel);
		
		JLabel lblAgregarProfesor = new JLabel("AGREGAR PROFESOR");
		lblAgregarProfesor.setHorizontalAlignment(SwingConstants.LEFT);
		lblAgregarProfesor.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAgregarProfesor.setBounds(12, 5, 448, 35);
		panel.add(lblAgregarProfesor);
		
		JButton button = new JButton("X");
		button.setBounds(599, -2, 55, 43);
		panel.add(button);
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
		
		buttonGroup.add(autorizado);
		buttonGroup.add(noAutorizado);
		

		button_1 = new JButton("");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String ci = textFieldCI.getText();

		        if (validaciones.validarVacio(textFieldNombre, "Nombre") && 
		            validaciones.contieneNumeros(textFieldNombre, "Nombre") &&
		            validaciones.validarCI(textFieldCI) &&
		            validaciones.validarSeleccion(comboBoxCatCientif, "Categoria Cientifica") &&
		            validaciones.validarSeleccion(comboBoxCatDoc, "Categoria Docente")) {
		        	
		            if (dpto.existeProfesorConCI(ci)) {
		                JOptionPane.showMessageDialog(CrearProfesor.this, 
		                    "Ya existe un profesor con este numero de CI.",
		                    "CI Duplicado",
		                    JOptionPane.WARNING_MESSAGE);
		            } else {
		                p1 = crearProfesor(dpto);
		                JOptionPane.showMessageDialog(CrearProfesor.this, 
		                    "Profesor agregado de manera satisfactoria.",
		                    "Éxito",
		                    JOptionPane.INFORMATION_MESSAGE);
		                dispose();
		            }
		        }
		    }
		});
		button_1.setIcon(new ImageIcon(CrearProfesor.class.getResource("/imagenes/Button.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(251, 400, 161, 63);
		getContentPane().add(button_1);
		
		comboBoxCatDoc = new JComboBox();
		comboBoxCatDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = (String) comboBoxCatDoc.getSelectedItem();

				if(item.equals("Adiestrado")){
					noAutorizado.setEnabled(true);
					autorizado.setEnabled(true);
					comboBoxCatCientif.setSelectedItem("Ninguno");
					comboBoxCatCientif.setEnabled(false);
				}
				else if(item.equals("Profesor Titular")){
					noAutorizado.setEnabled(false);
					autorizado.setEnabled(false);
					comboBoxCatCientif.setSelectedIndex(1);
				}
				else{
					noAutorizado.setEnabled(false);
					autorizado.setEnabled(false);
				}
					
			}
		});
		
		

		comboBoxCatDoc.setModel(new DefaultComboBoxModel(new String[] {"Profesor Titular", "Auxiliar", "Asistente", "Instructor", "ATD", "Adiestrado"}));
		comboBoxCatDoc.setBounds(496, 141, 116, 22);
		getContentPane().add(comboBoxCatDoc);
		
		comboBoxCatCientif = new JComboBox();
		comboBoxCatCientif.setModel(new DefaultComboBoxModel(new String[] {"Ninguno", "Doctor en Ciencias", "Máster en Ciencias"}));
		comboBoxCatCientif.setBounds(496, 201, 116, 22);
		getContentPane().add(comboBoxCatCientif);
		
		JLabel lblAntiguedad = new JLabel("ANTIGUEDAD");
		lblAntiguedad.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAntiguedad.setBounds(33, 310, 106, 16);
		getContentPane().add(lblAntiguedad);
		
		spinnerSalario = new JSpinner();
		spinnerSalario.setModel(new SpinnerNumberModel(new Float(2500), new Float(2500), new Float(10000), new Float(25)));
		spinnerSalario.setFocusable(false);
		spinnerSalario.setBounds(144, 255, 97, 22);
		getContentPane().add(spinnerSalario);
	}
	
	
	public ProfesoresTableModel crearProfesor(Dpto dpto) {
	    String nombre = textFieldNombre.getText();
	    String iD = textFieldCI.getText();
	    String disponibilidad = (String) comboBoxDisp.getSelectedItem();
	    String catDoc = (String) comboBoxCatDoc.getSelectedItem();
	    String catCientif = (String) comboBoxCatCientif.getSelectedItem();
	    int antiguedad = (int) spinnerAntiguedad.getValue();
	    float salarioBase = (float) spinnerSalario.getValue();
	    boolean autorizacion = true;

	    if (buttonGroup.getSelection() == noAutorizado) {
	        autorizacion = false;
	    }

	    if (catDoc.equals("Adiestrado")) {
	        dpto.agregarAdiestrado(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif, autorizacion);
	        System.out.println("Adiestrado agregado");
	    } else {
	        dpto.agregarDocente(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif);
	        System.out.println("Docente agregado");
	    }

	    p1 = ppal.getProfesoresTableModel();
	    p1.adicionar(nombre, iD, disponibilidad, salarioBase, antiguedad, catDoc, catCientif, autorizacion);
	    return p1;
	}


}
