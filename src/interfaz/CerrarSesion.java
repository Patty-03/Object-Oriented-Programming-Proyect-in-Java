package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import componentesVisuales.AvatarCircular;
import componentesVisuales.BotonAnimacion;
import componentesVisuales.Imagen;

public class CerrarSesion extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private Imagen imagen;
	private AvatarCircular avatarCircular;


	/**
	 * Create the dialog.
	 */
	public CerrarSesion() {
		setUndecorated(true);
		setBounds(100, 100, 300, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setForeground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		Imagen imagen_1 = new Imagen((Icon) null);
		imagen_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		imagen_1.setImagen(new ImageIcon(CerrarSesion.class.getResource("/images/x-regular-240.png")));
		imagen_1.setBounds(251, 0, 37, 37);
		contentPanel.add(imagen_1);
		
		BotonAnimacion botonAnimacion = new BotonAnimacion();
		botonAnimacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Autenticacion a1 = new Autenticacion();
				a1.setVisible(true);
				dispose();
			}
		});
		botonAnimacion.setText("Continuar");
		botonAnimacion.setForeground(Color.WHITE);
		botonAnimacion.setFont(new Font("Aller", Font.PLAIN, 20));
		botonAnimacion.setFocusable(false);
		botonAnimacion.setColorEfecto(new Color(102, 153, 102));
		botonAnimacion.setBackground(new Color(48, 107, 91));
		botonAnimacion.setBounds(92, 260, 116, 38);
		contentPanel.add(botonAnimacion);
		
		lblNewLabel = new JLabel("Sesi\u00F3n cerrada con \u00E9xito");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 210, 276, 27);
		contentPanel.add(lblNewLabel);
		
		avatarCircular = new AvatarCircular();
		avatarCircular.setForeground(Color.WHITE);
		avatarCircular.setTamBorde(2);
		avatarCircular.setBackground(Color.WHITE);
		avatarCircular.setAvatar(new ImageIcon(CerrarSesion.class.getResource("/images/Error Shield.png")));
		avatarCircular.setBounds(75, 56, 145, 130);
		contentPanel.add(avatarCircular);
		
		imagen = new Imagen((Icon) null);
		imagen.setBounds(12, 32, 276, 295);
		imagen.setImagen(new ImageIcon(CerrarSesion.class.getResource("/images/bg.png")));
		contentPanel.add(imagen);
	}
}
