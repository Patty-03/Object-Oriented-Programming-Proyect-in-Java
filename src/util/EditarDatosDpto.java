package util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import logica.Dpto;

public class EditarDatosDpto extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JTextField textFieldFacultad;
	private JTextField textFieldJefeDpto;
	private JButton button_1;
	private Validaciones validar;

	public EditarDatosDpto(final Dpto d) {
		setType(Type.POPUP);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setUndecorated(true);
		setBounds(100, 100, 500, 378);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		validar = new Validaciones();
		
		JButton button = new JButton("");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validar.validarVacio(textFieldNombre, "Nombre Dpto") && 
						validar.validarVacio(textFieldFacultad, "Facultad") && 
						validar.validarVacio(textFieldJefeDpto, "Jefe Dpto") &&
						validar.contieneNumeros(textFieldNombre, "Nombre Dpto") && 
						validar.contieneNumeros(textFieldFacultad, "Facultad") && 
						validar.contieneNumeros(textFieldJefeDpto, "Jefe Dpto")){
					d.setNombre(textFieldNombre.getText());
					d.setFacultad(textFieldFacultad.getText());
					d.setNombreJefeDpto(textFieldJefeDpto.getText());				
					
					JOptionPane.showMessageDialog(EditarDatosDpto.this, "Datos del departamento editados correctamente");
					dispose();
				}
			}
		});
		button.setIcon(new ImageIcon(EditarDatosDpto.class.getResource("/imagenes/Button.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(169, 290, 161, 63);
		contentPanel.add(button);
		
		JLabel lblEditarDepartamento = new JLabel("EDITAR DEPARTAMENTO");
		lblEditarDepartamento.setHorizontalAlignment(SwingConstants.LEFT);
		lblEditarDepartamento.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblEditarDepartamento.setBounds(12, 5, 443, 35);
		contentPanel.add(lblEditarDepartamento);
		
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
		button_1.setBounds(452, -1, 48, 40);
		contentPanel.add(button_1);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNombre.setBounds(106, 85, 102, 21);
		contentPanel.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(232, 86, 161, 22);
		contentPanel.add(textFieldNombre);
		
		JLabel lblFacultad = new JLabel("FACULTAD:");
		lblFacultad.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblFacultad.setBounds(87, 153, 121, 21);
		contentPanel.add(lblFacultad);
		
		textFieldFacultad = new JTextField();
		textFieldFacultad.setColumns(10);
		textFieldFacultad.setBounds(232, 154, 161, 22);
		contentPanel.add(textFieldFacultad);
		
		JLabel lblJefeDpto = new JLabel("JEFE DPTO. :");
		lblJefeDpto.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblJefeDpto.setBounds(87, 225, 121, 21);
		contentPanel.add(lblJefeDpto);
		
		textFieldJefeDpto = new JTextField();
		textFieldJefeDpto.setColumns(10);
		textFieldJefeDpto.setBounds(232, 226, 161, 22);
		contentPanel.add(textFieldJefeDpto);
	}
	
	public void ponerDatosActuales(String nombre, String facultad, String jefeDpto){
		textFieldNombre.setText(nombre);
		textFieldFacultad.setText(facultad);
		textFieldJefeDpto.setText(jefeDpto);
		
	}
}
