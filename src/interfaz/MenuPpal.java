package interfaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import util.AsignaturasTableModel;
import util.CrearAsigPanel;
import util.CrearPlanifPanel;
import util.CrearProfPanel;
import util.PlanificacionesTableModel;
import util.ProfesoresTableModel;
import componentesVisuales.BotonAnimacion;
import componentesVisuales.Imagen;

import java.awt.Rectangle;

public class MenuPpal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel sidePanel;
	private Imagen menuBlack;
	private Imagen imagen_1;
	private Imagen imagen_3;
	private Imagen imagen_2;
	private Imagen imagen_4;
	private Imagen imagen_5;
	private JSeparator separator;
	private Imagen menuimg;
	private Imagen cujaeLogo;
	private JButton btnNewButton;
	private JButton btnPlanificaciones;
	private JButton btnAsignaturas;
	private JButton btnNuevoProfesor;
	private JButton btnNuevaPlanificacin;
	private JButton btnNuevaAsignatura;
	private JButton btnCerrarSesin;
	private JButton btnAyuda;
	private JButton btnInformacin;
	private JButton btnConsultas;
	private JButton btnAdministracin;
	private Imagen salirBtn;
	private JTextField buscarTextField;
	private Imagen buscarImg;
	private JLabel titulo;
	private BotonAnimacion btnModificar;
	private BotonAnimacion btnEliminar;
	private BotonAnimacion btnAgregar;
	private CrearProfPanel c1 = new CrearProfPanel();
	private CrearAsigPanel ca1 = new CrearAsigPanel();
	private CrearPlanifPanel cp1 = new CrearPlanifPanel();
	private JDesktopPane desktopPane;
	private JScrollPane scrollPane;
	private JTable tabla;
	private 

	/**
	 * Create the frame.
	 */
	public MenuPpal() {
		setUndecorated(true);
		setResizable(false);
		setTitle("Planificador de Carga Docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 611);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		c1.setBounds(0, 0, 515, 416);
		c1.setVisible(true);


		salirBtn = new Imagen((Icon) null);
		salirBtn.setBounds(776, 0, 43, 43);
		salirBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		salirBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		salirBtn.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/x-regular-240.png")));
		contentPane.add(salirBtn);

		buscarImg = new Imagen((Icon) null);
		buscarImg.setVisible(false);
		buscarImg.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/search-regular-240.png")));
		buscarImg.setBounds(649, 67, 25, 25);
		contentPane.add(buscarImg);

		buscarTextField = new JTextField();
		buscarTextField.setVisible(false);
		buscarTextField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		buscarTextField.setBounds(676, 70, 116, 22);
		contentPane.add(buscarTextField);
		buscarTextField.setColumns(10);

		titulo = new JLabel("PLANIFICACIONES");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setVisible(false);
		titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
		titulo.setBounds(277, 67, 515, 30);
		contentPane.add(titulo);

		btnAgregar = new BotonAnimacion();
		btnAgregar.setVisible(false);
		btnAgregar.setText("Agregar");
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFont(new Font("Aller", Font.PLAIN, 20));
		btnAgregar.setFocusable(false);
		btnAgregar.setColorEfecto(Color.BLACK);
		btnAgregar.setBackground(new Color(78, 78, 78));
		btnAgregar.setBounds(520, 562, 110, 30);
		contentPane.add(btnAgregar);

		btnEliminar = new BotonAnimacion();
		btnEliminar.setVisible(false);
		btnEliminar.setText("Eliminar");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Aller", Font.PLAIN, 20));
		btnEliminar.setFocusable(false);
		btnEliminar.setColorEfecto(Color.BLACK);
		btnEliminar.setBackground(new Color(78, 78, 78));
		btnEliminar.setBounds(398, 562, 110, 30);
		contentPane.add(btnEliminar);

		btnModificar = new BotonAnimacion();
		btnModificar.setVisible(false);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setText("Modificar");
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setFont(new Font("Aller", Font.PLAIN, 20));
		btnModificar.setFocusable(false);
		btnModificar.setColorEfecto(Color.BLACK);
		btnModificar.setBackground(new Color(78, 78, 78));
		btnModificar.setBounds(277, 562, 110, 30);
		contentPane.add(btnModificar);

		Imagen cujaeLogo1 = new Imagen((Icon) null);
		cujaeLogo1.setBounds(771, 562, 36, 36);
		cujaeLogo1.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/logo-recortado-2.png")));
		contentPane.add(cujaeLogo1);

		menuBlack = new Imagen((Icon) null);
		menuBlack.setBounds(32, 52, 30, 30);
		menuBlack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBlack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sidePanel.setVisible(true);
				menuBlack.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				menuBlack.setBounds(27, 45, 35, 35);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				menuBlack.setBounds(27, 47, 30, 30);
			}
		});
		contentPane.add(menuBlack);
		menuBlack.setVisible(false);
		menuBlack.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/menu-regular-240 (1).png")));

		sidePanel = new JPanel();
		sidePanel.setBounds(5, 38, 260, 568);
		sidePanel.setBackground(new Color(112,112,112));
		contentPane.add(sidePanel);


		cujaeLogo = new Imagen((Icon) null);
		cujaeLogo.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/logo-recortado-2.png")));

		menuimg = new Imagen((Icon) null);
		menuimg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuimg.setBackground(Color.DARK_GRAY);
		menuimg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuBlack.setVisible(true);
				sidePanel.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				menuimg.setBounds(220, 11, 35, 35);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				menuimg.setBounds(220, 13, 30, 30);
			}
		});
		menuimg.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/menu-regular-240.png")));

		imagen_1 = new Imagen((Icon) null);
		imagen_1.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/book-content-solid-240.png")));

		imagen_2 = new Imagen((Icon) null);
		imagen_2.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/cog-regular-240.png")));

		imagen_3 = new Imagen((Icon) null);
		imagen_3.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/user-circle-regular-240.png")));

		imagen_4 = new Imagen((Icon) null);
		imagen_4.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/help-circle-solid-240.png")));

		imagen_5 = new Imagen((Icon) null);
		imagen_5.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/info-circle-solid-240.png")));

		separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBackground(Color.DARK_GRAY);

		btnNewButton = new JButton("Profesores");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(Color.white);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarImg.setVisible(true);
				buscarTextField.setVisible(true);
				scrollPane.setVisible(true);
				ProfesoresTableModel p1 = new ProfesoresTableModel();
				titulo.setVisible(true);
				titulo.setText("PROFESORES");
				tabla.setModel(p1);
				desktopPane.removeAll();
				btnAgregar.setVisible(true);
				btnModificar.setVisible(true);
				btnEliminar.setVisible(true);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnNewButton.setFocusable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(240, 240, 240));

		btnPlanificaciones = new JButton("Planificaciones");
		btnPlanificaciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlanificaciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPlanificaciones.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPlanificaciones.setForeground(Color.white);
			}
		});
		btnPlanificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				titulo.setText("PLANIFICACIONES");
				PlanificacionesTableModel pl1 = new PlanificacionesTableModel();
				buscarImg.setVisible(true);
				buscarTextField.setVisible(true);
				titulo.setVisible(true);
				btnAgregar.setVisible(true);
				btnModificar.setVisible(true);
				btnEliminar.setVisible(true);
				tabla.setModel(pl1);
			}
		});
		btnPlanificaciones.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlanificaciones.setForeground(Color.WHITE);
		btnPlanificaciones.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnPlanificaciones.setFocusable(false);
		btnPlanificaciones.setContentAreaFilled(false);
		btnPlanificaciones.setBorderPainted(false);
		btnPlanificaciones.setBackground(SystemColor.menu);

		btnAsignaturas = new JButton("Asignaturas");
		btnAsignaturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AsignaturasTableModel as1 = new AsignaturasTableModel();
				buscarImg.setVisible(true);
				buscarTextField.setVisible(true);
				scrollPane.setVisible(true);
				titulo.setVisible(true);
				titulo.setText("ASIGNATURAS");
				tabla.setModel(as1);
				btnAgregar.setVisible(true);
				btnModificar.setVisible(true);
				btnEliminar.setVisible(true);
			}
		});
		btnAsignaturas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAsignaturas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAsignaturas.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAsignaturas.setForeground(Color.white);
			}
		});
		btnAsignaturas.setHorizontalAlignment(SwingConstants.LEFT);
		btnAsignaturas.setForeground(Color.WHITE);
		btnAsignaturas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnAsignaturas.setFocusable(false);
		btnAsignaturas.setContentAreaFilled(false);
		btnAsignaturas.setBorderPainted(false);
		btnAsignaturas.setBackground(SystemColor.menu);

		btnNuevoProfesor = new JButton("Nuevo Profesor");
		btnNuevoProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.removeAll();
				scrollPane.setVisible(false);
				c1.setVisible(true);
				desktopPane.add(c1);
				titulo.setVisible(true);
				titulo.setText("CREAR PROFESOR");
				buscarImg.setVisible(false);
				buscarTextField.setVisible(false);
				btnAgregar.setVisible(true);
				btnModificar.setVisible(false);
				btnEliminar.setVisible(false);
			}
		});
		btnNuevoProfesor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNuevoProfesor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNuevoProfesor.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNuevoProfesor.setForeground(Color.white);
			}
		});
		btnNuevoProfesor.setHorizontalAlignment(SwingConstants.LEFT);
		btnNuevoProfesor.setForeground(Color.WHITE);
		btnNuevoProfesor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnNuevoProfesor.setFocusable(false);
		btnNuevoProfesor.setContentAreaFilled(false);
		btnNuevoProfesor.setBorderPainted(false);
		btnNuevoProfesor.setBackground(SystemColor.menu);

		btnNuevaPlanificacin = new JButton("Nueva Planificaci\u00F3n");
		btnNuevaPlanificacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);
				desktopPane.removeAll();
				desktopPane.add(cp1);
				titulo.setVisible(true);
				buscarImg.setVisible(false);
				buscarTextField.setVisible(false);
				titulo.setText("CREAR PLANIFICACION");				
				btnAgregar.setVisible(true);
				btnModificar.setVisible(false);
				btnEliminar.setVisible(false);
			}
		});
		btnNuevaPlanificacin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNuevaPlanificacin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNuevaPlanificacin.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNuevaPlanificacin.setForeground(Color.white);
			}
		});
		btnNuevaPlanificacin.setHorizontalAlignment(SwingConstants.LEFT);
		btnNuevaPlanificacin.setForeground(Color.WHITE);
		btnNuevaPlanificacin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnNuevaPlanificacin.setFocusable(false);
		btnNuevaPlanificacin.setContentAreaFilled(false);
		btnNuevaPlanificacin.setBorderPainted(false);
		btnNuevaPlanificacin.setBackground(SystemColor.menu);

		btnNuevaAsignatura = new JButton("Nueva Asignatura");
		btnNuevaAsignatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);
				titulo.setVisible(true);
				buscarImg.setVisible(false);
				buscarTextField.setVisible(false);
				titulo.setText("CREAR ASIGNATURA");				
				btnAgregar.setVisible(true);
				btnModificar.setVisible(false);
				btnEliminar.setVisible(false);	
				desktopPane.removeAll();
				desktopPane.add(ca1);
			}
		});
		btnNuevaAsignatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNuevaAsignatura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNuevaAsignatura.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNuevaAsignatura.setForeground(Color.white);
			}
		});
		btnNuevaAsignatura.setHorizontalAlignment(SwingConstants.LEFT);
		btnNuevaAsignatura.setForeground(Color.WHITE);
		btnNuevaAsignatura.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnNuevaAsignatura.setFocusable(false);
		btnNuevaAsignatura.setContentAreaFilled(false);
		btnNuevaAsignatura.setBorderPainted(false);
		btnNuevaAsignatura.setBackground(SystemColor.menu);

		btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrarSesin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCerrarSesin.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCerrarSesin.setForeground(Color.white);
			}
		});
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CerrarSesion c1 = new CerrarSesion();
				c1.setVisible(true);
				dispose();
			}
		});
		btnCerrarSesin.setHorizontalAlignment(SwingConstants.LEFT);
		btnCerrarSesin.setForeground(Color.WHITE);
		btnCerrarSesin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnCerrarSesin.setFocusable(false);
		btnCerrarSesin.setContentAreaFilled(false);
		btnCerrarSesin.setBorderPainted(false);
		btnCerrarSesin.setBackground(SystemColor.menu);

		btnAyuda = new JButton("Ayuda");
		btnAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAyuda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAyuda.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAyuda.setForeground(Color.white);
			}
		});
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ayuda ay1 = new Ayuda();
				ay1.setVisible(true);
			}
		});
		btnAyuda.setHorizontalAlignment(SwingConstants.LEFT);
		btnAyuda.setForeground(Color.WHITE);
		btnAyuda.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnAyuda.setFocusable(false);
		btnAyuda.setContentAreaFilled(false);
		btnAyuda.setBorderPainted(false);
		btnAyuda.setBackground(SystemColor.menu);

		btnInformacin = new JButton("Informaci\u00F3n");
		btnInformacin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInformacin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnInformacin.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnInformacin.setForeground(Color.white);
			}
		});
		btnInformacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatosDpto d1 = new DatosDpto();
				d1.setVisible(true);
			}
		});
		btnInformacin.setHorizontalAlignment(SwingConstants.LEFT);
		btnInformacin.setForeground(Color.WHITE);
		btnInformacin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnInformacin.setFocusable(false);
		btnInformacin.setContentAreaFilled(false);
		btnInformacin.setBorderPainted(false);
		btnInformacin.setBackground(SystemColor.menu);

		btnConsultas = new JButton("Consultas");
		btnConsultas.setHorizontalAlignment(SwingConstants.LEFT);
		btnConsultas.setForeground(Color.WHITE);
		btnConsultas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnConsultas.setFocusable(false);
		btnConsultas.setContentAreaFilled(false);
		btnConsultas.setBorderPainted(false);
		btnConsultas.setBackground(SystemColor.menu);
		

		desktopPane = new JDesktopPane();
		desktopPane.setForeground(SystemColor.control);
		desktopPane.setBorder(null);
		desktopPane.setBackground(SystemColor.control);
		desktopPane.setBounds(277, 133, 515, 416);
		contentPane.add(desktopPane);
		desktopPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 515, 416);
		desktopPane.add(scrollPane);
		tabla = new JTable();
		tabla.setCellSelectionEnabled(true);
		tabla.setBounds(new Rectangle(0, 0, 515, 416));
		ProfesoresTableModel p1 = new ProfesoresTableModel();
		scrollPane.add(tabla);
		tabla.setModel(p1);

		btnAdministracin = new JButton("Administraci\u00F3n");
		btnAdministracin.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdministracin.setForeground(Color.WHITE);
		btnAdministracin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnAdministracin.setFocusable(false);
		btnAdministracin.setContentAreaFilled(false);
		btnAdministracin.setBorderPainted(false);
		btnAdministracin.setBackground(SystemColor.menu);
		GroupLayout gl_sidePanel = new GroupLayout(sidePanel);
		gl_sidePanel.setHorizontalGroup(
				gl_sidePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sidePanel.createSequentialGroup()
						.addGap(12)
						.addComponent(cujaeLogo, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGap(172)
						.addComponent(menuimg, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_sidePanel.createSequentialGroup()
								.addGap(12)
								.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_sidePanel.createSequentialGroup()
												.addGap(25)
												.addComponent(btnConsultas, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
												.addComponent(imagen_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_sidePanel.createSequentialGroup()
														.addGap(58)
														.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_sidePanel.createSequentialGroup()
																.addGap(57)
																.addComponent(btnPlanificaciones, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
																.addGroup(gl_sidePanel.createSequentialGroup()
																		.addGap(58)
																		.addComponent(btnAsignaturas, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_sidePanel.createSequentialGroup()
																				.addGap(12)
																				.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
																						.addComponent(imagen_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
																						.addGroup(gl_sidePanel.createSequentialGroup()
																								.addGap(25)
																								.addComponent(btnAdministracin, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))))
																								.addGroup(gl_sidePanel.createSequentialGroup()
																										.addGap(48)
																										.addComponent(btnNuevoProfesor, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
																										.addGroup(gl_sidePanel.createSequentialGroup()
																												.addGap(48)
																												.addComponent(btnNuevaPlanificacin, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
																												.addGroup(gl_sidePanel.createSequentialGroup()
																														.addGap(48)
																														.addComponent(btnNuevaAsignatura, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
																														.addGroup(gl_sidePanel.createSequentialGroup()
																																.addGap(12)
																																.addComponent(separator, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
																																.addGroup(gl_sidePanel.createSequentialGroup()
																																		.addGap(12)
																																		.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
																																				.addGroup(gl_sidePanel.createSequentialGroup()
																																						.addGap(25)
																																						.addComponent(btnCerrarSesin, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
																																						.addComponent(imagen_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
																																						.addGroup(gl_sidePanel.createSequentialGroup()
																																								.addGap(12)
																																								.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
																																										.addComponent(imagen_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
																																										.addGroup(gl_sidePanel.createSequentialGroup()
																																												.addGap(25)
																																												.addComponent(btnAyuda, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))))
																																												.addGroup(gl_sidePanel.createSequentialGroup()
																																														.addGap(12)
																																														.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
																																																.addGroup(gl_sidePanel.createSequentialGroup()
																																																		.addGap(25)
																																																		.addComponent(btnInformacin, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
																																																		.addComponent(imagen_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
				);
		gl_sidePanel.setVerticalGroup(
				gl_sidePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sidePanel.createSequentialGroup()
						.addGap(13)
						.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
								.addComponent(cujaeLogo, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(menuimg, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addGap(26)
								.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
										.addComponent(btnConsultas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addComponent(imagen_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
										.addGap(15)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addGap(15)
										.addComponent(btnPlanificaciones, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(btnAsignaturas, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addGap(13)
										.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
												.addComponent(imagen_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnAdministracin, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addGap(20)
												.addComponent(btnNuevoProfesor, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGap(13)
												.addComponent(btnNuevaPlanificacin, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGap(13)
												.addComponent(btnNuevaAsignatura)
												.addGap(28)
												.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
														.addComponent(btnCerrarSesin, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
														.addComponent(imagen_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
														.addGap(13)
														.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
																.addComponent(imagen_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnAyuda, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
																.addGap(13)
																.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_sidePanel.createSequentialGroup()
																				.addGap(2)
																				.addComponent(btnInformacin, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
																				.addComponent(imagen_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
				);
		sidePanel.setLayout(gl_sidePanel);


		Imagen fondo = new Imagen((Icon) null);
		fondo.setBounds(5, 38, 807, 568);
		fondo.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/bg.png")));
		fondo.setForeground(Color.WHITE);
		contentPane.add(fondo);

		setLocationRelativeTo(null);
	}
}
