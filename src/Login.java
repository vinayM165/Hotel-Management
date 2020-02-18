


	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	import java.awt.Font;
	import java.awt.Window;

	import javax.swing.JTextField;
	import javax.swing.JPasswordField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.sql.*;
	public class Login extends JFrame {

		protected static final Window frame2 = null;
		private JPanel contentPane;
		private JTextField user;
		private JPasswordField pass;
		protected Window frame1;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) throws Exception {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Login frame2 = new Login();
						frame2.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public Login() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 333, 384);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Login");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblNewLabel.setBounds(112, 11, 127, 37);
			contentPane.add(lblNewLabel);
			
			JLabel lblUserid = new JLabel("UserID");
			lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblUserid.setBounds(112, 90, 100, 25);
			contentPane.add(lblUserid);
			
			user = new JTextField();
			user.setBounds(31, 126, 259, 37);
			contentPane.add(user);
			user.setColumns(10);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblPassword.setBounds(112, 179, 100, 25);
			contentPane.add(lblPassword);
			
			pass = new JPasswordField();
			pass.setBounds(31, 215, 259, 37);
			contentPane.add(pass);
			
			JButton btnlogin = new JButton("Login");
			btnlogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0 ) {
					try {
						Class.forName("com.mysql.jdbc.Driver").newInstance();
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_data","root","");
						Statement st = con.createStatement();
						ResultSet sr = st.executeQuery("select * from Employee where userID ='"+user.getText()+"' and password='"+pass.getText().toString()+" '") ;
						
						if(sr.next()){
							JOptionPane.showMessageDialog(null, "Login Succesfully");
							
							dispose();
							Hotelmanagment Hm = new Hotelmanagment();
							Hm.frame.setVisible(true);
							
							
						}
						else {
							JOptionPane.showMessageDialog(null, "incorrect infromation");
						}
							
					} catch (Exception e) {	
						e.printStackTrace();
					}
					
					
				}
			});
			btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnlogin.setBounds(108, 290, 89, 23);
			contentPane.add(btnlogin);
		}
		
	}


