package util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class CrearPlanifPanel extends JPanel{
	public CrearPlanifPanel() {
		setBounds(new Rectangle(0, 0, 530, 412));
		setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setBounds(261, 13, 2, 255);
		add(separator);
		
		JLabel lblSemestre = new JLabel("SEMESTRE");
		lblSemestre.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSemestre.setBounds(22, 54, 183, 16);
		add(lblSemestre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(192, 54, 31, 22);
		add(comboBox);
		
		JLabel lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDatos.setBounds(12, 13, 237, 16);
		add(lblDatos);
		
		JLabel lblProfesor = new JLabel("PROFESOR");
		lblProfesor.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblProfesor.setBounds(22, 102, 183, 16);
		add(lblProfesor);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(192, 102, 31, 22);
		add(comboBox_1);
		
		JLabel lblAsignatura = new JLabel("ASIGNATURA");
		lblAsignatura.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAsignatura.setBounds(22, 159, 183, 16);
		add(lblAsignatura);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(192, 159, 31, 22);
		add(comboBox_2);
		
		JLabel label = new JLabel("CONFERENCIA");
		label.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label.setBounds(285, 54, 116, 21);
		add(label);
		
		JLabel label_1 = new JLabel("CLASE PRACTICA");
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_1.setBounds(285, 101, 149, 21);
		add(label_1);
		
		JLabel label_2 = new JLabel("LABORATORIO");
		label_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_2.setBounds(285, 157, 149, 21);
		add(label_2);
		
		JLabel label_3 = new JLabel("TALLER");
		label_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_3.setBounds(285, 203, 149, 21);
		add(label_3);
		
		JLabel label_4 = new JLabel("SEMINARIO");
		label_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_4.setBounds(285, 247, 149, 21);
		add(label_4);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(475, 52, 31, 21);
		add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(475, 100, 31, 21);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(475, 157, 31, 21);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(475, 203, 31, 21);
		add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(475, 247, 31, 21);
		add(checkBox_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setBounds(12, 281, 506, 2);
		add(separator_1);
		
		JLabel lblTipoDeEnseanza = new JLabel("TIPO DE ENSE\u00D1ANZA");
		lblTipoDeEnseanza.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeEnseanza.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblTipoDeEnseanza.setBounds(275, 15, 243, 16);
		add(lblTipoDeEnseanza);
		
		JLabel lblGrupos = new JLabel("GRUPOS");
		lblGrupos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupos.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblGrupos.setBounds(12, 296, 506, 16);
		add(lblGrupos);
		
		JLabel lblIf = new JLabel("IF-11");
		lblIf.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIf.setBounds(12, 327, 68, 21);
		add(lblIf);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(79, 327, 31, 21);
		add(checkBox_5);
		
		JLabel lblIf_1 = new JLabel("IF-12");
		lblIf_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIf_1.setBounds(12, 365, 68, 21);
		add(lblIf_1);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(79, 365, 31, 21);
		add(checkBox_6);
		
		JLabel lblIf_2 = new JLabel("IF-21");
		lblIf_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIf_2.setBounds(151, 325, 68, 21);
		add(lblIf_2);
		
		JCheckBox checkBox_7 = new JCheckBox("");
		checkBox_7.setBounds(218, 325, 31, 21);
		add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("");
		checkBox_8.setBounds(218, 363, 31, 21);
		add(checkBox_8);
		
		JLabel lblIf_3 = new JLabel("IF-22");
		lblIf_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIf_3.setBounds(151, 363, 68, 21);
		add(lblIf_3);
		
		JLabel lblIf_4 = new JLabel("IF-31");
		lblIf_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIf_4.setBounds(275, 325, 68, 21);
		add(lblIf_4);
		
		JCheckBox checkBox_9 = new JCheckBox("");
		checkBox_9.setBounds(342, 325, 31, 21);
		add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("");
		checkBox_10.setBounds(342, 363, 31, 21);
		add(checkBox_10);
		
		JLabel lblIf_5 = new JLabel("IF-32");
		lblIf_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIf_5.setBounds(275, 363, 68, 21);
		add(lblIf_5);
		
		JLabel lblIf_6 = new JLabel("IF-41");
		lblIf_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIf_6.setBounds(398, 325, 68, 21);
		add(lblIf_6);
		
		JCheckBox checkBox_11 = new JCheckBox("");
		checkBox_11.setBounds(465, 325, 31, 21);
		add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("");
		checkBox_12.setBounds(465, 363, 31, 21);
		add(checkBox_12);
		
		JLabel lblIf_7 = new JLabel("IF-42");
		lblIf_7.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblIf_7.setBounds(398, 363, 68, 21);
		add(lblIf_7);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(90, 39, 84, 2);
		add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(307, 39, 189, 2);
		add(separator_3);
	}
	private static final long serialVersionUID = 1L;
	
	

}
