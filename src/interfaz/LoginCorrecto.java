package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
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
import java.awt.Cursor;
import java.awt.event.KeyAdapter;

public class LoginCorrecto extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton button;
	private JLabel lblCorrecta;
	private JLabel lblAutenticacion;
	private Principal p1; 

	public LoginCorrecto(final Dpto dpto) {
		setUndecorated(true);
		setBounds(100, 100, 300, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		lblAutenticacion = new JLabel("AUTENTICACION");
		lblAutenticacion.setForeground(Color.DARK_GRAY);
		lblAutenticacion.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		lblAutenticacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutenticacion.setBounds(0, 214, 300, 27);
		contentPanel.add(lblAutenticacion);
		
		lblCorrecta = new JLabel("CORRECTA");
		lblCorrecta.setForeground(new Color(64, 64, 64));
		lblCorrecta.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		lblCorrecta.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorrecta.setBounds(0, 246, 300, 27);
		contentPanel.add(lblCorrecta);
		
		button = new JButton("");
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				p1 = new Principal(dpto);
				dispose();
				p1.setVisible(true);
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setOpaque(false);
		button.setFocusPainted(false);
		//button.setSelectedIcon(new ImageIcon("/imagenes/AcceptPressedButton.png"));
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1 = new Principal(dpto);
				dispose();
				p1.setVisible(true);
			}
		});
		button.setBounds(50, 337, 200, 50);
		button.setIcon(new ImageIcon(LoginCorrecto.class.getResource("/imagenes/Button.png")));
		contentPanel.add(button);
		button.setMnemonic(KeyEvent.VK_ENTER);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 300, 400);
		label.setIcon(new ImageIcon(LoginCorrecto.class.getResource("/imagenes/loginCorrecto.png")));
		contentPanel.add(label);
	}
}
