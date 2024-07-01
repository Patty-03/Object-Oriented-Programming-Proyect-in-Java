package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import componentesVisuales.AvatarCircular;
import componentesVisuales.BotonAnimacion;
import componentesVisuales.Imagen;
import java.awt.Cursor;

public class Autenticacion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField userNameInput;
	private JPasswordField passInput;
	MenuPpal m1 = new MenuPpal();
	private JLabel incorrectDataLbl;
	private JLabel lblContrasea;
	private JLabel lblNombreDeUsuario;
	private JLabel lblIniciarSesin;
	private AvatarCircular avatarCircular;
	private BotonAnimacion btnmcnCancelar;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=378,214
	 */

	/**
	 * @wbp.nonvisual location=31,54
	 */

	/**
	 * Create the frame.
	 */
	public Autenticacion() {
		setUndecorated(true);
		
		setTitle("Iniciar sesi\u00F3n");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 576);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblNombreDeUsuario = new JLabel("Usuario");
		lblNombreDeUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNombreDeUsuario.setBounds(55, 298, 68, 22);
		contentPane.add(lblNombreDeUsuario);
		
		userNameInput = new JTextField();
		userNameInput.setFont(new Font("Aller", Font.PLAIN, 15));
		userNameInput.setBounds(281, 301, 116, 22);
		contentPane.add(userNameInput);
		userNameInput.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblContrasea.setBounds(55, 339, 115, 22);
		contentPane.add(lblContrasea);
		
		passInput = new JPasswordField();
		passInput.setFont(new Font("Aller", Font.PLAIN, 20));
		passInput.setColumns(10);
		passInput.setBounds(281, 341, 116, 22);
		contentPane.add(passInput);
		
		lblIniciarSesin = new JLabel("INICIAR SESI\u00D3N");
		lblIniciarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblIniciarSesin.setBounds(150, 230, 171, 38);
		contentPane.add(lblIniciarSesin);
		
		incorrectDataLbl = new JLabel("Usuario o contrase\u00F1a incorrectos");
		incorrectDataLbl.setFont(new Font("Segoe UI", Font.BOLD, 20));
		incorrectDataLbl.setForeground(new Color(255, 0, 51));
		incorrectDataLbl.setBounds(72, 395, 327, 27);
		incorrectDataLbl.setVisible(false);
		contentPane.add(incorrectDataLbl);
		
		avatarCircular = new AvatarCircular();
		avatarCircular.setAvatar(new ImageIcon(Autenticacion.class.getResource("/images/Users.png")));
		avatarCircular.setBounds(150, 50, 171, 171);
		contentPane.add(avatarCircular);
		
		btnmcnCancelar = new BotonAnimacion();
		btnmcnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnmcnCancelar.setFocusable(false);
		btnmcnCancelar.setColorEfecto(SystemColor.infoText);
		btnmcnCancelar.setForeground(new Color(255, 255, 255));
		btnmcnCancelar.setFont(new Font("Aller", Font.PLAIN, 20));
		btnmcnCancelar.setText("Salir");
		btnmcnCancelar.setBackground(new Color(78,78,78));
		btnmcnCancelar.setBounds(86, 464, 110, 38);
		contentPane.add(btnmcnCancelar);
		
		BotonAnimacion btnmcnContinuar = new BotonAnimacion();
		btnmcnContinuar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if((userNameInput.getText().equals("profesor1") && passInput.getText().equals("1234")) 
						|| (userNameInput.getText().equals("admin") && passInput.getText().equals("5678"))){
					AutenticCorrecta ac1 = new AutenticCorrecta();
					setVisible(false);
					ac1.setVisible(true);
					m1.setVisible(true);
				}
				else{
					incorrectDataLbl.setVisible(true);
				}
			}
		});
		btnmcnContinuar.setText("Continuar");
		btnmcnContinuar.setForeground(Color.WHITE);
		btnmcnContinuar.setFont(new Font("Aller", Font.PLAIN, 20));
		btnmcnContinuar.setFocusable(false);
		btnmcnContinuar.setColorEfecto(new Color(102, 153, 102));
		btnmcnContinuar.setBackground(new Color(48, 107, 91));
		btnmcnContinuar.setBounds(270, 464, 116, 38);
		contentPane.add(btnmcnContinuar);
		
		Imagen imagen = new Imagen((Icon) null);
		imagen.setImagen(new ImageIcon(Autenticacion.class.getResource("/images/bg.png")));
		imagen.setForeground(Color.WHITE);
		imagen.setBounds(12, 35, 448, 528);
		contentPane.add(imagen);
		
		Imagen imagen_1 = new Imagen((Icon) null);
		imagen_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		imagen_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		imagen_1.setImagen(new ImageIcon(Autenticacion.class.getResource("/images/x-regular-240.png")));
		imagen_1.setBounds(423, 0, 37, 38);
		contentPane.add(imagen_1);
	}
}
