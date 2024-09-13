package util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import logica.Dpto;
import javax.swing.ImageIcon;

public class InfoDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNombre;
	private JLabel labelFacultad;
	private JLabel labelJefeDpto;
	private JButton button;
	private JButton button_1;


	public InfoDialog(Dpto d) {
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		setFont(new Font("Segoe UI", Font.PLAIN, 15));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setType(Type.POPUP);
		setUndecorated(true);
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(new BorderLayout());
		//contentPanel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		//panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel.setBounds(0, 0, 450, 42);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		button = new JButton("X");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setToolTipText("Salir");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Segoe UI", Font.BOLD, 25));
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorder(null);
		button.setBackground(Color.GRAY);
		button.setBounds(402, 0, 48, 40);
		panel.add(button);
		
		JLabel lblNewLabel = new JLabel("INFORMACI\u00D3N");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(12, 0, 145, 40);
		panel.add(lblNewLabel);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNombre.setBounds(10, 55, 426, 42);
		contentPanel.add(lblNombre);
		
		labelFacultad = new JLabel("Nombre:");
		labelFacultad.setFont(new Font("Segoe UI", Font.BOLD, 18));
		labelFacultad.setBounds(10, 140, 426, 42);
		contentPanel.add(labelFacultad);
		
		labelJefeDpto = new JLabel("Nombre:");
		labelJefeDpto.setFont(new Font("Segoe UI", Font.BOLD, 18));
		labelJefeDpto.setBounds(10, 225, 426, 42);
		contentPanel.add(labelJefeDpto);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setIcon(new ImageIcon(InfoDialog.class.getResource("/imagenes/Button.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(144, 324, 161, 63);
		contentPanel.add(button_1);
		
		cargarInfo(d);
	}
	
	public void cargarInfo(Dpto dpto){
		lblNombre.setText("Nombre del Dpto.: "+ dpto.getNombre());
		labelFacultad.setText("Facultad: "+ dpto.getFacultad());
		labelJefeDpto.setText("Jefe Dpto: "+ dpto.getNombreJefeDpto());

	}
}
