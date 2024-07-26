package util;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CrearAsigPanel extends JPanel{
	public CrearAsigPanel() {
		setBounds(new Rectangle(0, 0, 530, 412));
		setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(287, 25, 1, 356);
		add(separator);
		
		label = new JLabel("NOMBRE");
		label.setBounds(12, 81, 65, 21);
		label.setFont(new Font("Segoe UI", Font.BOLD, 15));
		add(label);
		
		textField = new JTextField();
		textField.setBounds(132, 82, 116, 22);
		textField.setColumns(10);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 138, 116, 22);
		textField_1.setColumns(10);
		add(textField_1);
		
		lblDisciplina = new JLabel("DISCIPLINA");
		lblDisciplina.setBounds(12, 137, 108, 21);
		lblDisciplina.setFont(new Font("Segoe UI", Font.BOLD, 15));
		add(lblDisciplina);
		
		lblPlanDeEstudio = new JLabel("PLAN DE ESTUDIO");
		lblPlanDeEstudio.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblPlanDeEstudio.setBounds(12, 193, 183, 16);
		add(lblPlanDeEstudio);
		
		comboBox = new JComboBox();
		comboBox.setBounds(217, 192, 31, 22);
		add(comboBox);
		
		lblConferencia = new JLabel("CONFERENCIA");
		lblConferencia.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblConferencia.setBounds(300, 86, 116, 21);
		add(lblConferencia);
		
		checkBox = new JCheckBox("");
		checkBox.setBounds(480, 86, 31, 21);
		add(checkBox);
		
		lblClasePractica = new JLabel("CLASE PRACTICA");
		lblClasePractica.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblClasePractica.setBounds(300, 147, 149, 21);
		add(lblClasePractica);
		
		checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(480, 147, 31, 21);
		add(checkBox_1);
		
		lblLaboratorio = new JLabel("LABORATORIO");
		lblLaboratorio.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblLaboratorio.setBounds(300, 208, 149, 21);
		add(lblLaboratorio);
		
		checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(480, 208, 31, 21);
		add(checkBox_2);
		
		lblTaller = new JLabel("TALLER");
		lblTaller.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblTaller.setBounds(300, 269, 149, 21);
		add(lblTaller);
		
		checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(480, 269, 31, 21);
		add(checkBox_3);
		
		lblSeminario = new JLabel("SEMINARIO");
		lblSeminario.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSeminario.setBounds(300, 330, 149, 21);
		add(lblSeminario);
		
		checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(480, 330, 31, 21);
		add(checkBox_4);
		
		lblTipoEnseanza = new JLabel("TIPO ENSE\u00D1ANZA");
		lblTipoEnseanza.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoEnseanza.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblTipoEnseanza.setBounds(287, 25, 224, 21);
		add(lblTipoEnseanza);
		
		lblDatosGenerales = new JLabel("DATOS GENERALES");
		lblDatosGenerales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosGenerales.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatosGenerales.setBounds(12, 25, 259, 21);
		add(lblDatosGenerales);
		
		lblCarrera = new JLabel("CARRERA");
		lblCarrera.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCarrera.setBounds(12, 244, 108, 21);
		add(lblCarrera);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(132, 245, 116, 22);
		add(textField_2);
		
		lblAo = new JLabel("A\u00D1O");
		lblAo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAo.setBounds(12, 300, 183, 16);
		add(lblAo);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(217, 299, 31, 22);
		add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(217, 350, 31, 22);
		add(comboBox_2);
		
		lblEvaluacionFinal = new JLabel("EVALUACION FINAL");
		lblEvaluacionFinal.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblEvaluacionFinal.setBounds(12, 351, 183, 16);
		add(lblEvaluacionFinal);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setBounds(59, 44, 165, 2);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(320, 44, 165, 2);
		add(separator_2);
	}
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblPlanDeEstudio;
	private JComboBox comboBox;
	private JTextField textField_2;
	private JLabel lblDatosGenerales;
	private JLabel lblTipoEnseanza;
	private JLabel lblDisciplina;
	private JLabel label;
	private JLabel lblCarrera;
	private JLabel lblAo;
	private JLabel lblEvaluacionFinal;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JLabel lblConferencia;
	private JLabel lblClasePractica;
	private JLabel lblLaboratorio;
	private JLabel lblTaller;
	private JLabel lblSeminario;
	private JCheckBox checkBox_4;
	private JCheckBox checkBox_3;
	private JCheckBox checkBox_2;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox;
}
