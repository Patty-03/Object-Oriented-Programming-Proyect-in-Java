package util;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AgregarPopup extends JDialog {
	private static final long serialVersionUID = 1L;
	private JButton button_1;
	private JButton button;
	private JDesktopPane desktopPane;
	private JButton button_2;
	private JPanel panel_1;
	private JLabel label;

	public AgregarPopup() {
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		getContentPane().setForeground(new Color(0, 0, 0));
		setType(Type.POPUP);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 738, 560);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		desktopPane = new JDesktopPane();
		desktopPane.setBorder(null);
		desktopPane.setBackground(SystemColor.control);
		desktopPane.setBounds(18, 67, 701, 372);
		getContentPane().add(desktopPane);


		button = new JButton("");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setIcon(new ImageIcon(AgregarPopup.class.getResource("/imagenes/Button.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(522, 484, 161, 63);
		getContentPane().add(button);

		button_1 = new JButton("");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(AgregarPopup.class.getResource("/imagenes/CancelButton.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(79, 484, 161, 63);
		getContentPane().add(button_1);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 738, 40);
		getContentPane().add(panel_1);

		label = new JLabel("Titulo");
		label.setFont(new Font("Segoe UI", Font.BOLD, 20));
		label.setBounds(22, 0, 311, 40);
		panel_1.add(label);

		button_2 = new JButton("X");
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setToolTipText("Salir");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		button_2.setFocusPainted(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorder(null);
		button_2.setBackground(Color.GRAY);
		button_2.setBounds(690, 0, 48, 40);
		panel_1.add(button_2);
	}

	public void addPanel(JPanel panel, String titulo){
		label.setText(titulo);
		desktopPane.removeAll();
		desktopPane.add(panel);
		panel.setBounds(0, 0, 701, 416);
	}
}
