package util;

import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CrearProfPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel labelNombre;
	private JLabel labelApellidos;
	private JLabel labelCI;
	private JLabel labelCatDoc;
	private JLabel labelCatCientif;
	private JLabel labelDisponibilidad;
	private JLabel labelSalarioBase;
	private JSpinner spinner;
	private JLabel labelAdiestrado;
	private JLabel labelAutorizacion;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JSeparator separator_2;
	private JLabel lblDatosPersonales;
	private JSeparator separator_3;
	private JLabel lblDatosProfesionales;
	public CrearProfPanel() {
		setBounds(new Rectangle(0, 0, 515, 412));
		setLayout(null);
		
		labelNombre = new JLabel("NOMBRE");
		labelNombre.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelNombre.setBounds(8, 89, 76, 16);
		add(labelNombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(110, 85, 116, 22);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 157, 116, 22);
		add(textField_1);
		
		labelApellidos = new JLabel("APELLIDOS");
		labelApellidos.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelApellidos.setBounds(8, 159, 116, 16);
		add(labelApellidos);
		
		labelCI = new JLabel("CI");
		labelCI.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelCI.setBounds(8, 229, 116, 16);
		add(labelCI);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 229, 116, 22);
		add(textField_2);
		
		labelCatCientif = new JLabel("CAT. CIENTIF");
		labelCatCientif.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelCatCientif.setBounds(248, 138, 116, 16);
		add(labelCatCientif);
		
		labelCatDoc = new JLabel("CAT. DOC");
		labelCatDoc.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelCatDoc.setBounds(252, 78, 116, 16);
		add(labelCatDoc);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(379, 80, 116, 22);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(379, 137, 116, 22);
		add(textField_4);
		
		labelDisponibilidad = new JLabel("DISPONIBILIDAD");
		labelDisponibilidad.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelDisponibilidad.setBounds(245, 198, 132, 16);
		add(labelDisponibilidad);
		
		labelSalarioBase = new JLabel("SALARIO BASE");
		labelSalarioBase.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelSalarioBase.setBounds(8, 299, 116, 16);
		add(labelSalarioBase);
		
		spinner = new JSpinner();
		spinner.setBounds(168, 298, 55, 22);
		add(spinner);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 266, 491, 2);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(238, 14, 2, 237);
		add(separator_1);
		
		labelAdiestrado = new JLabel("ADIESTRADO");
		labelAdiestrado.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelAdiestrado.setBounds(245, 299, 132, 16);
		add(labelAdiestrado);
		
		radioButton = new JRadioButton("S\u00ED");
		radioButton.setBounds(388, 294, 39, 25);
		add(radioButton);
		
		radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(445, 294, 50, 25);
		add(radioButton_1);
		
		radioButton_2 = new JRadioButton("No");
		radioButton_2.setBounds(445, 354, 50, 25);
		add(radioButton_2);
		
		radioButton_3 = new JRadioButton("S\u00ED");
		radioButton_3.setBounds(391, 354, 39, 25);
		add(radioButton_3);
		
		labelAutorizacion = new JLabel("AUTORIZACI\u00D3N");
		labelAutorizacion.setFont(new Font("Segoe UI", Font.BOLD, 15));
		labelAutorizacion.setBounds(248, 356, 132, 16);
		add(labelAutorizacion);
		
		JComboBox comboBoxDisp = new JComboBox();
		comboBoxDisp.setBounds(464, 197, 31, 22);
		add(comboBoxDisp);
		
		separator_2 = new JSeparator();
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(24, 33, 188, 2);
		add(separator_2);
		
		lblDatosPersonales = new JLabel("DATOS PERSONALES");
		lblDatosPersonales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPersonales.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatosPersonales.setBounds(-3, 13, 235, 21);
		add(lblDatosPersonales);
		
		separator_3 = new JSeparator();
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(279, 33, 188, 2);
		add(separator_3);
		
		lblDatosProfesionales = new JLabel("DATOS PROFESIONALES");
		lblDatosProfesionales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosProfesionales.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatosProfesionales.setBounds(252, 13, 235, 21);
		add(lblDatosProfesionales);
	}
}
