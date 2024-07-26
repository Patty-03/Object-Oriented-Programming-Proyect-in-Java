package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
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

public class AutenticCorrecta extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private Imagen imagen;
	private BotonAnimacion botonAnimacion;
	private JLabel lblNewLabel;
	private AvatarCircular avatarCircular;
	private Imagen imagen_1;

	/**
	 * Create the dialog.
	 */
	public AutenticCorrecta() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setUndecorated(true);
		setBounds(100, 100, 299, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		imagen = new Imagen((Icon) null);
		imagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		imagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		imagen.setImagen(new ImageIcon(AutenticCorrecta.class.getResource("/images/x-regular-240.png")));
		imagen.setBounds(251, 0, 37, 37);
		contentPanel.add(imagen);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 34, 276, 287);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		botonAnimacion = new BotonAnimacion();
		botonAnimacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botonAnimacion.setText("Continuar");
		botonAnimacion.setForeground(Color.WHITE);
		botonAnimacion.setFont(new Font("Aller", Font.PLAIN, 20));
		botonAnimacion.setFocusable(false);
		botonAnimacion.setColorEfecto(new Color(102, 153, 102));
		botonAnimacion.setBackground(new Color(48, 107, 91));
		botonAnimacion.setBounds(80, 226, 116, 38);
		panel.add(botonAnimacion);
		
		lblNewLabel = new JLabel("Sesi\u00F3n iniciada con \u00E9xito");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 156, 252, 33);
		panel.add(lblNewLabel);
		
		avatarCircular = new AvatarCircular();
		avatarCircular.setForeground(Color.WHITE);
		avatarCircular.setBackground(Color.WHITE);
		avatarCircular.setTamBorde(2);
		avatarCircular.setAvatar(new ImageIcon(AutenticCorrecta.class.getResource("/images/firewallcheck.png")));
		avatarCircular.setBounds(65, 13, 145, 130);
		panel.add(avatarCircular);
		
		imagen_1 = new Imagen((Icon) null);
		imagen_1.setBounds(0, 0, 276, 353);
		imagen_1.setImagen(new ImageIcon(AutenticCorrecta.class.getResource("/images/bg.png")));
		panel.add(imagen_1);
	}
}
