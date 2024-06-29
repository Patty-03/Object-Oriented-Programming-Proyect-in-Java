package interfaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import componentesVisuales.Imagen;

public class Bienvenida extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Autenticacion a1 = new Autenticacion();
	private JLabel lblBienvenidoAlSistema;
	private JProgressBar progressBar;
	private JLabel lblCargando;

	/**
	 * Create the frame.
	 */
	public Bienvenida() {
		setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		setUndecorated(true);
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Desktop\\Lumicons\\Lumicons\\Icons\\System\\Briefcase.ico"));
		setResizable(false);
		setTitle("Bienvenido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblBienvenidoAlSistema = new JLabel("BIENVENIDO AL SISTEMA DE GESTI\u00D3N DE CARGA DOCENTE");
		lblBienvenidoAlSistema.setBackground(new Color(0, 204, 255));
		lblBienvenidoAlSistema.setBounds(5, 25, 788, 72);
		lblBienvenidoAlSistema.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblBienvenidoAlSistema.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBienvenidoAlSistema);
		
		lblCargando = new JLabel("CARGANDO...");
		lblCargando.setHorizontalAlignment(SwingConstants.CENTER);
		lblCargando.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblCargando.setBackground(new Color(0, 204, 255));
		lblCargando.setBounds(325, 362, 149, 38);
		contentPane.add(lblCargando);
		
		progressBar = new JProgressBar();
		progressBar.setBorder(new LineBorder(null));
		progressBar.setValue(0);
		progressBar.setBounds(90, 407, 619, 29);
		progressBar.setForeground(new Color(48, 107, 91));
		contentPane.add(progressBar);
		iniciarProgreso();
		
		Imagen imagen_1 = new Imagen((Icon) null);
		imagen_1.setImagen(new ImageIcon(Bienvenida.class.getResource("/images/logo-recortado-2.png")));
		imagen_1.setBounds(248, 98, 303, 251);
		contentPane.add(imagen_1);
		
		Imagen imagen = new Imagen((Icon) null);
		imagen.setForeground(new Color(255, 255, 255));
		imagen.setImagen(new ImageIcon("C:\\Users\\admin\\Desktop\\Js_Proyects\\Simple Landing Page\\media\\bg.png"));
		imagen.setBounds(0, 0, 805, 527);
		contentPane.add(imagen);
	}
	
	void iniciarProgreso(){
		int duracion = 5000;
		int intervalo = 50;
		final int incremento = Math.max(1, (100 * intervalo)/duracion);
		Timer tiempo = new Timer(intervalo, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor = progressBar.getValue();
				
				if(valor < progressBar.getMaximum()){
					progressBar.setValue(valor + incremento);
				}
				else{
					((Timer)e.getSource()).stop();
					dispose();
					a1.setVisible(true);
				}
			}
		});
		tiempo.start();
	}
}
