package paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textusuario;
	private JPasswordField jpassclave;
	private JButton btningresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(170, 22, 84, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(55, 116, 111, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(55, 159, 111, 13);
		contentPane.add(lblNewLabel_2);
		
		textusuario = new JTextField();
		textusuario.setBounds(158, 115, 119, 19);
		contentPane.add(textusuario);
		textusuario.setColumns(10);
		
		jpassclave = new JPasswordField();
		jpassclave.setBounds(159, 158, 118, 19);
		contentPane.add(jpassclave);
		
		btningresar = new JButton("Ingresar");
		btningresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				char[] clave = jpassclave.getPassword();
				String claveFinal = new String (clave);
				
			if(textusuario.getText() .equals("Hernan") && claveFinal.equals("1234")) {
			         dispose();
			    	 JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "INGRESO VALIDO",
			    			 JOptionPane.INFORMATION_MESSAGE);
			         principal p = new principal();
			         p.setVisible(true);
			} 
			else{
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			        textusuario.setText("");
			        jpassclave.setText("");
			        textusuario.requestFocus();
			}
				
			}
				
			});
		btningresar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btningresar.setBounds(274, 208, 128, 31);
		contentPane.add(btningresar);
	}
}
