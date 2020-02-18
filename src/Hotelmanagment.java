
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import java.awt.Color;
	import javax.swing.JLabel;
	import java.awt.Font;
	import javax.swing.JPanel;
	import javax.swing.border.LineBorder;
	import javax.swing.JTextField;
	import javax.swing.JMenuBar;
	import javax.swing.JMenu;
	import javax.swing.JMenuItem;
	import javax.swing.JTabbedPane;
	import javax.swing.JButton;
	import javax.swing.JTextArea;
	import javax.swing.JComboBox;
	import javax.swing.DefaultComboBoxModel;
	import javax.swing.JCheckBox;
	import javax.swing.JSeparator;
	import javax.swing.SwingConstants;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class Hotelmanagment {

		JFrame frame;
		private JTextField textF;
		private JTextField textSoya;
		private JTextField textMunchurian;
		private JTextField textRice;
		private JTextField txtChooseDrink;
		private JTextField textCurrency;

		double FirstNum;
		double SecondNum;
		String operation;
		String Ans;
		double result;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Hotelmanagment window = new Hotelmanagment();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public Hotelmanagment() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("HOTEL MANAGMENT SYSTEM");
			lblNewLabel.setForeground(Color.CYAN);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
			lblNewLabel.setBounds(522, 40, 848, 68);
			frame.getContentPane().add(lblNewLabel);
			
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
			panel.setBounds(0, 40, 443, 648);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 0, 423, 643);
			panel.add(tabbedPane);
			
			//======================Calc============================================
			
			JPanel panel_4 = new JPanel();
			tabbedPane.addTab("Calculator", null, panel_4, null);
			panel_4.setLayout(null);
			
			textF = new JTextField();
			textF.setFont(new Font("Tahoma", Font.PLAIN, 30));
			textF.setColumns(10);
			textF.setBounds(10, 11, 390, 78);
			panel_4.add(textF);
			
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn7.getText();
					textF.setText(E);
				}
			});
			btn7.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn7.setBounds(10, 111, 89, 78);
			panel_4.add(btn7);
			
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn8.getText();
					textF.setText(E);
					
				}
			});
			btn8.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn8.setBounds(105, 111, 89, 78);
			panel_4.add(btn8);
			
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E=textF .getText()+btn9.getText();
					textF.setText(E);
				}
			});
			btn9.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn9.setBounds(204, 111, 89, 78);
			panel_4.add(btn9);
			
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn4.getText();
					textF.setText(E);
				}
			});
			btn4.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn4.setBounds(10, 200, 89, 78);
			panel_4.add(btn4);
			
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn5.getText();
					textF.setText(E);
				}
				
			});
			btn5.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn5.setBounds(105, 200, 89, 78);
			panel_4.add(btn5);
			
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn6.getText();
					textF.setText(E);
				}
			});
			btn6.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn6.setBounds(204, 200, 89, 78);
			panel_4.add(btn6);
			
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn1.getText();
					textF.setText(E);
				}
			});
			btn1.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn1.setBounds(10, 289, 89, 78);
			panel_4.add(btn1);
			
			JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn2.getText();
					textF.setText(E);
				}
			});
			btn2.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn2.setBounds(105, 289, 89, 78);
			panel_4.add(btn2);
			
			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn3.getText();
					textF.setText(E);
				}
			});
			btn3.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn3.setBounds(204, 289, 89, 78);
			panel_4.add(btn3);
			
			JButton btnMul = new JButton("X");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					FirstNum=Double.parseDouble(textF.getText());
					textF.setText(" ");
					operation="X";
				}
			});
			btnMul.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnMul.setBounds(311, 289, 89, 78);
			panel_4.add(btnMul);
			
			JButton btnM = new JButton("-");
			btnM.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					FirstNum=Double.parseDouble(textF.getText());
					textF.setText("");
					operation="-";
				}
			});
			btnM.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnM.setBounds(311, 200, 89, 78);
			panel_4.add(btnM);
			
			JButton btnA = new JButton("+");
			btnA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					FirstNum=Double.parseDouble(textF.getText());
					textF.setText(" ");
					operation="+";
				}
			});
			btnA.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnA.setBounds(311, 111, 89, 78);
			panel_4.add(btnA);
			
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btn0.getText();
					textF.setText(E);
				}
			});
			btn0.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btn0.setBounds(10, 378, 89, 78);
			panel_4.add(btn0);
			
			JButton btnDot = new JButton(".");
			btnDot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String E= textF.getText()+btnDot.getText();
					textF.setText(E);
				}
			});
			btnDot.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnDot.setBounds(105, 378, 89, 78);
			panel_4.add(btnDot);
			
			JButton btncle = new JButton("C");
			btncle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textF.setText(null);
				}
			});
			btncle.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btncle.setBounds(204, 378, 89, 78);
			panel_4.add(btncle);
			
			JButton btnP = new JButton("%");
			btnP.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					FirstNum=Double.parseDouble(textF.getText());
					textF.setText(" ");
					operation="%";
				}
			});
			btnP.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnP.setBounds(311, 378, 89, 78);
			panel_4.add(btnP);
			
			JButton BtnDel = new JButton("\uF0E7");
			BtnDel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(textF.getText().length()>0) {
						String backspace=null;
						StringBuilder stB=new StringBuilder(textF.getText());
							stB.deleteCharAt(textF.getText().length()-1);
							backspace=stB.toString();
							textF.setText(backspace);
					}
				}});
			BtnDel.setBounds(10, 467, 89, 78);
			panel_4.add(BtnDel);
			
			JButton btnS = new JButton("/");
			btnS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					FirstNum=Double.parseDouble(textF.getText());
					textF.setText(" ");
					operation="/";
				}
			});
			btnS.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnS.setBounds(130, 467, 89, 78);
			panel_4.add(btnS);
			
			JButton btnE = new JButton("=");
			btnE.setForeground(Color.BLACK);
			btnE.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String answer;
					SecondNum=Double.parseDouble(textF.getText());
					try {
						if(operation=="+") {
						
						result=FirstNum+SecondNum;
						answer = String.format("%.2f", result);
						 textF.setText(answer);
					}
					 else if(operation == "-")
					 {
					 result = FirstNum - SecondNum;
					
					 answer = String.format("%.2f", result);
					 textF.setText(answer);
					 }
					 else if(operation == "X")
					 {
					 result = FirstNum * SecondNum;
					 answer = String.format("%.2f", result);
					 textF.setText(answer);
					 }
					 else if(operation == "/")
					 {
					 result = FirstNum / SecondNum;
					 answer = String.format("%.2f", result);
					 textF.setText(answer);
					 }
					 else if(operation == "%")
					 {
					 result = FirstNum % SecondNum;
					 answer = String.format("%.2f", result);
					 textF.setText(answer);
					 }
					
					 
				}
				catch(Exception E) {
					
				}
				}
			});
			btnE.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnE.setBounds(240, 467, 160, 78);
			panel_4.add(btnE);
			
			//-------------------------------------------------------------------------ROW 1-----------------------------------------------------------------------------------		
			JPanel panel_1 = new JPanel();
			tabbedPane.addTab("Recipt\r\n", null, panel_1, null);
			panel_1.setLayout(null);
			
			JTextArea textRArea = new JTextArea();
			textRArea.setBounds(10, 11, 398, 519);
			panel_1.add(textRArea);
			
			JPanel panel_Receipt = new JPanel();
			panel_Receipt.setToolTipText("Reciept\r\n");
			panel_Receipt.setBounds(1360, 686, -900, -277);
			frame.getContentPane().add(panel_Receipt);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
			panel_2.setBounds(463, 119, 907, 276);
			frame.getContentPane().add(panel_2);
			panel_2.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("Menu");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
			lblNewLabel_1.setBounds(27, 21, 107, 27);
			panel_2.add(lblNewLabel_1);
			
			JLabel lblQty = new JLabel("Qty\r\n");
			lblQty.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
			lblQty.setBounds(212, 21, 107, 27);
			panel_2.add(lblQty);
			
			JLabel lblPriceRs = new JLabel("Price Rs.\r\n");
			lblPriceRs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
			lblPriceRs.setBounds(361, 21, 140, 27);
			panel_2.add(lblPriceRs);
			
			JLabel lblSoya = new JLabel("Roti\r\n\r\n\r\n");
			lblSoya.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblSoya.setBounds(27, 71, 166, 20);
			panel_2.add(lblSoya);
			
			JLabel lblMunchurian = new JLabel("Sabzi\r\n");
			lblMunchurian.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblMunchurian.setBounds(27, 102, 166, 16);
			panel_2.add(lblMunchurian);
			
			JLabel lblRice = new JLabel("Rice\r\n");
			lblRice.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblRice.setBounds(27, 129, 166, 20);
			panel_2.add(lblRice);
			
			JComboBox btnChooseDrink = new JComboBox();
			btnChooseDrink.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a Drink", "Pespi", "Coke", "7UP", "Mountain Dew", "Mazaa", "Slice"}));
			btnChooseDrink.setToolTipText("Choose a Drink");
			btnChooseDrink.setBounds(27, 160, 107, 20);
			panel_2.add(btnChooseDrink);
			
			textSoya = new JTextField();
			textSoya.setBounds(189, 69, 86, 20);
			panel_2.add(textSoya);
			textSoya.setColumns(10);
			
			textMunchurian = new JTextField();
			textMunchurian.setBounds(189, 98, 86, 20);
			panel_2.add(textMunchurian);
			textMunchurian.setColumns(10);
			
			textRice = new JTextField();
			textRice.setBounds(189, 129, 86, 20);
			panel_2.add(textRice);
			textRice.setColumns(10);
			
			txtChooseDrink = new JTextField();
			txtChooseDrink.setBounds(189, 160, 86, 20);
			panel_2.add(txtChooseDrink);
			txtChooseDrink.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Rs.60\r\n");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_3.setBounds(353, 66, 107, 25);
			panel_2.add(lblNewLabel_3);
			
			JLabel lblRs = new JLabel("Rs.80\r\n");
			lblRs.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblRs.setBounds(353, 93, 107, 25);
			panel_2.add(lblRs);
			
			JLabel lblRs_1 = new JLabel("Rs.100\r\n");
			lblRs_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblRs_1.setBounds(353, 124, 107, 25);
			panel_2.add(lblRs_1);
			
			JLabel lblRs_2 = new JLabel("Rs.30\r\n");
			lblRs_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblRs_2.setBounds(353, 155, 107, 25);
			panel_2.add(lblRs_2);
			
			JCheckBox btnDelivery = new JCheckBox("Delivery Charges");
			btnDelivery.setBounds(27, 202, 140, 23);
			panel_2.add(btnDelivery);
			
			JCheckBox btnTax = new JCheckBox("Tax");
			btnTax.setBounds(27, 228, 107, 23);
			panel_2.add(btnTax);
			
		
			
			
			JSeparator separator = new JSeparator();
			separator.setBounds(561, 152, 126, -129);
			panel_2.add(separator);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(542, 226, 30, -203);
			panel_2.add(separator_1);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBounds(542, 239, 0, -203);
			panel_2.add(separator_2);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setForeground(Color.ORANGE);
			separator_3.setBackground(Color.RED);
			separator_3.setBounds(542, 34, -10, 191);
			panel_2.add(separator_3);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setBounds(37, 191, 505, 2);
			panel_2.add(separator_4);
			
			JSeparator separator_5 = new JSeparator();
			separator_5.setOrientation(SwingConstants.VERTICAL);
			separator_5.setBounds(561, 202, 11, -179);
			panel_2.add(separator_5);
			
			JSeparator separator_6 = new JSeparator();
			separator_6.setOrientation(SwingConstants.VERTICAL);
			separator_6.setBounds(577, 251, -52, -215);
			panel_2.add(separator_6);
			
			JSeparator separator_7 = new JSeparator();
			separator_7.setOrientation(SwingConstants.VERTICAL);
			separator_7.setBounds(541, 21, 31, 230);
			panel_2.add(separator_7);
			
			JLabel lblCurrencyConverter = new JLabel("Currency Converter");
			lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
			lblCurrencyConverter.setBounds(577, 21, 298, 34);
			panel_2.add(lblCurrencyConverter);
			
			JComboBox btnCurrency = new JComboBox();
			btnCurrency.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose a Currency", "Rupees", "Yen", "Dirham", "Dollar", "Pound"}));
			btnCurrency.setBounds(601, 71, 245, 34);
			panel_2.add(btnCurrency);
			
			textCurrency = new JTextField();
			textCurrency.setBounds(601, 115, 245, 34);
			panel_2.add(textCurrency);
			textCurrency.setColumns(10);
			
			JLabel lblCurrency = new JLabel("\r\n");
			lblCurrency.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			lblCurrency.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblCurrency.setBounds(601, 164, 245, 29);
			panel_2.add(lblCurrency);
			
			JButton btnRese = new JButton("Reset");
			btnRese.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnRese.setFont(new Font("Tahoma", Font.BOLD, 22));
			btnRese.setBounds(723, 217, 107, 34);
			panel_2.add(btnRese);
			
			JButton btnConvert = new JButton("Convert\r\n");
			btnConvert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnConvert.setFont(new Font("Tahoma", Font.BOLD, 22));
			btnConvert.setBounds(601, 217, 126, 34);
			panel_2.add(btnConvert);
			
			
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
			panel_3.setBounds(463, 406, 907, 282);
			frame.getContentPane().add(panel_3);
			panel_3.setLayout(null);
			
			JSeparator separator_8 = new JSeparator();
			separator_8.setOrientation(SwingConstants.VERTICAL);
			separator_8.setBounds(531, 25, 31, 230);
			panel_3.add(separator_8);
			
			JLabel lblTotalCostM = new JLabel("Total cost of Meal\r\n\r\n");
			lblTotalCostM.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblTotalCostM.setBounds(33, 41, 200, 35);
			panel_3.add(lblTotalCostM);
			
			JLabel lblTotalCostD = new JLabel("Total cost of Drinks\r\n");
			lblTotalCostD.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblTotalCostD.setBounds(33, 103, 200, 35);
			panel_3.add(lblTotalCostD);
			
			JLabel lblCostOfDelivery = new JLabel("cost of Delivery");
			lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblCostOfDelivery.setBounds(33, 164, 200, 35);
			panel_3.add(lblCostOfDelivery);
			
			JLabel txtTotalCostOfMeal = new JLabel("\r\n");
			txtTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtTotalCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			txtTotalCostOfMeal.setBounds(258, 41, 245, 35);
			panel_3.add(txtTotalCostOfMeal);
			
			JLabel txtTotalCostOfDrink = new JLabel("");
			txtTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtTotalCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			txtTotalCostOfDrink.setBounds(258, 103, 245, 35);
			panel_3.add(txtTotalCostOfDrink);
			
			JLabel txtCostOfDelivery = new JLabel("\r\n");
			txtCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			txtCostOfDelivery.setBounds(258, 164, 245, 35);
			panel_3.add(txtCostOfDelivery);
			
			JLabel txtTax = new JLabel("\r\n");
			txtTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			txtTax.setBounds(258, 220, 245, 35);
			panel_3.add(txtTax);
			
			JLabel lblSubtotal = new JLabel("SubTotal");
			lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblSubtotal.setBounds(558, 41, 100, 35);
			panel_3.add(lblSubtotal);
			
			JLabel lblTotalCost = new JLabel("Total Cost");
			lblTotalCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblTotalCost.setBounds(652, 103, 200, 35);
			panel_3.add(lblTotalCost);
			
			JLabel txtSubTotal = new JLabel("\r\n");
			txtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			txtSubTotal.setBounds(668, 41, 217, 35);
			panel_3.add(txtSubTotal);
			
			JLabel txtCost = new JLabel("\r\n");
			txtCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtCost.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			txtCost.setBounds(572, 149, 288, 35);
			panel_3.add(txtCost);
			
			JButton btnPrint = new JButton("Print\r\n");
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					Double Invoice1 = Double.parseDouble(textSoya.getText());
					 Double Invoice2 = Double.parseDouble(textMunchurian.getText());
					 Double Invoice3 = Double.parseDouble(textRice.getText());
					 Double Invoice4 = Double.parseDouble(txtChooseDrink.getText());
					 Double tax1= Double.parseDouble(txtTax.getText());
					 Double Delivery1= Double.parseDouble(txtCostOfDelivery.getText());
					 textRArea.append("\t\nHotel Management System:\n"

					 + "\nSoya Bean: \t\t" + Invoice1
					 + "\nMunchurian: \t\t" + Invoice2
					 + "\nRice : \t\t" + Invoice3
					 + "\n" + btnChooseDrink.getSelectedItem() + " :\t\t" +  Invoice4
					 + "\nDelivery : \t\t" + Delivery1
					 + "\nTax : \t\t" + tax1
					 +"\nTotal : \t\t" + txtCost.getText()
					 + "\n\n\nWelcome and Please visit again!!!"
					);

				}
			});
			btnPrint.setFont(new Font("Tahoma", Font.BOLD, 22));
			btnPrint.setBounds(658, 221, 115, 34);
			panel_3.add(btnPrint);
			
			JLabel lblTax = new JLabel("Tax");
			lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblTax.setBounds(33, 220, 200, 35);
			panel_3.add(lblTax);
			
			JMenuBar menuBar = new JMenuBar();
			menuBar.setToolTipText("");
			menuBar.setBounds(0, 0, 1450, 29);
			frame.getContentPane().add(menuBar);
			
			JMenu mnNewMenu = new JMenu("File\r\n");
			mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 18));
			menuBar.add(mnNewMenu);
			
			JMenu mnNew = new JMenu("New");
			mnNewMenu.add(mnNew);
			
			JMenuItem mntmReciept = new JMenuItem("Reciept\r\n");
			mnNew.add(mntmReciept);
			
			JMenuItem mntmNewMenuItem = new JMenuItem("Reset\r\n");
			mnNew.add(mntmNewMenuItem);
			
			JMenuItem mntmConvert = new JMenuItem("Convert");
			mnNewMenu.add(mntmConvert);
			
			JMenuItem mntmCconvert = new JMenuItem("convert");
			mnNewMenu.add(mntmCconvert);
			
			JMenuItem mntmRefresh = new JMenuItem("Refresh");
			mnNewMenu.add(mntmRefresh);
			
			JMenuItem mntmExit = new JMenuItem("Exit");
			mntmExit.setForeground(Color.RED);
			mnNewMenu.add(mntmExit);
			
			JMenu mnMenu = new JMenu("Menu");
			mnMenu.setFont(new Font("Segoe UI", Font.BOLD, 18));
			menuBar.add(mnMenu);
			
			JMenuBar menuBar_1 = new JMenuBar();
			menuBar.add(menuBar_1);
			frame.setBounds(0, 0, 1386, 738);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
			
			JButton btnSubmit = new JButton("Submit");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
					
					//==========================Drink==============================
				
						double Drinks = Double.parseDouble(txtChooseDrink.getText());
						double Pepsi = 30.00*Drinks;
						double Coke = 30.00*Drinks;
						double SevenUp= 20.00*Drinks;
						double MountainD=30.00*Drinks;
						double Mazaa=25.00*Drinks;
						double Slice=20.00*Drinks;
					
				if(btnChooseDrink.getSelectedItem().equals("Pespi"))
					 {
							String pPepsi = String.format("%.3f",Pepsi);
							txtTotalCostOfDrink.setText(pPepsi);
					 }	
					
				if(btnChooseDrink.getSelectedItem().equals("Coke"))
					 {
							String pCoke = String.format("%.3f", Coke);
							txtTotalCostOfDrink.setText(pCoke);
					 }
					
				if(btnChooseDrink.getSelectedItem().equals("7UP"))
					 {
						 	String pSevenUp = String.format("%.3f", SevenUp);
						 	txtTotalCostOfDrink.setText(pSevenUp);
					 }
				if(btnChooseDrink.getSelectedItem().equals("Mountain Dew")) {
						 String pMountain = String.format("%.3f", MountainD);
						 	txtTotalCostOfDrink.setText(pMountain);
					 }
				if(btnChooseDrink.getSelectedItem().equals("Mazaa")) {
						 String pMazaa = String.format("%.3f", Mazaa);
						 	txtTotalCostOfDrink.setText(pMazaa);
					 }
				if(btnChooseDrink.getSelectedItem().equals("Slice")) {
						 String pSlice = String.format("%.3f", Slice);
						 	txtTotalCostOfDrink.setText(pSlice);
					 }
					 			
					 if(btnChooseDrink.getSelectedItem().equals("Choose a drink"))
					 {
					 txtTotalCostOfDrink.setText("0.000");
					 }

					//============================Meal==========================
					 
					  double Soya = Double.parseDouble(textSoya.getText());
					  double pSoya = 60.00;
					  double getSoya;
					  getSoya = (Soya * pSoya);
					  String TotalSoya = String.format("%.3f", getSoya);
					  txtTotalCostOfMeal.setText(TotalSoya);
					 
					  double Munchurian = Double.parseDouble(textMunchurian.getText());
					  double pMunchurian = 80.00;
					  double getMunchurian;
					  getMunchurian = (Munchurian * pMunchurian);
					  String TotalMunchurian = String.format("%.3f", getMunchurian + getMunchurian);
					  txtTotalCostOfMeal.setText(TotalMunchurian);
					 
					  double Rice = Double.parseDouble(textRice.getText());
					  double pRice = 100.00;
					  double getRice;
					  getRice = (Rice * pRice);
					  String TotalMeal = String.format("%.3f", getSoya + getMunchurian +
					 getRice);
					  txtTotalCostOfMeal.setText(TotalMeal);
					
					  //========================Delivery===========================
					//========================Delivery===========================

					  double cDelivery = 40.50;
					  if(btnDelivery.isSelected())
					  {
					  String pDelivery = String.format("%.3f", cDelivery);
					  txtCostOfDelivery.setText(pDelivery);
					  }
					  else
					 {
					  txtCostOfDelivery.setText("0.000");
					 }
					  
					  //================================Tax=====================================
					  
					  double pTotal1 = Double.parseDouble(txtTotalCostOfMeal.getText());
					  double pTotal2 = Double.parseDouble(txtTotalCostOfDrink.getText());
					  double pTotal3 = Double.parseDouble(txtCostOfDelivery.getText());
					  double cTotal = (pTotal1 + pTotal2 + pTotal3)/100;

					  if(btnTax.isSelected())
					  {

					  String xTotal = String.format("%.3f", cTotal);
					  txtTax.setText(xTotal);
					  }
					//===========================Total=================================
					  double pTotal4 = Double.parseDouble(txtTax.getText());

					  String zTaxTotal = String.format("%.3f", pTotal4);
					  txtTax.setText(zTaxTotal);

					  double SubTotal = (pTotal1 + pTotal2 + pTotal3);
					  String pSubTotal = String.format("Rs %.3f", SubTotal);
					  txtSubTotal.setText(pSubTotal);

					  double xTotal = (pTotal1 + pTotal2 + pTotal3 + pTotal4);
					  String yTotal = String.format("Rs %.3f", xTotal);
					  txtCost.setText(yTotal);

					  
					  
				}
		catch(Exception E) {
						
		}
	 }
	});
			btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 22));
			btnSubmit.setBounds(234, 217, 126, 34);
			panel_2.add(btnSubmit);
		
			
			
			JButton btnReset = new JButton("Reset");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textSoya.setText(null);
					textMunchurian.setText(null);
					textRice.setText(null);
					 txtChooseDrink.setText(null);
					 txtTotalCostOfMeal.setText(null);
					 txtTotalCostOfDrink.setText(null);
					 txtCostOfDelivery.setText(null);
					 
					 txtTax.setText(null);
					 txtSubTotal.setText(null);
					 txtCost.setText(null);
					 
					 textF.setText(null);
					 btnChooseDrink.setSelectedItem("Choose a drink");
					 
					  textRArea.setText(null);
				}
			});
			btnReset.setFont(new Font("Tahoma", Font.BOLD, 22));
			btnReset.setBounds(353, 217, 107, 34);
			panel_2.add(btnReset);
			
			
		  }
	  }



