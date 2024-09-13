package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import logica.Dpto;

public class PantallaDeCarga extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JProgressBar progressBar;
	private Login l1;
	private JLabel label;

	
	
	void iniciarProgreso(Dpto dpto){
		l1 = new Login(dpto);
		int duracion = 2000;
		int intervalo = 50;
		final int incremento = Math.max(1, (100 * intervalo)/duracion);
		Timer tiempo = new Timer(intervalo, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int valor = progressBar.getValue();
				
				if(valor < progressBar.getMaximum()){
					progressBar.setValue(valor + incremento);
				}
				else{
					((Timer)e.getSource()).stop();
					dispose();
					l1.setVisible(true);
				}
			}
		});
		tiempo.start();
	}
	
	public PantallaDeCarga(Dpto dpto) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		progressBar = new JProgressBar();
		progressBar.setValue(0);
		progressBar.setForeground(new Color(48, 107, 91));
		progressBar.setBorder(null);
		progressBar.setBounds(190, 525, 619, 29);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO AL SISTEMA DE GESTION DE CARGA DOCENTE");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1, 409, 999, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblCargando = new JLabel("CARGANDO...");
		lblCargando.setForeground(Color.DARK_GRAY);
		lblCargando.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblCargando.setHorizontalAlignment(SwingConstants.CENTER);
		lblCargando.setBounds(1, 483, 999, 29);
		contentPane.add(lblCargando);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(PantallaDeCarga.class.getResource("/imagenes/Imagen Pantalla Carga.gif")));
		label.setBounds(1, 1, 999, 597);
		contentPane.add(label);
	
		iniciarProgreso(dpto);
	}

}
