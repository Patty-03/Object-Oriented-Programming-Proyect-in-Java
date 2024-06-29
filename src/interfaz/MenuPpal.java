package interfaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import componentesVisuales.Imagen;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import componentesVisuales.BotonAnimacion;

public class MenuPpal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
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
	private Imagen imagen;
	private JTextField buscarTextField;
	private Imagen buscarImg;
	private JLabel lblPlanificaciones;
	private JTable table;
	private JScrollPane scrollPane;
	private BotonAnimacion btnModificar;
	private BotonAnimacion btnEliminar;
	private BotonAnimacion btnAgregar;

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


		imagen = new Imagen((Icon) null);
		imagen.setBounds(776, 0, 43, 43);
		imagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		imagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		imagen.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/x-regular-240.png")));
		contentPane.add(imagen);
		
		buscarImg = new Imagen((Icon) null);
		buscarImg.setVisible(false);
		buscarImg.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/search-regular-240.png")));
		buscarImg.setBounds(649, 104, 25, 25);
		contentPane.add(buscarImg);
		
		buscarTextField = new JTextField();
		buscarTextField.setVisible(false);
		buscarTextField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		buscarTextField.setBounds(676, 104, 116, 22);
		contentPane.add(buscarTextField);
		buscarTextField.setColumns(10);
		
		lblPlanificaciones = new JLabel("PLANIFICACIONES");
		lblPlanificaciones.setVisible(false);
		lblPlanificaciones.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblPlanificaciones.setBounds(437, 98, 171, 30);
		contentPane.add(lblPlanificaciones);
		
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
				panel.setVisible(true);
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
		
		scrollPane = new JScrollPane();
		scrollPane.setVisible(false);
		scrollPane.setBounds(277, 139, 515, 367);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setBorder(null);
		table.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Fecha", "Profesores", "Asignaturas", "Curso", "Semestre"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);

		panel = new JPanel();
		panel.setBounds(5, 38, 260, 568);
		panel.setBackground(new Color(112,112,112));
		contentPane.add(panel);
		panel.setLayout(null);


		cujaeLogo = new Imagen((Icon) null);
		cujaeLogo.setBounds(12, 13, 36, 36);
		cujaeLogo.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/logo-recortado-2.png")));
		panel.add(cujaeLogo);

		menuimg = new Imagen((Icon) null);
		menuimg.setBounds(220, 13, 30, 30);
		menuimg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuimg.setBackground(Color.DARK_GRAY);
		menuimg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuBlack.setVisible(true);
				panel.setVisible(false);
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
		panel.add(menuimg);

		imagen_1 = new Imagen((Icon) null);
		imagen_1.setBounds(12, 75, 27, 27);
		imagen_1.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/book-content-solid-240.png")));
		panel.add(imagen_1);

		imagen_2 = new Imagen((Icon) null);
		imagen_2.setBounds(12, 235, 27, 27);
		imagen_2.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/cog-regular-240.png")));
		panel.add(imagen_2);

		imagen_3 = new Imagen((Icon) null);
		imagen_3.setBounds(12, 433, 27, 27);
		imagen_3.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/user-circle-regular-240.png")));
		panel.add(imagen_3);

		imagen_4 = new Imagen((Icon) null);
		imagen_4.setBounds(12, 473, 27, 27);
		imagen_4.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/help-circle-solid-240.png")));
		panel.add(imagen_4);

		imagen_5 = new Imagen((Icon) null);
		imagen_5.setBounds(12, 513, 27, 27);
		imagen_5.setImagen(new ImageIcon(MenuPpal.class.getResource("/images/info-circle-solid-240.png")));
		panel.add(imagen_5);

		separator = new JSeparator();
		separator.setBounds(12, 421, 238, 2);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBackground(Color.DARK_GRAY);
		panel.add(separator);

		btnNewButton = new JButton("Profesores");
		btnNewButton.setBounds(58, 117, 133, 25);
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
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panel.add(btnNewButton);
		btnNewButton.setFocusable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(240, 240, 240));

		btnPlanificaciones = new JButton("Planificaciones");
		btnPlanificaciones.setBounds(57, 157, 193, 25);
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
				buscarImg.setVisible(true);
				buscarTextField.setVisible(true);
				scrollPane.setVisible(true);
				lblPlanificaciones.setVisible(true);
				btnAgregar.setVisible(true);
				btnModificar.setVisible(true);
				btnEliminar.setVisible(true);
			}
		});
		btnPlanificaciones.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlanificaciones.setForeground(Color.WHITE);
		btnPlanificaciones.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnPlanificaciones.setFocusable(false);
		btnPlanificaciones.setContentAreaFilled(false);
		btnPlanificaciones.setBorderPainted(false);
		btnPlanificaciones.setBackground(SystemColor.menu);
		panel.add(btnPlanificaciones);

		btnAsignaturas = new JButton("Asignaturas");
		btnAsignaturas.setBounds(58, 192, 165, 30);
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
		panel.add(btnAsignaturas);

		btnNuevoProfesor = new JButton("Nuevo Profesor");
		btnNuevoProfesor.setBounds(48, 282, 182, 25);
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
		panel.add(btnNuevoProfesor);

		btnNuevaPlanificacin = new JButton("Nueva Planificaci\u00F3n");
		btnNuevaPlanificacin.setBounds(48, 320, 214, 25);
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
		panel.add(btnNuevaPlanificacin);

		btnNuevaAsignatura = new JButton("Nueva Asignatura");
		btnNuevaAsignatura.setBounds(48, 358, 204, 35);
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
		panel.add(btnNuevaAsignatura);

		btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.setBounds(37, 433, 213, 25);
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
				Autenticacion a1 = new Autenticacion();
				a1.setVisible(true);
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
		panel.add(btnCerrarSesin);

		btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(37, 473, 98, 25);
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
		panel.add(btnAyuda);

		btnInformacin = new JButton("Informaci\u00F3n");
		btnInformacin.setBounds(37, 515, 213, 25);
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
		panel.add(btnInformacin);

		btnConsultas = new JButton("Consultas");
		btnConsultas.setBounds(37, 75, 182, 25);
		btnConsultas.setHorizontalAlignment(SwingConstants.LEFT);
		btnConsultas.setForeground(Color.WHITE);
		btnConsultas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnConsultas.setFocusable(false);
		btnConsultas.setContentAreaFilled(false);
		btnConsultas.setBorderPainted(false);
		btnConsultas.setBackground(SystemColor.menu);
		panel.add(btnConsultas);

		btnAdministracin = new JButton("Administraci\u00F3n");
		btnAdministracin.setBounds(37, 235, 182, 25);
		btnAdministracin.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdministracin.setForeground(Color.WHITE);
		btnAdministracin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnAdministracin.setFocusable(false);
		btnAdministracin.setContentAreaFilled(false);
		btnAdministracin.setBorderPainted(false);
		btnAdministracin.setBackground(SystemColor.menu);
		panel.add(btnAdministracin);

		Imagen fondo = new Imagen((Icon) null);
		fondo.setBounds(5, 38, 807, 568);
		fondo.setImagen(new ImageIcon("C:\\Users\\admin\\Desktop\\Js_Proyects\\Simple Landing Page\\media\\bg.png"));
		fondo.setForeground(Color.WHITE);
		contentPane.add(fondo);

		setLocationRelativeTo(null);
	}
}
