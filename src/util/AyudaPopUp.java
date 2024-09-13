package util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class AyudaPopUp extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JButton button;

	public AyudaPopUp() {
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setType(Type.POPUP);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		//contentPanel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 40);
		//panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		contentPanel.add(panel);
		panel.setLayout(null);
		
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
		button.setBounds(402, 0, 48, 40);
		panel.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("Ayuda");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1.setBounds(12, 0, 96, 40);
		panel.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("<html><body>El Sistema est\u00E1 dise\u00F1ado para visualizar y/o crear la planificaci\u00F3n de la carga docente de los diferentes semestres del curso.\r\n<br>\r\nPara acceder a las diferentes opciones navegue a trav\u00E9s del men\u00FA lateral.</body></html>");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(12, 72, 426, 125);
		contentPanel.add(lblNewLabel);
		
		JButton button_1 = new JButton("");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(AyudaPopUp.class.getResource("/imagenes/Button.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(144, 224, 161, 63);
		contentPanel.add(button_1);
	}
}
