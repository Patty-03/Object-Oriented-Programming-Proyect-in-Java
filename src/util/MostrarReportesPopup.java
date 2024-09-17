package util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class MostrarReportesPopup extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JButton button_1;
	private JPanel panel;
	private JLabel label;
	private JButton button;

	public MostrarReportesPopup() {
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		setType(Type.POPUP);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 630, 500);
		getContentPane().setLayout(new BorderLayout());
		//contentPanel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 95, 606, 296);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel.setBounds(0, 0, 630, 40);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		label = new JLabel("Titulo");
		label.setBounds(12, 0, 558, 40);
		label.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel.add(label);
		
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
		button_1.setBounds(582, 0, 48, 40);
		panel.add(button_1);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setIcon(new ImageIcon(MostrarReportesPopup.class.getResource("/imagenes/Button.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(234, 424, 161, 63);
		contentPanel.add(button);
	}
	
	public void recibirInfo(String info, DefaultTableModel tablemodel){
		label.setText(info);
		table.setModel(tablemodel);
	}
}