package util;

import interfaz.Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.Dpto;

public class CerrarSesion extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblestSeguroDe;
	private JButton acceptBtn;

	public CerrarSesion(final Dpto dpto) {
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setType(Type.POPUP);
		setUndecorated(true);
		setBounds(100, 100, 354, 440);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		{
			acceptBtn = new JButton("");
			acceptBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			acceptBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login l1 = new Login(dpto);
					l1.setVisible(true);
					dispose();
				}
			});
			acceptBtn.setIcon(new ImageIcon(CerrarSesion.class.getResource("/imagenes/Button.png")));
			acceptBtn.setOpaque(false);
			acceptBtn.setMnemonic(KeyEvent.VK_ENTER);
			acceptBtn.setForeground(Color.BLACK);
			acceptBtn.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			acceptBtn.setFocusPainted(false);
			acceptBtn.setContentAreaFilled(false);
			acceptBtn.setBorderPainted(false);
			acceptBtn.setBorder(null);
			acceptBtn.setBackground(Color.WHITE);
			acceptBtn.setBounds(77, 355, 200, 50);
			contentPanel.add(acceptBtn);
		}
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CerrarSesion.class.getResource("/imagenes/Error Shield.png")));
		label.setBounds(49, 32, 256, 232);
		contentPanel.add(label);
		{
			lblestSeguroDe = new JLabel("Sesi\u00F3n cerrada con \u00E9xito");
			lblestSeguroDe.setForeground(Color.DARK_GRAY);
			lblestSeguroDe.setHorizontalAlignment(SwingConstants.CENTER);
			lblestSeguroDe.setFont(new Font("Segoe UI", Font.BOLD, 20));
			lblestSeguroDe.setBounds(0, 296, 354, 27);
			contentPanel.add(lblestSeguroDe);
		}
	}
}
