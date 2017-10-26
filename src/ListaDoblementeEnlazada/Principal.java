package ListaDoblementeEnlazada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;




public class Principal extends JFrame {
	
	private JScrollPane scrollPane;
	private JTextArea text_Area;
	private JButton  btn_insertaradelante, btn_insertarultimo, btn_eliminarprimero, btn_eliminarultimo;
	private ListaDoblementeEnlazada ld = new ListaDoblementeEnlazada();
	private JTextField txt_id, txt_nombre, txt_artista, txt_genero, txt_album;
	private JLabel lbl_id, lbl_Nombre, lbl_Artista;
	private JLabel lblNewLabel;
	//private JLabel con;
	
public Principal() {
		
	    //Tamaño de la ventana 
		super("Lista Doblemente Enlazada");
		setSize(900, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//color de la ventana
		getContentPane().setBackground(new Color(255, 140, 0));
		getContentPane().setLayout(null);
		
		//tamaño de donde se mostratan los datos ingresados
		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 233, 422, 185);
		scrollPane.setToolTipText("");
		scrollPane.setViewportBorder(new TitledBorder(null, "Ventana", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		getContentPane().add(scrollPane);
		
		text_Area = new JTextArea();
		scrollPane.setViewportView(text_Area);
		
		//boton insertar primero
		btn_insertaradelante = new JButton("Insertar Adelante");
		btn_insertaradelante.setBounds(275, 107, 136, 30);
		btn_insertaradelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!(txt_id.getText().isEmpty() && txt_nombre.getText().isEmpty() && txt_artista.getText().isEmpty() && txt_genero.getText().isEmpty() && txt_album.getText().isEmpty())) {
					Musica m = new Musica();
					m.setId(Integer.parseInt(txt_id.getText()));
					m.setNombre(txt_nombre.getText());
					m.setArtista(txt_artista.getText());
					m.setGenero(txt_genero.getText());
					m.setAlbum(txt_album.getText());
					txt_id.setText("");
					txt_nombre.setText("");
					txt_artista.setText("");
					txt_genero.setText("");
					txt_album.setText("");
				}
				else {
					JOptionPane.showMessageDialog(Principal.this, "Es necesario que llene todos los campos", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		getContentPane().add(btn_insertaradelante);
		
		//boton de insertar al ultimo
		btn_insertarultimo = new JButton("Insertar Ultimo");
		btn_insertarultimo.setBounds(275, 158, 136, 30);
		btn_insertarultimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!(txt_id.getText().isEmpty() && txt_nombre.getText().isEmpty() && txt_artista.getText().isEmpty() && txt_genero.getText().isEmpty() && txt_album.getText().isEmpty())) {
					Musica m = new Musica();
					m.setId(Integer.parseInt(txt_id.getText()));
					m.setNombre(txt_nombre.getText());
					m.setArtista(txt_artista.getText());
					m.setGenero(txt_genero.getText());
					m.setAlbum(txt_album.getText());
					txt_id.setText("");
					txt_nombre.setText("");
					txt_artista.setText("");
					txt_genero.setText("");
					txt_album.setText("");
				}
				else {
					JOptionPane.showMessageDialog(Principal.this, "Es necesario que llene todos los campos", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		getContentPane().add(btn_insertarultimo);
		
		//boton eliminar primero
		btn_eliminarprimero = new JButton("Eliminar Primero");
		btn_eliminarprimero.setBounds(32, 447, 130, 20);
		btn_eliminarprimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ld.elimianrp();
			}
		});
		getContentPane().add(btn_eliminarprimero);
		
		//eliminar ultimo
		btn_eliminarultimo = new JButton("Eliminar Ultimo");
		btn_eliminarultimo.setBounds(32, 496, 130, 20);
		btn_eliminarultimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ld.elimianru();
			}
		});
		getContentPane().add(btn_eliminarultimo);
				
		lbl_id  = new JLabel("Id");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_id.setBounds(12, 84, 29, 14);
		getContentPane().add(lbl_id);
		
		txt_id = new JTextField();
		txt_id.setBounds(32, 81, 166, 20);
		getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		lbl_Artista = new JLabel("Artista");
		lbl_Artista.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Artista.setBounds(12, 143, 63, 14);
		getContentPane().add(lbl_Artista);
		
		txt_artista = new JTextField();
		txt_artista.setBounds(70, 140, 128, 20);
		getContentPane().add(txt_artista);
		txt_artista.setColumns(10);
		
		lbl_Nombre = new JLabel("Nombre");
		lbl_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Nombre.setBounds(12, 113, 63, 14);
		getContentPane().add(lbl_Nombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(70, 112, 128, 20);
		getContentPane().add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JLabel lbl_Genero = new JLabel("Genero");
		lbl_Genero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Genero.setBounds(12, 174, 46, 14);
		getContentPane().add(lbl_Genero);
		
		txt_genero = new JTextField();
		txt_genero.setBounds(70, 168, 128, 20);
		getContentPane().add(txt_genero);
		txt_genero.setColumns(10);
		
		JLabel lblAlbum = new JLabel("Album");
		lblAlbum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAlbum.setBounds(12, 202, 46, 20);
		getContentPane().add(lblAlbum);
		
		txt_album = new JTextField();
		txt_album.setBounds(57, 202, 141, 20);
		getContentPane().add(txt_album);
		txt_album.setColumns(10);
		
		//Texto de musica
		lblNewLabel = new JLabel("M U S I C A ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(329, 11, 693, 532);
		lblNewLabel.setFont(new Font("Sakkal Majalla", Font.PLAIN, 40));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jacque\\workspace\\estructura\\src\\ListaDoblementeEnlazada\\violin.jpg"));
		getContentPane().add(lblNewLabel);
		
		//texto
		JLabel lblNewLabel_1 = new JLabel("Lista Doblemente Enlazada ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(295, 25, 328, 30);
		getContentPane().add(lblNewLabel_1);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Principal();
	}
}