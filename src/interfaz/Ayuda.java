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
import javax.swing.JPanel;

import componentesVisuales.AvatarCircular;
import componentesVisuales.BotonAnimacion;
import componentesVisuales.Imagen;
import componentesVisuales.JLabelMultilineaMultialineado;
import componentesVisuales.JLabelMultilineaMultialineado.Alineacion;
import java.awt.Cursor;
import javax.swing.SpringLayout;

public class Ayuda extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Imagen fondo;
	private Imagen imagen;
	private JPanel panel;
	private SpringLayout sl_panel;

	/**
	 * Create the dialog.
	 */
	public Ayuda() {
		setUndecorated(true);
		setModalityType(ModalityType.APPLICATION_MODAL);
		getContentPane().setName("Ayuda");
		getContentPane().setBackground(Color.DARK_GRAY);
		setBackground(Color.DARK_GRAY);
		setBounds(100, 100, 400, 501);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		{
			panel = new JPanel();
			panel.setBounds(12, 36, 376, 452);
			getContentPane().add(panel);
			sl_panel = new SpringLayout();
			panel.setLayout(sl_panel);
			
			AvatarCircular avatarCircular = new AvatarCircular();
			sl_panel.putConstraint(SpringLayout.NORTH, avatarCircular, 13, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, avatarCircular, 114, SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.SOUTH, avatarCircular, 184, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.EAST, avatarCircular, 285, SpringLayout.WEST, panel);
			avatarCircular.setForeground(Color.WHITE);
			avatarCircular.setTamBorde(1);
			avatarCircular.setAvatar(new ImageIcon(Ayuda.class.getResource("/images/Button Question.png")));
			panel.add(avatarCircular);
			
			JLabelMultilineaMultialineado lblmltlnmltlndbodytextalignLeftnull = new JLabelMultilineaMultialineado((String) null, (Alineacion) null);
			sl_panel.putConstraint(SpringLayout.NORTH, lblmltlnmltlndbodytextalignLeftnull, 202, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, lblmltlnmltlndbodytextalignLeftnull, 12, SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.EAST, lblmltlnmltlndbodytextalignLeftnull, 388, SpringLayout.WEST, panel);
			lblmltlnmltlndbodytextalignLeftnull.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			lblmltlnmltlndbodytextalignLeftnull.setText("<html><body>El Sistema est\u00E1 dise\u00F1ado para visualizar y/o crear la planificaci\u00F3n de la carga docente de los diferentes semestres del curso.\r\n<br>\r\nPara acceder a las diferentes opciones navegue a trav\u00E9s del men\u00FA lateral.</body></html>");
			panel.add(lblmltlnmltlndbodytextalignLeftnull);
			
			BotonAnimacion btnmcnAceptar = new BotonAnimacion();
			sl_panel.putConstraint(SpringLayout.NORTH, btnmcnAceptar, 398, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, btnmcnAceptar, 130, SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.SOUTH, btnmcnAceptar, 436, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.EAST, btnmcnAceptar, 246, SpringLayout.WEST, panel);
			btnmcnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnmcnAceptar.setText("Aceptar");
			btnmcnAceptar.setForeground(Color.WHITE);
			btnmcnAceptar.setFont(new Font("Aller", Font.PLAIN, 20));
			btnmcnAceptar.setFocusable(false);
			btnmcnAceptar.setColorEfecto(new Color(102, 153, 102));
			btnmcnAceptar.setBackground(new Color(48, 107, 91));
			panel.add(btnmcnAceptar);
		}
		
		imagen = new Imagen((Icon) null);
		imagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		imagen.setBounds(351, 0, 37, 38);
		imagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		imagen.setImagen(new ImageIcon(Ayuda.class.getResource("/images/x-regular-240.png")));
		getContentPane().add(imagen);
		
		fondo = new Imagen((Icon) null);
		sl_panel.putConstraint(SpringLayout.NORTH, fondo, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, fondo, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, fondo, 476, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, fondo, 400, SpringLayout.WEST, panel);
		fondo.setImagen(new ImageIcon("C:\\Users\\admin\\Desktop\\Js_Proyects\\Simple Landing Page\\media\\bg.png"));
		panel.add(fondo);
	}
}
