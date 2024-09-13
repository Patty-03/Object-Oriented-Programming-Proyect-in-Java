package interfaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logica.Dpto;
import util.Autenticacion;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userTextField;
	private JPasswordField passwordField;
	private JLabel texto;
	private JButton btnNewButton;
	private JButton btnCancelar;
	private JLabel lblNombreDeUsuario;
	private JLabel lblContrasenna;
	private JLabel lblNewLabel_1;
	private Autenticacion a1; 
	private LoginCorrecto lc1;


	public Login(final Dpto dpto) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);		
		btnCancelar = new JButton("");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setIcon(new ImageIcon(Login.class.getResource("/imagenes/CancelButton.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnCancelar.setFocusPainted(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(677, 468, 178, 50);
		contentPane.add(btnCancelar);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1 = new Autenticacion("admin", "1234");
				lc1 = new LoginCorrecto(dpto);
				@SuppressWarnings("deprecation")
				String textoError = a1.comprobarLogin(userTextField.getText(), passwordField.getText());
				if(textoError.equals("")){
					lc1.setVisible(true);
					dispose();
				}
				else
					texto.setText(textoError);	
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/imagenes/Button.png")));
		btnNewButton.setMnemonic(KeyEvent.VK_ENTER);
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(487, 468, 178, 50);
		contentPane.add(btnNewButton);
		
		userTextField = new JTextField();
		userTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		userTextField.setCaretColor(Color.BLACK);
		userTextField.setBorder(null);
		userTextField.setForeground(Color.DARK_GRAY);
		userTextField.setToolTipText("Nombre de usuario\r\n");
		userTextField.setBounds(487, 278, 445, 27);
		contentPane.add(userTextField);
		userTextField.setColumns(10);
		
		texto = new JLabel("");
		texto.setForeground(new Color(255, 51, 51));
		texto.setFont(new Font("Segoe UI", Font.BOLD, 20));
		texto.setBounds(487, 424, 445, 31);
		contentPane.add(texto);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		passwordField.setBounds(487, 384, 445, 27);
		contentPane.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(487, 307, 445, 7);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBounds(487, 411, 445, 7);
		contentPane.add(separator_1);
		
		lblContrasenna = new JLabel("Contrase\u00F1a");
		lblContrasenna.setForeground(Color.DARK_GRAY);
		lblContrasenna.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblContrasenna.setBounds(487, 354, 314, 22);
		contentPane.add(lblContrasenna);
		
		lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setForeground(Color.DARK_GRAY);
		lblNombreDeUsuario.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNombreDeUsuario.setBounds(487, 249, 314, 27);
		contentPane.add(lblNombreDeUsuario);
		
		lblNewLabel_1 = new JLabel("AUTENTICACION");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(487, 93, 314, 113);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagenes/Animacion Login.gif")));
		lblNewLabel.setBounds(0, 0, 1000, 600);
		contentPane.add(lblNewLabel);		
	}
}
