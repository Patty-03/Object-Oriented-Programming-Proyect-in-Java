package util;

import interfaz.Principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Rectangle;
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
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.*;
import java.awt.*;

import logica.Adiestrado;
import logica.Docente;
import logica.Dpto;
import util.Validaciones;
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
	private JSeparator separator_2;
	private JLabel lblDatosPersonales;
	private JSeparator separator_3;
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
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSpinner spinnerSalario;
	
	private Validaciones validaciones = new Validaciones();
	
	public CrearProfesor(Principal p, final Dpto dpto) {
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(11, 351, 491, 2);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(241, 77, 2, 237);
		getContentPane().add(separator_1);
		
		noAutorizado = new JRadioButton("No");
		noAutorizado.setEnabled(false);
		noAutorizado.setBounds(562, 307, 50, 25);
		getContentPane().add(noAutorizado);
		
		autorizado = new JRadioButton("S\u00ED");
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
		
		separator_2 = new JSeparator();
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(27, 96, 188, 2);
		getContentPane().add(separator_2);
		
		lblDatosPersonales = new JLabel("DATOS PERSONALES");
		lblDatosPersonales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPersonales.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatosPersonales.setBounds(84, 77, 235, 21);
		getContentPane().add(lblDatosPersonales);
		
		separator_3 = new JSeparator();
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(282, 96, 188, 2);
		getContentPane().add(separator_3);
		
		lblDatosProfesionales = new JLabel("DATOS PROFESIONALES");
		lblDatosProfesionales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosProfesionales.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatosProfesionales.setBounds(354, 77, 235, 21);
		getContentPane().add(lblDatosProfesionales);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
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
                if (validaciones.validarVacio(textFieldNombre, "Nombre") && 
                    validaciones.contieneNumeros(textFieldNombre, "Nombre") &&
                	validaciones.validarCI(textFieldCI) &&
                	validaciones.validarSeleccion(comboBoxCatCientif, getName()) &&
                	validaciones.validarSeleccion(comboBoxCatDoc, getName())){
                    p1 = crearProfesor(dpto);
                    JOptionPane.showMessageDialog(CrearProfesor.this, "Profesor agregado de manera satisfactoria");
                    dispose();
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
				}
				else{
					noAutorizado.setEnabled(false);
					autorizado.setEnabled(false);
				}
					
			}
		});
		
		

		comboBoxCatDoc.setModel(new DefaultComboBoxModel(new String[] {"Titular", "Auxiliar", "Asistente", "Instructor", "ATD", "Adiestrado"}));
		comboBoxCatDoc.setBounds(496, 141, 116, 22);
		getContentPane().add(comboBoxCatDoc);
		
		comboBoxCatCientif = new JComboBox();
		comboBoxCatCientif.setModel(new DefaultComboBoxModel(new String[] {"Ninguno", "Doctor en Ciencias", "M\u00E1ster"}));
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
	
	
	public ProfesoresTableModel crearProfesor(Dpto dpto){
		String nombre, iD, disponibilidad, catDoc, catCientif;
		int antiguedad;
		float salarioBase;
		boolean isAdiestrado = false;

		nombre = textFieldNombre.getText();
		iD = textFieldCI.getText();

		disponibilidad = (String) comboBoxDisp.getSelectedItem();
		catDoc = (String) comboBoxCatDoc.getSelectedItem();
		catCientif = (String) comboBoxCatCientif.getSelectedItem();
		antiguedad = (int) spinnerAntiguedad.getValue();
		salarioBase =  (float) spinnerSalario.getValue();
		
		comboBoxCatDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = (String) comboBoxCatDoc.getSelectedItem();
				if(item.equals("Adiestrado")){					
					noAutorizado.setEnabled(true);
					autorizado.setEnabled(true);
				} else {
					noAutorizado.setEnabled(false);
					autorizado.setEnabled(false);
				}
			}
		});
		
		if(catDoc.equals("Adiestrado")){
			isAdiestrado = true;
			dpto.agregarDocente(new Adiestrado(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif));
		} else {
			dpto.agregarDocente(new Docente(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif));
		}
		
		//dpto.agregarDocente(new Docente(iD, nombre, disponibilidad, salarioBase, antiguedad, catDoc, catCientif));
		p1 = ppal.getProfesoresTableModel();
		p1.adicionar(nombre, iD, disponibilidad, antiguedad, isAdiestrado, catDoc, catCientif);
		return p1;
	}
}
