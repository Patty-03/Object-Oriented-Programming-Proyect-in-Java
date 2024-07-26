package interfaz;

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

import componentesVisuales.AvatarCircular;
import componentesVisuales.BotonAnimacion;
import componentesVisuales.Imagen;
import java.awt.Cursor;

public class DatosDpto extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AvatarCircular avatarCircular;
	private BotonAnimacion botonAnimacion;
	private Imagen imagen_1;
	private JPanel panel;

	/**
	 * Create the dialog.
	 */
	public DatosDpto() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		getContentPane().setBackground(Color.DARK_GRAY);
		setUndecorated(true);
		setBackground(Color.DARK_GRAY);
		setBounds(100, 100, 450, 501);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		Imagen imagen = new Imagen((Icon) null);
		imagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		imagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		imagen.setImagen(new ImageIcon(DatosDpto.class.getResource("/images/x-regular-240.png")));
		imagen.setBounds(401, 0, 37, 38);
		getContentPane().add(imagen);
		
		panel = new JPanel();
		panel.setBounds(12, 37, 426, 451);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblJefeDeDepartamento = new JLabel("Jefe de Dpto:");
		lblJefeDeDepartamento.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblJefeDeDepartamento.setBounds(12, 331, 126, 27);
		panel.add(lblJefeDeDepartamento);
		
		JLabel lblFacultad = new JLabel("Facultad:");
		lblFacultad.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblFacultad.setBounds(12, 279, 150, 27);
		panel.add(lblFacultad);
		
		JLabel lblNewLabel = new JLabel("Departamento:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 228, 150, 27);
		panel.add(lblNewLabel);
		
		avatarCircular = new AvatarCircular();
		avatarCircular.setForeground(Color.WHITE);
		avatarCircular.setTamBorde(1);
		avatarCircular.setAvatar(new ImageIcon(DatosDpto.class.getResource("/images/info.png")));
		avatarCircular.setBounds(127, 13, 171, 171);
		panel.add(avatarCircular);
		
		botonAnimacion = new BotonAnimacion();
		botonAnimacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botonAnimacion.setText("Aceptar");
		botonAnimacion.setForeground(Color.WHITE);
		botonAnimacion.setFont(new Font("Aller", Font.PLAIN, 20));
		botonAnimacion.setFocusable(false);
		botonAnimacion.setColorEfecto(new Color(102, 153, 102));
		botonAnimacion.setBackground(new Color(48, 107, 91));
		botonAnimacion.setBounds(155, 400, 116, 38);
		panel.add(botonAnimacion);
		
		imagen_1 = new Imagen((Icon) null);
		imagen_1.setImagen(new ImageIcon(DatosDpto.class.getResource("/images/bg.png")));
		imagen_1.setBounds(0, 0, 426, 451);
		panel.add(imagen_1);
	}
}
