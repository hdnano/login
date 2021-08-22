package paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtBienvenidosAMy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBienvenidosAMy = new JTextField();
		txtBienvenidosAMy.setBackground(SystemColor.desktop);
		txtBienvenidosAMy.setForeground(Color.ORANGE);
		txtBienvenidosAMy.setFont(new Font("Tahoma", Font.ITALIC, 26));
		txtBienvenidosAMy.setText("Sistema My Construction");
		txtBienvenidosAMy.setBounds(75, 82, 302, 92);
		contentPane.add(txtBienvenidosAMy);
		txtBienvenidosAMy.setColumns(10);
	}
}
