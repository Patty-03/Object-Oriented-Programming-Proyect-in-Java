package util;

import interfaz.Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import logica.Asignatura;
import logica.Docente;
import logica.Dpto;
import modelos.AsigPorDisciplinaTableModel;
import modelos.AsigPorProfTableModel;
import modelos.ProfPorAsigTableModel;
import modelos.ProfPorDispTableModel;

public class ReportesPopup extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel title;
	private JButton button;
	private JComboBox comboBox;
	private String codigoTabla;
	private MostrarReportesPopup rep;

	public ReportesPopup(Principal p, final Dpto d) {
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
		setType(Type.POPUP);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		//contentPanel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		rep = new MostrarReportesPopup();
		
		title = new JLabel("Seleccione el nombre de la asignatura a listar");
		title.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(0, 94, 450, 27);
		contentPanel.add(title);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enviarTabla(codigoTabla, d);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(ReportesPopup.class.getResource("/imagenes/Button.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(144, 237, 161, 63);
		contentPanel.add(button);
		
		comboBox = new JComboBox();
		comboBox.setBounds(144, 134, 161, 22);
		contentPanel.add(comboBox);
	}
	
	public void setCodigoTabla(String codigo){
		this.codigoTabla = codigo;
	}
	
	public void tipoReporte(String reporte, String[] array, String codigo){
		title.setText(reporte);
		
		comboBox.setModel(new DefaultComboBoxModel<>(array));
		
		setCodigoTabla(codigo);
	}

	public AsigPorDisciplinaTableModel crearablaAsigPorDisciplina(Dpto d){
		String disc = (String) comboBox.getSelectedItem();
		
		ArrayList<Asignatura> as = d.buscarAsigPorDisc(disc);
		
		Asignatura[] valores = new Asignatura[as.size()];
		int i = 0;
		
		for(Asignatura a: as){
			valores[i] = a;
			i++;
		}
		
		AsigPorDisciplinaTableModel tableModel = new AsigPorDisciplinaTableModel(valores);
		
		return tableModel;
	}
	
	public ProfPorDispTableModel crearablaProfPorDisp(Dpto d){
		String disp = (String) comboBox.getSelectedItem();
		ArrayList<Docente> prof = d.buscarProfPorDisp(disp);
		
		Docente[] valores = new Docente[prof.size()];
		
		
		
		for(int i = 0; i < prof.size(); i++){
			valores[i] = prof.get(i);
			System.out.println(valores[i].getNombre()+ " Reportes");
		}
		
		ProfPorDispTableModel tableModel = new ProfPorDispTableModel(valores);
		tableModel.actualizarTabla(d, disp);
		
		return tableModel;
	}
	
	public ProfPorDispTableModel crearablaProfPorCatDoc(Dpto d){
		String disp = (String) comboBox.getSelectedItem();
		ArrayList<Docente> prof = d.buscarProfPorCatDoc(disp);
		
		Docente[] valores = new Docente[prof.size()];
		
		int i = 0;
		
		for(Docente a: prof){
			valores[i] = a;
			i++;
		}
		ProfPorDispTableModel tableModel = new ProfPorDispTableModel(valores);
		
		return tableModel;
	}
	
	public ProfPorDispTableModel crearablaProfPorCatCientif(Dpto d){
		String disp = (String) comboBox.getSelectedItem();
		ArrayList<Docente> prof = d.buscarProfPorCatCientif(disp);
		
		Docente[] valores = new Docente[prof.size()];
		
		int i = 0;
		
		for(Docente a: prof){
			valores[i] = a;
			i++;
		}
		ProfPorDispTableModel tableModel = new ProfPorDispTableModel(valores);
		
		return tableModel;
	}
	
	public void enviarTabla(String codigo, Dpto d){
		DefaultTableModel tableModel = new DefaultTableModel();
		String titulo = new String();
		
		if(codigo.equals("AsigPorDisciplinaTableModel")){
			tableModel = crearablaAsigPorDisciplina(d);
			titulo = "Asignaturas Por Disciplina";
			rep.recibirInfo(titulo, tableModel);
			rep.setVisible(true);
			rep.setLocationRelativeTo(null);
		}
		else if(codigo.equals("ProfPorDisponibTableModel")){
			tableModel = crearablaProfPorDisp(d);
			titulo = "Profesores por Disponibilidad";
			rep.recibirInfo(titulo, tableModel);
			rep.setVisible(true);
			rep.setLocationRelativeTo(null);
		}
		else if(codigo.equals("ProfPorCatDocTableModel")){
			tableModel = crearablaProfPorCatDoc(d);
			titulo = "Profesores por Cat. Docente";
			rep.recibirInfo(titulo, tableModel);
			rep.setVisible(true);
			rep.setLocationRelativeTo(null);
		}
		else if(codigo.equals("ProfporCatCientif")){
			tableModel = crearablaProfPorCatCientif(d);
			titulo = "Profesores por Cat. Cientifica";
			rep.recibirInfo(titulo, tableModel);
			rep.setVisible(true);
			rep.setLocationRelativeTo(null);
		}
		else if(codigo.equals("CalcSalario")){
			float salario = d.getDocentes().get(d.buscarProfesor((String)comboBox.getSelectedItem())).getSalario();
			JOptionPane.showMessageDialog(this, "El salario del profesor es: " + salario);
		}
		else if(codigo.equals("DocPorAsig")){
			tableModel = crearablaProfPorAsig(d);
			titulo = "Profesores por Asignatura";
			rep.recibirInfo(titulo, tableModel);
			rep.setVisible(true);
			rep.setLocationRelativeTo(null);
		}
		else if(codigo.equals("AsigPorDoc")){
			tableModel = crearAsigPorProf(d);
			titulo = "Asignaturas por profesores";
			rep.recibirInfo(titulo, tableModel);
			rep.setVisible(true);
			rep.setLocationRelativeTo(null);
		}
	}
	
	public ProfPorAsigTableModel crearablaProfPorAsig(Dpto d){
		String disp = (String) comboBox.getSelectedItem();
		ArrayList<Docente> prof = d.buscarProfPorAsig(disp);
		
		Docente[] valores = new Docente[prof.size()];
		
		int i = 0;
		
		for(Docente a: prof){
			valores[i] = a;
			i++;
		}
		ProfPorAsigTableModel tableModel = new ProfPorAsigTableModel(valores);
		
		return tableModel;
	}
	
	public AsigPorProfTableModel crearAsigPorProf(Dpto d){
		String disp = (String) comboBox.getSelectedItem();
		ArrayList<Asignatura> asig = d.buscarAsigPorProf(disp);
		
		Asignatura[] valores = new Asignatura[asig.size()];
		
		int i = 0;
		
		for(Asignatura a: asig){
			valores[i] = a;
			i++;
		}
		AsigPorProfTableModel tableModel = new AsigPorProfTableModel(valores, d, 
				(String) comboBox.getSelectedItem());
		
		return tableModel;
	}
}
