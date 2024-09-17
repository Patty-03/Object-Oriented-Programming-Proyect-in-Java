package util;

import interfaz.Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.AsigPorProf;
import logica.Dpto;

public class CrearAsignacion extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JComboBox<String> comboBoxProf;
	private JComboBox<String> comboBoxAsignatura;
	private JComboBox<String> comboBoxEnsenanza;
	private JSpinner spinner;
	private JComboBox<String> comboBoxGrupo;
	private JButton button_1;
	private JButton aceptarBtn;
	private Principal p;
	
	private boolean verificarDuplicado(String profesor, String asignatura, String tipoEnsenanza, Dpto d) {
	    for (AsigPorProf asignacion : d.getAsignacionesAsignaturas()) {
	        if (asignacion.getNombreProf().equals(profesor) &&
	            asignacion.getAsignatura().equals(asignatura) &&
	            asignacion.getTipoEnsenanza().equals(tipoEnsenanza)) {
	            return true; 
	        }
	    }
	    return false; 
	}
	
	private boolean validarAsignaciones(String asignatura, String tipoEnsenanza, int grupo, Dpto d) {
	    int contadorConferencia = 0;
	    int contadorClasePractica = 0;
	    int contadorSeminario = 0;
	    ArrayList<String> gruposConTipoEnsenanza = new ArrayList<>();

	    for (AsigPorProf asignacion : d.getAsignacionesAsignaturas()) {
	        if (asignacion.getAsignatura().equals(asignatura)) {
	            switch (asignacion.getTipoEnsenanza()) {
	                case "Conferencia":
	                    contadorConferencia++;
	                    break;
	                case "Clase Práctica":
	                    contadorClasePractica++;
	                    break;
	                case "Seminario":
	                    contadorSeminario++;
	                    break;
	            }
	        }
	        if (asignacion.getGrupo() == grupo) {
	            gruposConTipoEnsenanza.add(asignacion.getTipoEnsenanza());
	        }
	    }

	    if ((tipoEnsenanza.equals("Conferencia") && contadorConferencia >= 2) ||
	        (tipoEnsenanza.equals("Clase Práctica") && contadorClasePractica >= 4) ||
	        (tipoEnsenanza.equals("Seminario") && contadorSeminario >= 4)) {
	        return false; 
	    }

	    if (gruposConTipoEnsenanza.contains(tipoEnsenanza)) {
	        return false; 
	    }

	    return true;
	}


	public CrearAsignacion(final Principal ppal, final Dpto d) {
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		setFont(new Font("Segoe UI", Font.PLAIN, 15));
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setType(Type.UTILITY);
		setUndecorated(true);
		setBounds(100, 100, 600, 345);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		p = ppal;

		JPanel panel = new JPanel();
		//panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel.setBounds(0, 0, 600, 43);
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel lblAgregarAsignacion = new JLabel("AGREGAR ASIGNACION");
		lblAgregarAsignacion.setBounds(12, 5, 379, 35);
		lblAgregarAsignacion.setHorizontalAlignment(SwingConstants.LEFT);
		lblAgregarAsignacion.setFont(new Font("Segoe UI", Font.BOLD, 15));
		panel.add(lblAgregarAsignacion);

		button_1 = new JButton("X");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(550, 0, 48, 40);
		panel.add(button_1);
		button_1.setToolTipText("Salir");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorder(null);
		button_1.setBackground(Color.GRAY);

		JLabel lblNombreProfesor = new JLabel("NOMBRE PROFESOR");
		lblNombreProfesor.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNombreProfesor.setBounds(12, 94, 183, 16);
		contentPanel.add(lblNombreProfesor);

		comboBoxProf = new JComboBox<String>();
		comboBoxProf.setBounds(209, 96, 110, 16);
		contentPanel.add(comboBoxProf);
		String [] modelo = new String[d.getDocentes().size()];

		for(int i = 0; i < d.getDocentes().size(); i++){
			modelo[i] = d.getDocentes().get(i).getNombre();
		}
		comboBoxProf.setModel(new DefaultComboBoxModel<>(modelo));

		JLabel lblNombreAsignatura = new JLabel("NOMBRE ASIGNATURA");
		lblNombreAsignatura.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNombreAsignatura.setBounds(12, 140, 183, 16);
		contentPanel.add(lblNombreAsignatura);

		comboBoxAsignatura = new JComboBox<String>();
		comboBoxAsignatura.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ArrayList<String> modeloTipoE = new ArrayList<String>
				(d.filtrarEnsenanzasPorAsig((String) comboBoxAsignatura.getSelectedItem()));
				String[] arrayE = new String[modeloTipoE.size()];
				
				for(int i= 0; i < modeloTipoE.size(); i++){
					arrayE[i] = modeloTipoE.get(i);
				}
				comboBoxEnsenanza.setModel(new DefaultComboBoxModel<String>(arrayE));

			}
		});
		comboBoxAsignatura.setBounds(209, 142, 110, 16);
		contentPanel.add(comboBoxAsignatura);
		try{
			String[]array = new String[d.getAsignacionesAsignaturas().size()];
			
			for(int i = 0; i < d.getAsignacionesAsignaturas().size(); i++){			
				array[i] =	d.getAsignacionesAsignaturas().get(i).getAsignatura();
			}
			comboBoxAsignatura.setModel(new DefaultComboBoxModel<>(array));
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(this, "Hay error aqui " + e.getMessage() + " " + e.getCause());
		}
		


		JLabel lblTipoEnseanza = new JLabel("TIPO ENSE\u00D1ANZA");
		lblTipoEnseanza.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblTipoEnseanza.setBounds(12, 188, 183, 16);
		contentPanel.add(lblTipoEnseanza);

		comboBoxEnsenanza = new JComboBox<String>();
		comboBoxEnsenanza.setBounds(209, 190, 110, 16);
		contentPanel.add(comboBoxEnsenanza);
		
		JLabel lblGrupo = new JLabel("GRUPO");
		lblGrupo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblGrupo.setBounds(396, 94, 132, 16);
		contentPanel.add(lblGrupo);

		comboBoxGrupo = new JComboBox<String>();
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"11", "12", "13", "14"}));
		comboBoxGrupo.setBounds(528, 96, 60, 16);
		contentPanel.add(comboBoxGrupo);

		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner.setBounds(539, 148, 49, 16);
		contentPanel.add(spinner);

		JLabel lblHoras = new JLabel("HORAS");
		lblHoras.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblHoras.setBounds(396, 144, 132, 21);
		contentPanel.add(lblHoras);

		aceptarBtn = new JButton("");
		aceptarBtn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		aceptarBtn.setMnemonic(KeyEvent.VK_ENTER);
		aceptarBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String profesor = (String) comboBoxProf.getSelectedItem();
		        String asignatura = (String) comboBoxAsignatura.getSelectedItem();
		        String tipoEnsenanza = (String) comboBoxEnsenanza.getSelectedItem();
		        int grupo = Integer.parseInt((String) comboBoxGrupo.getSelectedItem());
		        int horas = (int) spinner.getValue();

		        if (verificarDuplicado(profesor, asignatura, tipoEnsenanza, d)) {
		            JOptionPane.showMessageDialog(CrearAsignacion.this, 
		                "El profesor ya tiene una asignación para esta asignatura y tipo de enseñanza.",
		                "Asignación Duplicada",
		                JOptionPane.WARNING_MESSAGE);
		        } else if (!validarAsignaciones(asignatura, tipoEnsenanza, grupo, d)) {
		            JOptionPane.showMessageDialog(CrearAsignacion.this, 
		                "No se puede agregar esta asignación. Verifique las restricciones de cantidad y grupos.",
		                "Restricciones No Cumplidas",
		                JOptionPane.WARNING_MESSAGE);
		        } else {
		            d.agregarAsignacion(horas, asignatura, tipoEnsenanza, profesor, grupo);
		            JOptionPane.showMessageDialog(CrearAsignacion.this, 
		                "Asignación agregada con Éxito.",
		                "Éxito",
		                JOptionPane.INFORMATION_MESSAGE);
		            dispose();
		        }
		    }
		});


		aceptarBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		aceptarBtn.setIcon(new ImageIcon(CrearAsignacion.class.getResource("/imagenes/Button.png")));
		aceptarBtn.setContentAreaFilled(false);
		aceptarBtn.setBorderPainted(false);
		aceptarBtn.setBorder(null);
		aceptarBtn.setBounds(219, 265, 161, 63);
		contentPanel.add(aceptarBtn);
	}
}
