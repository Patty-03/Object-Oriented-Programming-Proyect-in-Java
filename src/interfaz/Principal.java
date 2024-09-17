package interfaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import logica.Adiestrado;
import logica.AsigPorProf;
import logica.Asignatura;
import logica.Docente;
import logica.Dpto;
import logica.Planificacion;
import logica.TipoEnsenanza;
import modelos.AsignacionesTableModel;
import modelos.AsignaturasTableModel;
import modelos.PlanificacionesTableModel;
import modelos.ProfesoresTableModel;
import util.AyudaPopUp;
import util.CerrarSesion;
import util.CrearAsignacion;
import util.CrearAsignatura;
import util.CrearPlanif;
import util.CrearProfesor;
import util.EditarDatosDpto;
import util.InfoDialog;
import util.ReportesPopup;

public class Principal extends JFrame {
	private static final long serialVersionUID = 1L;
	private Dpto d;
	private JPanel contentPane;
	private JPanel panel;
	private JButton exitButton;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JLabel tituloTabla;
	private JLabel background1;
	private JLabel background;
	private CerrarSesion panelCerrarSesion;
	private JMenu mnDocentes;
	private JMenuItem mntmDisponibilidad;
	private JMenuItem mntmCatDocente;
	private JMenuItem mntmCatCientifica;
	private JMenu mnOtros;
	private JMenuItem mntmCalcularSalario;
	private JMenuItem mntmAsignaturasPorDocente;
	private JMenuItem mntmDocentePorAsignatura;
	private JMenuItem mntmDisciplina;
	private ReportesPopup popupReportes;
	private DefaultTableModel tableModel;
	private JTable tabla;
	private JScrollPane scrollPane;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton btnNuevaAsigPor;
	private JMenu mnMenu;
	private JMenuItem mntmEditar;
	private JMenuItem mntmBorrar;
	private ProfesoresTableModel p1;
	private AsignacionesTableModel as1;
	private AsignaturasTableModel a1;
	private PlanificacionesTableModel pl1;
	private JMenuItem mntmEditarDatosDpto;
	private EditarDatosDpto ed1;



	public Principal(final Dpto dpto) {
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		setTitle("Dpto. " + dpto.getNombre());
		setBackground(Color.WHITE);
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		panelCerrarSesion = new CerrarSesion(dpto);
		d = dpto;
		popupReportes = new ReportesPopup(this, d);
		ed1 = new EditarDatosDpto(d);



		panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 40, 250, 560);
		contentPane.add(panel);
		panel.setLayout(null);

		button_8 = new JButton("Cerrar Sesi\u00F3n");
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				panelCerrarSesion.setVisible(true);
			}
		});
		button_8.setForeground(Color.DARK_GRAY);
		button_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_8.setFocusable(false);
		button_8.setContentAreaFilled(false);
		button_8.setBorderPainted(false);
		button_8.setBackground(SystemColor.menu);
		button_8.setBounds(18, 435, 213, 38);
		panel.add(button_8);

		button_9 = new JButton("Ayuda");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AyudaPopUp ay1 = new AyudaPopUp();
				ay1.setVisible(true);
				ay1.setLocationRelativeTo(null);
			}
		});
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.setForeground(Color.DARK_GRAY);
		button_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_9.setFocusable(false);
		button_9.setContentAreaFilled(false);
		button_9.setBorderPainted(false);
		button_9.setBackground(SystemColor.menu);
		button_9.setBounds(18, 471, 213, 38);
		panel.add(button_9);

		button_10 = new JButton("Informaci\u00F3n");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfoDialog i = new InfoDialog(dpto);
				i.setVisible(true);
				i.setLocationRelativeTo(null);
			}
		});
		button_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_10.setForeground(Color.DARK_GRAY);
		button_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_10.setFocusable(false);
		button_10.setContentAreaFilled(false);
		button_10.setBorderPainted(false);
		button_10.setBackground(SystemColor.menu);
		button_10.setBounds(18, 509, 213, 38);
		panel.add(button_10);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setForeground(Color.GRAY);
		separator.setBounds(11, 433, 220, 2);
		panel.add(separator);

		button = new JButton("Consultas");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button.setFocusable(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBackground(SystemColor.menu);
		button.setBounds(-1, 30, 250, 25);
		panel.add(button);

		button_1 = new JButton("Profesores");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tituloTabla.setText("PROFESORES");
				p1.actualizarTabla(d);
				tabla.setModel(p1);
			}
		});
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_1.setFocusable(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(20, 70, 229, 25);
		panel.add(button_1);

		button_2 = new JButton("Planificaciones");
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tituloTabla.setText("PLANIFICACIONES");
				pl1.actualizarTabla();
				tabla.setModel(pl1);
			}
		});
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_2.setFocusable(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(19, 110, 230, 25);
		panel.add(button_2);

		button_3 = new JButton("Asignaturas");
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tituloTabla.setText("ASIGNATURAS");
				a1.actualizarTabla();
				tabla.setModel(a1);
			}
		});
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.DARK_GRAY);
		button_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_3.setFocusable(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(20, 150, 229, 30);
		panel.add(button_3);

		button_4 = new JButton("Administraci\u00F3n");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.DARK_GRAY);
		button_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_4.setFocusable(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setBackground(SystemColor.menu);
		button_4.setBounds(-1, 258, 250, 25);
		panel.add(button_4);

		button_5 = new JButton("Nuevo Profesor");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearProfesor profDialog = new CrearProfesor(Principal.this, dpto);
				profDialog.setSize(654, 520);
				profDialog.setLocation(600,300);
				profDialog.setVisible(true);
				p1.actualizarTabla(d);
				tabla.setModel(p1);
				tituloTabla.setText("PROFESORES");
			}
		});
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setForeground(Color.DARK_GRAY);
		button_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_5.setFocusable(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setBackground(SystemColor.menu);
		button_5.setBounds(10, 298, 239, 25);
		panel.add(button_5);

		button_6 = new JButton("Nueva Planificaci\u00F3n");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearPlanif dialogPlanif = new CrearPlanif(Principal.this, dpto);
				dialogPlanif.setSize(530, 491);
				dialogPlanif.setVisible(true);
				tituloTabla.setText("PLANIFICACIONES");
				pl1.actualizarTabla();
			}
		});
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setForeground(Color.DARK_GRAY);
		button_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_6.setFocusable(false);
		button_6.setContentAreaFilled(false);
		button_6.setBorderPainted(false);
		button_6.setBackground(SystemColor.menu);
		button_6.setBounds(10, 338, 239, 25);
		panel.add(button_6);

		button_7 = new JButton("Nueva Asignatura");
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearAsignatura dialog = new CrearAsignatura(Principal.this, dpto);
				dialog.setVisible(true);
				tituloTabla.setText("ASIGNATURAS");
				tabla.setModel(a1);
			}
		});
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setForeground(Color.DARK_GRAY);
		button_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_7.setFocusable(false);
		button_7.setContentAreaFilled(false);
		button_7.setBorderPainted(false);
		button_7.setBackground(SystemColor.menu);
		button_7.setBounds(10, 378, 239, 35);
		panel.add(button_7);

		btnNuevaAsigPor = new JButton("Asig. por Profesor");
		btnNuevaAsigPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tituloTabla.setText("ASIGNACIONES");
				as1.actualizarTabla();
				tabla.setModel(as1);
			}
		});
		btnNuevaAsigPor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNuevaAsigPor.setHorizontalAlignment(SwingConstants.LEFT);
		btnNuevaAsigPor.setForeground(Color.DARK_GRAY);
		btnNuevaAsigPor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnNuevaAsigPor.setFocusable(false);
		btnNuevaAsigPor.setContentAreaFilled(false);
		btnNuevaAsigPor.setBorderPainted(false);
		btnNuevaAsigPor.setBackground(SystemColor.menu);
		btnNuevaAsigPor.setBounds(20, 192, 229, 35);
		panel.add(btnNuevaAsigPor);

		background1 = new JLabel("");
		background1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/Imagen Pantalla Carga.gif")));
		background1.setBounds(0, 0, 250, 560);
		panel.add(background1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 0, 1000, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		exitButton = new JButton("X");
		exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setBorderPainted(true);
				Color c1 = new Color(64,64,64);
				LineBorder l1 = new LineBorder(c1, 1, true);
				exitButton.setBorder(l1);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setBorderPainted(false);
			}
		});
		exitButton.setToolTipText("Salir");
		exitButton.setFocusPainted(false);
		exitButton.setBounds(952, 0, 48, 40);
		panel_1.add(exitButton);
		exitButton.setBackground(Color.GRAY);
		exitButton.setForeground(SystemColor.menuText);
		exitButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitButton.setIcon(null);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorder(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.DARK_GRAY);
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 1000, 40);
		panel_1.add(menuBar);

		mnMenu = new JMenu("Edicion");
		mnMenu.setForeground(Color.DARK_GRAY);
		mnMenu.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnMenu.setBorder(null);
		menuBar.add(mnMenu);

		mntmEditar = new JMenuItem("Editar");
		mntmEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try{
					int pos = tabla.getSelectedRow();
					if (pos != -1){
						editarProf(pos, d);
					}
					else if(tabla.getModel().getClass().getSimpleName().equalsIgnoreCase("AsignaturasTableModel")){
						editarAsig(pos, d);
					}
					else if(tabla.getModel().getClass().getSimpleName().equalsIgnoreCase("PlanificacionesTableModel")){
						editarPlanif(pos, d);
					}
					else if(tabla.getModel().getClass().getSimpleName().equalsIgnoreCase("AsignacionesTableModel")){
						editarASignacion(pos, d);
					}
					JOptionPane.showMessageDialog(Principal.this, "Elemento editado satisfactoriamente");
				}
				catch(ArrayIndexOutOfBoundsException ex){
					JOptionPane.showMessageDialog(Principal.this, "Seleccione una fila para editar");
				}
			}
		});

		mntmEditarDatosDpto = new JMenuItem("Editar Datos Dpto");
		mntmEditarDatosDpto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ed1.ponerDatosActuales(d.getNombre(), d.getFacultad(), d.getNombreJefeDpto());
				ed1.setVisible(true);
				ed1.setLocationRelativeTo(null);
			}
		});
		mntmEditarDatosDpto.setForeground(Color.DARK_GRAY);
		mntmEditarDatosDpto.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenu.add(mntmEditarDatosDpto);
		mntmEditar.setForeground(Color.DARK_GRAY);
		mntmEditar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmEditar.setBorder(null);
		mnMenu.add(mntmEditar);

		mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				eliminarElmto(tabla);
			}
		});
		mntmBorrar.setForeground(Color.DARK_GRAY);
		mntmBorrar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmBorrar.setBorder(null);
		mnMenu.add(mntmBorrar);

		JMenuItem mntmNuevaASig = new JMenuItem("Nueva Asignacion");
		mntmNuevaASig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearAsignacion asignacionDialog = new CrearAsignacion(Principal.this, dpto);
				asignacionDialog.setLocation(600,300);
				asignacionDialog.setVisible(true);
				tituloTabla.setText("ASIGNACIONES");
				tabla.setModel(as1);
			}
		});
		mntmNuevaASig.setForeground(Color.DARK_GRAY);
		mntmNuevaASig.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenu.add(mntmNuevaASig);

		JMenu mnListar = new JMenu("Listar");
		mnListar.setForeground(Color.DARK_GRAY);
		mnListar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnListar);

		JMenu mnAsignaturas = new JMenu("Asignaturas");
		mnAsignaturas.setBorder(null);
		mnAsignaturas.setForeground(Color.DARK_GRAY);
		mnAsignaturas.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnListar.add(mnAsignaturas);

		mntmDisciplina = new JMenuItem("Disciplina");
		mntmDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] array = new String[2];
				array[0] = "Programación";
				array[1] = "Inteligencia Artificial";
				aparecerPopupReportes("Seleccione la disciplina deseada", array, "AsigPorDisciplinaTableModel");
			}
		});
		mntmDisciplina.setBorder(null);
		mntmDisciplina.setForeground(Color.DARK_GRAY);
		mntmDisciplina.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnAsignaturas.add(mntmDisciplina);

		mnDocentes = new JMenu("Docentes");
		mnDocentes.setBorder(null);
		mnDocentes.setForeground(Color.DARK_GRAY);
		mnDocentes.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnListar.add(mnDocentes);

		mntmDisponibilidad = new JMenuItem("Disponibilidad");
		mntmDisponibilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] array = new String[4];
				array[0] = "Disponible";
				array[1] = "Beca";
				array[2] = "Licencia";
				array[3] = "Liberado";
				aparecerPopupReportes("Seleccione la disponibilidad deseada", array, "ProfPorDisponibTableModel");
			}
		});
		mntmDisponibilidad.setBorder(null);
		mntmDisponibilidad.setForeground(Color.DARK_GRAY);
		mntmDisponibilidad.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnDocentes.add(mntmDisponibilidad);

		mntmCatDocente = new JMenuItem("Cat. Docente");
		mntmCatDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] array = new String[7];
				array[0] = "Profesor Titular";
				array[1] = "ATD";
				array[2] = "Auxiliar";
				array[3] = "Asistente";
				array[4] = "Instructor";
				array[5] = "Adiestrado";
				aparecerPopupReportes("Escriba la Categoría Docente deseada", array, "ProfPorCatDocTableModel");

			}
		});
		mntmCatDocente.setBorder(null);
		mntmCatDocente.setForeground(Color.DARK_GRAY);
		mntmCatDocente.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnDocentes.add(mntmCatDocente);

		mntmCatCientifica = new JMenuItem("Cat. Cientifica");
		mntmCatCientifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] array = new String[3];
				array[0] = "Doctor en Ciencias";
				array[1] = "Máster en Ciencias";
				array[2] = "Ninguno";
				aparecerPopupReportes("Seleccione la Categoría Científica deseada", array, "ProfporCatCientif");

			}
		});
		mntmCatCientifica.setBorder(null);
		mntmCatCientifica.setForeground(Color.DARK_GRAY);
		mntmCatCientifica.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnDocentes.add(mntmCatCientifica);

		mnOtros = new JMenu("Otros");
		mnOtros.setBorder(null);
		mnOtros.setForeground(Color.DARK_GRAY);
		mnOtros.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOtros);

		mntmCalcularSalario = new JMenuItem("Calcular salario");
		mntmCalcularSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] array = new String[20];

				for(int i=0; i < dpto.getDocentes().size(); i++){
					array[i] = dpto.getDocentes().get(i).getNombre();
				}
				aparecerPopupReportes("Seleccione el profesor deseado", array, "CalcSalario");
			}
		});
		mntmCalcularSalario.setBorder(null);
		mntmCalcularSalario.setForeground(Color.DARK_GRAY);
		mntmCalcularSalario.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnOtros.add(mntmCalcularSalario);

		mntmAsignaturasPorDocente = new JMenuItem("Asignaturas por docente");
		mntmAsignaturasPorDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] array = new String[20];

				for(int i=0; i < dpto.getDocentes().size(); i++){
					array[i] = dpto.getDocentes().get(i).getNombre();
				}
				aparecerPopupReportes("Seleccione el profesor deseado", array, "AsigPorDoc");
			}
		});
		mntmAsignaturasPorDocente.setBorder(null);
		mntmAsignaturasPorDocente.setForeground(Color.DARK_GRAY);
		mntmAsignaturasPorDocente.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnOtros.add(mntmAsignaturasPorDocente);

		mntmDocentePorAsignatura = new JMenuItem("Docente por Asignatura");
		mntmDocentePorAsignatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] array = new String[20];

				for(int i=0; i < dpto.getAsignaturas().size(); i++){
					array[i] = dpto.getAsignaturas().get(i).getNombre();
				}

				aparecerPopupReportes("Seleccione la asignatura deseada", array, "DocPorAsig");
			}
		});
		mntmDocentePorAsignatura.setBorder(null);
		mntmDocentePorAsignatura.setForeground(Color.DARK_GRAY);
		mntmDocentePorAsignatura.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnOtros.add(mntmDocentePorAsignatura);

		background = new JLabel("");
		background.setBounds(0, 0, 1000, 600);
		panel_1.add(background);
		background.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/Imagen Pantalla Carga.gif")));

		tituloTabla = new JLabel("PANEL PRINCIPAL");
		tituloTabla.setForeground(Color.DARK_GRAY);
		tituloTabla.setFont(new Font("Segoe UI", Font.BOLD, 20));
		tituloTabla.setHorizontalAlignment(SwingConstants.CENTER);
		tituloTabla.setBounds(523, 53, 194, 22);
		contentPane.add(tituloTabla);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(262, 135, 726, 405);
		contentPane.add(scrollPane);

		tabla = new JTable();
		tabla.enableInputMethods(true);
		scrollPane.setViewportView(tabla);


		cargarTodasLasTablas();
	}

	public void cargarTodasLasTablas(){
		pl1 = cargarTablaPlanif();
		a1 = cargarTablaAsig();
		as1 = cargarTablaAsignaciones();
		p1 = cargarTablaProf();
	}

	public void aparecerPopupReportes(String titulo, String[] array, String codigo){
		popupReportes.tipoReporte(titulo, array, codigo);
		popupReportes.setVisible(true);
	}

	public AsignaturasTableModel cargarTablaAsig(){
		tituloTabla.setText("ASIGNATURAS");

		ArrayList<Asignatura> asignaturas = d.getAsignaturas();
		Asignatura[] valores = new Asignatura[asignaturas.size()];

		int i = 0;

		for(Asignatura a: asignaturas){
			valores[i] = a;
			i++;
		}
		tableModel = new AsignaturasTableModel(valores);
		tabla.setModel(tableModel);

		return (AsignaturasTableModel) tableModel;
	}

	public ProfesoresTableModel cargarTablaProf(){
		tituloTabla.setText("PROFESORES");

		ArrayList<Docente> docentes = d.getDocentes();
		Docente[] valores = new Docente[docentes.size()];

		int i = 0;

		for(Docente a: docentes){
			valores[i] = a;
			i++;
		}
		tableModel = new ProfesoresTableModel(valores);
		tabla.setModel(tableModel);

		return (ProfesoresTableModel)tableModel;
	}

	public PlanificacionesTableModel cargarTablaPlanif(){
		tituloTabla.setText("PLANIFICACIONES");

		ArrayList<Planificacion> planif = d.getRegistro();
		Planificacion[] valores = new Planificacion[planif.size()];

		int i = 0;

		for(Planificacion a: planif){
			valores[i] = a;
			i++;
		}
		tableModel = new PlanificacionesTableModel(valores);
		((PlanificacionesTableModel) tableModel).actualizarTabla();
		tabla.setModel(tableModel);

		return (PlanificacionesTableModel) tableModel;
	}

	public AsignacionesTableModel cargarTablaAsignaciones(){
		tituloTabla.setText("ASIGNACIONES");

		ArrayList<AsigPorProf> asig = d.getAsignacionesAsignaturas();
		AsigPorProf[] valores = new AsigPorProf[asig.size()];

		int i = 0;

		for(AsigPorProf a: asig){
			valores[i] = a;
			i++;
		}
		tableModel = new AsignacionesTableModel(valores);
		tabla.setModel(tableModel);

		return (AsignacionesTableModel) tableModel;
	}


	public void eliminarElmto(JTable tabla){
		try{
			int pos = tabla.getSelectedRow();
			if (pos != -1){
				if(tabla.getModel().getClass().getSimpleName().equalsIgnoreCase("ProfesoresTableModel")){
					d.eliminarDocente(tabla.getValueAt(pos, 1).toString());
					p1.eliminar(pos);
					p1.actualizarTabla(d);
					tituloTabla.setText("PROFESORES");
				}
				else if(tabla.getModel().getClass().getSimpleName().equalsIgnoreCase("AsignaturasTableModel")){
					d.eliminarAsignatura(tabla.getValueAt(pos, 0).toString());
					a1.eliminar(pos);
					a1.actualizarTabla();
					tituloTabla.setText("ASIGNATURAS");
				}
				else if(tabla.getModel().getClass().getSimpleName().equalsIgnoreCase("PlanificacionesTableModel")){
					d.eliminarPlanificacion(tabla.getValueAt(pos, 4).toString(), tabla.getValueAt(pos, 7).toString());
					pl1.eliminar(pos);
					pl1.actualizarTabla();
					tituloTabla.setText("PLANIFICACIONES");
				}
				else if(tabla.getModel().getClass().getSimpleName().equalsIgnoreCase("AsignacionesTableModel")){
					d.eliminarAsignacion(tabla.getValueAt(pos, 1).toString(), tabla.getValueAt(pos, 2).toString());
					as1.eliminar(pos);
					as1.actualizarTabla();
					tituloTabla.setText("ASIGNACIONES");
				}
				JOptionPane.showMessageDialog(Principal.this, "Elemento eliminado satisfactoriamente");
			}

		}
		catch(ArrayIndexOutOfBoundsException ex){
			JOptionPane.showMessageDialog(Principal.this, "Seleccione una fila para eliminar");
		}
	}

	public AsignaturasTableModel getAsignaturasTableModel(){
		return a1;
	}

	public ProfesoresTableModel getProfesoresTableModel(){
		return p1;
	}

	public void actualizarTablaPlanif(Dpto d){
		pl1.actualizarTabla();
	}


	public void editarProf(int pos, Dpto d){
		if(tabla.getModel().getClass().getSimpleName().equalsIgnoreCase("ProfesoresTableModel")){
			p1.modificar(pos, (String)tabla.getValueAt(pos, 0), (String)tabla.getValueAt(pos, 1), (String)tabla.getValueAt(pos, 2), 
					Float.parseFloat(tabla.getValueAt(pos, 3).toString()),
					Integer.parseInt(tabla.getValueAt(pos, 4).toString()), (String)tabla.getValueAt(pos, 5), (String)tabla.getValueAt(pos, 6), 
					(String)tabla.getValueAt(pos, 7) == "Si");


			if(tabla.getValueAt(pos, 5).toString().equals("Adiestrado")){
				Adiestrado adi = new Adiestrado( (String)tabla.getValueAt(pos, 1),(String)tabla.getValueAt(pos, 0), (String)tabla.getValueAt(pos, 2), 
						Float.parseFloat(tabla.getValueAt(pos, 3).toString()),
						Integer.parseInt(tabla.getValueAt(pos, 4).toString()), (String)tabla.getValueAt(pos, 5), (String)tabla.getValueAt(pos, 6), 
						Boolean.parseBoolean((String)tabla.getValueAt(pos, 7)));
				System.out.println(adi.getiD());
				d.actualizarProfConIndice(pos, adi);
			}
			else{
				Docente prof = new Docente((String)tabla.getValueAt(pos, 1),(String)tabla.getValueAt(pos, 0), (String)tabla.getValueAt(pos, 2), 
						Float.parseFloat(tabla.getValueAt(pos, 3).toString()),
						Integer.parseInt(tabla.getValueAt(pos, 4).toString()), (String)tabla.getValueAt(pos, 5), (String)tabla.getValueAt(pos, 6));
				System.out.println(prof.getNombre());
				d.actualizarProfConIndice(pos, prof);
			}


			tabla.setModel(p1);
		}
	}
	
	public void editarPlanif(int pos, Dpto d){
		pl1.modificar(pos, tabla.getValueAt(pos, 0).toString(), Integer.parseInt(tabla.getValueAt(pos, 1).toString()), 
				Integer.parseInt(tabla.getValueAt(pos, 2).toString()), (String)tabla.getValueAt(pos, 3), (String)tabla.getValueAt(pos, 4),
				Integer.parseInt(tabla.getValueAt(pos, 5).toString()), Integer.parseInt(tabla.getValueAt(pos, 6).toString()),
				(String)tabla.getValueAt(pos, 7));

		Planificacion planif = new Planificacion(tabla.getValueAt(pos, 0).toString(), Integer.parseInt(tabla.getValueAt(pos, 1).toString()),
				Integer.parseInt(tabla.getValueAt(pos, 2).toString()), new AsigPorProf( Integer.parseInt(tabla.getValueAt(pos, 6).toString()), 
						(String)tabla.getValueAt(pos, 4), (String)tabla.getValueAt(pos, 7), (String)tabla.getValueAt(pos, 3),
						Integer.parseInt(tabla.getValueAt(pos, 5).toString())));
		d.actualizarPlanifConIndice(pos, planif);
		tabla.setModel(pl1);
		
	}
	
	public void editarAsig(int pos, Dpto d){
		ArrayList<TipoEnsenanza> tipos = new ArrayList<>();

		tipos.add(new TipoEnsenanza("Conferencia", Integer.parseInt(tabla.getValueAt(pos, 7).toString())));
		tipos.add(new TipoEnsenanza("Clase Práctica", Integer.parseInt(tabla.getValueAt(pos, 8).toString())));
		tipos.add(new TipoEnsenanza("Laboratorio", Integer.parseInt(tabla.getValueAt(pos, 9).toString())));
		tipos.add(new TipoEnsenanza("Seminario", Integer.parseInt(tabla.getValueAt(pos, 10).toString())));
		tipos.add(new TipoEnsenanza("Taller", Integer.parseInt(tabla.getValueAt(pos, 11).toString())));

		a1.modificar(pos, (String)tabla.getValueAt(pos, 0), (String)tabla.getValueAt(pos, 1), 
				(Character)tabla.getValueAt(pos, 2), Integer.parseInt(tabla.getValueAt(pos, 3).toString()), 
				(String)tabla.getValueAt(pos, 4), Integer.parseInt(tabla.getValueAt(pos, 5).toString()), (String)tabla.getValueAt(pos, 6), tipos);

		Asignatura a = new Asignatura((String)tabla.getValueAt(pos, 0), (String)tabla.getValueAt(pos, 1), 
				(Character)tabla.getValueAt(pos, 2), Integer.parseInt(tabla.getValueAt(pos, 3).toString()), 
				(String)tabla.getValueAt(pos, 4), Integer.parseInt(tabla.getValueAt(pos, 5).toString()), (String)tabla.getValueAt(pos, 6), tipos);

		d.actualizarAsigConIndice(pos, a);
		tabla.setModel(a1);
	}
	
	public void editarASignacion(int pos, Dpto d){
		as1.modificar(pos, (String)tabla.getValueAt(pos, 0), (String)tabla.getValueAt(pos, 1),
				(String)tabla.getValueAt(pos, 2), Integer.parseInt(tabla.getValueAt(pos, 3).toString()), 
				Integer.parseInt(tabla.getValueAt(pos, 4).toString()));

		AsigPorProf asigP = new AsigPorProf( Integer.parseInt(tabla.getValueAt(pos, 6).toString()), 
				(String)tabla.getValueAt(pos, 4), (String)tabla.getValueAt(pos, 7), (String)tabla.getValueAt(pos, 3),
				Integer.parseInt(tabla.getValueAt(pos, 5).toString()));

		d.actualizarAsignacionConIndice(pos, asigP);
		tabla.setModel(as1);
	}
}
