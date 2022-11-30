package G;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class G {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_22;
	private JTextField textField_21;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_28;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					G window = new G();
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
	public G() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 681, 481);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Menu des produits", null, tabbedPane_1, null);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("Ventes", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 661, 283);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(108, 11, 148, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Réfèrence:");
		lblNewLabel.setBounds(10, 14, 79, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ref. fournisseur:");
		lblNewLabel_1.setBounds(10, 55, 89, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 52, 148, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setDropMode(DropMode.ON);
		textPane.setEditable(false);
		textPane.setBounds(367, 34, 261, 186);
		panel_1.add(textPane);
		
		JLabel lblNewLabel_2 = new JLabel("Liste des objets en ventes:");
		lblNewLabel_2.setBounds(424, 14, 158, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Unité:");
		lblNewLabel_3.setBounds(10, 189, 79, 20);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 189, 148, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(486, 135, 17, 48);
		panel_1.add(scrollBar);
		
		JButton btnNewButton = new JButton("Vendre");
		btnNewButton.setBounds(539, 249, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Catégorie:");
		lblNewLabel_4.setBounds(10, 100, 79, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sous categorie :");
		lblNewLabel_5.setBounds(10, 143, 89, 14);
		panel_1.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 97, 148, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 140, 148, 20);
		panel_1.add(textField_4);
		
		JButton btnAjouterAuPanier = new JButton("Ajouter au panier");
		btnAjouterAuPanier.setBounds(79, 249, 148, 23);
		panel_1.add(btnAjouterAuPanier);
		
		JLabel lblNewLabel_8 = new JLabel("Reduction:");
		lblNewLabel_8.setBounds(370, 253, 63, 14);
		panel_1.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setBounds(443, 250, 86, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBounds(0, 294, 331, 146);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblInformationDeLa = new JLabel("Information sur la transaction:");
		lblInformationDeLa.setBounds(92, 5, 146, 14);
		panel_2.add(lblInformationDeLa);
		
		JLabel lblNewLabel_6 = new JLabel("Prix hors tax:");
		lblNewLabel_6.setBounds(10, 28, 84, 14);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("TVA:");
		lblNewLabel_7.setBounds(10, 53, 68, 14);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6_1 = new JLabel("Prix final:");
		lblNewLabel_6_1.setBounds(10, 91, 84, 14);
		panel_2.add(lblNewLabel_6_1);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setEnabled(false);
		textField_5.setBounds(92, 25, 146, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		textField_6.setBounds(92, 53, 146, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setEnabled(false);
		textField_7.setBounds(92, 88, 146, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBounds(341, 294, 320, 131);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Generer la transaction en pdf");
		btnNewButton_1.setBounds(56, 30, 231, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Imprimer la facture");
		btnNewButton_2.setBounds(56, 80, 231, 23);
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab("Organisations des produits", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(230, 230, 250));
		panel_5.setBounds(0, 0, 392, 341);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Nom :");
		lblNewLabel_9.setBounds(10, 11, 46, 14);
		panel_5.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("Categorie:");
		lblNewLabel_9_1.setBounds(10, 49, 74, 14);
		panel_5.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("Sous-categorie");
		lblNewLabel_9_2.setBounds(10, 88, 74, 14);
		panel_5.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("Reference :");
		lblNewLabel_9_2_1.setBounds(10, 116, 85, 14);
		panel_5.add(lblNewLabel_9_2_1);
		
		JLabel lblNewLabel_9_2_2 = new JLabel("Ref. fournisseur:");
		lblNewLabel_9_2_2.setBounds(10, 153, 95, 14);
		panel_5.add(lblNewLabel_9_2_2);
		
		JLabel lblNewLabel_9_2_3 = new JLabel("Fournisseur");
		lblNewLabel_9_2_3.setBounds(8, 190, 85, 14);
		panel_5.add(lblNewLabel_9_2_3);
		
		JLabel lblNewLabel_9_2_4 = new JLabel("Quantite:");
		lblNewLabel_9_2_4.setBounds(9, 228, 86, 14);
		panel_5.add(lblNewLabel_9_2_4);
		
		JLabel lblNewLabel_9_2_3_1 = new JLabel("Prix:");
		lblNewLabel_9_2_3_1.setBounds(9, 261, 46, 14);
		panel_5.add(lblNewLabel_9_2_3_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(118, 8, 123, 20);
		panel_5.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(118, 113, 123, 20);
		panel_5.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(118, 150, 123, 20);
		panel_5.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(118, 187, 123, 20);
		panel_5.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(118, 225, 123, 20);
		panel_5.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(118, 258, 123, 20);
		panel_5.add(textField_14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 45, 123, 22);
		panel_5.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(118, 84, 123, 22);
		panel_5.add(comboBox_1);
		
		JButton btnNewButton_3 = new JButton("Ajouter");
		btnNewButton_3.setBounds(84, 307, 175, 23);
		panel_5.add(btnNewButton_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(230, 230, 250));
		panel_6.setBounds(402, 0, 259, 414);
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Chercher un produit:");
		lblNewLabel_10.setBounds(76, 11, 109, 14);
		panel_6.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Mode de recherche:");
		lblNewLabel_10_1.setBounds(10, 52, 109, 14);
		panel_6.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Mots cle:");
		lblNewLabel_10_1_1.setBounds(10, 89, 109, 14);
		panel_6.add(lblNewLabel_10_1_1);
		
		JLabel lblNewLabel_11 = new JLabel("Information du produit:");
		lblNewLabel_11.setBounds(72, 150, 113, 14);
		panel_6.add(lblNewLabel_11);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 175, 239, 180);
		panel_6.add(textPane_1);
		
		JButton btnNewButton_4 = new JButton("Chercher");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(72, 114, 89, 23);
		panel_6.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Retirer");
		btnNewButton_5.setBounds(30, 380, 89, 23);
		panel_6.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Modifer");
		btnNewButton_6.setBounds(137, 380, 89, 23);
		panel_6.add(btnNewButton_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(114, 48, 112, 22);
		panel_6.add(comboBox_2);
		
		textField_15 = new JTextField();
		textField_15.setBounds(114, 86, 112, 20);
		panel_6.add(textField_15);
		textField_15.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(230, 230, 250));
		panel_7.setBounds(0, 352, 392, 62);
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("Voir liste des produit");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(64, 11, 238, 40);
		panel_7.add(btnNewButton_7);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Menu des clients", null, tabbedPane_3, null);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(SystemColor.info);
		tabbedPane_3.addTab("Organisation des clients", null, panel_5_1, null);
		panel_5_1.setLayout(null);
		
		JLabel lblNewLabel_9_3 = new JLabel("Nom :");
		lblNewLabel_9_3.setBounds(10, 11, 46, 14);
		panel_5_1.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Prenom:");
		lblNewLabel_9_1_1.setBounds(10, 49, 74, 14);
		panel_5_1.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_9_2_5 = new JLabel("Societer:");
		lblNewLabel_9_2_5.setBounds(10, 88, 74, 14);
		panel_5_1.add(lblNewLabel_9_2_5);
		
		JLabel lblNewLabel_9_2_1_1 = new JLabel("Adress:");
		lblNewLabel_9_2_1_1.setBounds(10, 116, 85, 14);
		panel_5_1.add(lblNewLabel_9_2_1_1);
		
		JLabel lblNewLabel_9_2_2_1 = new JLabel("Ville:");
		lblNewLabel_9_2_2_1.setBounds(10, 153, 95, 14);
		panel_5_1.add(lblNewLabel_9_2_2_1);
		
		JLabel lblNewLabel_9_2_3_2 = new JLabel("Numero :");
		lblNewLabel_9_2_3_2.setBounds(8, 190, 85, 14);
		panel_5_1.add(lblNewLabel_9_2_3_2);
		
		JLabel lblNewLabel_9_2_4_1 = new JLabel("Email:");
		lblNewLabel_9_2_4_1.setBounds(9, 228, 86, 14);
		panel_5_1.add(lblNewLabel_9_2_4_1);
		
		textField_16 = new JTextField();
		textField_16.setBounds(118, 8, 123, 20);
		textField_16.setColumns(10);
		panel_5_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBounds(118, 113, 123, 20);
		textField_17.setColumns(10);
		panel_5_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setBounds(118, 150, 123, 20);
		textField_18.setColumns(10);
		panel_5_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setBounds(118, 187, 123, 20);
		textField_19.setColumns(10);
		panel_5_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setBounds(118, 225, 123, 20);
		textField_20.setColumns(10);
		panel_5_1.add(textField_20);
		
		JButton btnNewButton_3_1 = new JButton("Ajouter");
		btnNewButton_3_1.setBounds(83, 274, 175, 23);
		panel_5_1.add(btnNewButton_3_1);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBackground(UIManager.getColor("Button.light"));
		panel_6_1.setBounds(319, 0, 352, 425);
		panel_5_1.add(panel_6_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Chercher un client:");
		lblNewLabel_10_2.setBounds(117, 11, 109, 14);
		panel_6_1.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_1_2 = new JLabel("Mode de recherche:");
		lblNewLabel_10_1_2.setBounds(10, 52, 109, 14);
		panel_6_1.add(lblNewLabel_10_1_2);
		
		JLabel lblNewLabel_10_1_1_1 = new JLabel("Mots cle:");
		lblNewLabel_10_1_1_1.setBounds(10, 89, 109, 14);
		panel_6_1.add(lblNewLabel_10_1_1_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Cnformation du client:");
		lblNewLabel_11_1.setBounds(117, 151, 113, 14);
		panel_6_1.add(lblNewLabel_11_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setBounds(10, 175, 332, 180);
		panel_6_1.add(textPane_1_1);
		
		JButton btnNewButton_4_1 = new JButton("Chercher");
		btnNewButton_4_1.setBounds(122, 117, 89, 23);
		panel_6_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("Retirer");
		btnNewButton_5_1.setBounds(10, 366, 150, 23);
		panel_6_1.add(btnNewButton_5_1);
		
		JButton btnNewButton_6_1 = new JButton("Modifer");
		btnNewButton_6_1.setBounds(170, 366, 172, 23);
		panel_6_1.add(btnNewButton_6_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(129, 48, 162, 22);
		panel_6_1.add(comboBox_2_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(129, 86, 162, 20);
		panel_6_1.add(textField_22);
		
		JButton btnNewButton_8 = new JButton("Listes de commande du client");
		btnNewButton_8.setBounds(170, 400, 172, 23);
		panel_6_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("creer une commande");
		btnNewButton_9.setBounds(10, 400, 150, 23);
		panel_6_1.add(btnNewButton_9);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBackground(SystemColor.scrollbar);
		panel_7_1.setBounds(0, 326, 321, 99);
		panel_5_1.add(panel_7_1);
		
		JButton btnNewButton_7_1 = new JButton("Voir liste des clients");
		btnNewButton_7_1.setBounds(36, 26, 238, 40);
		panel_7_1.add(btnNewButton_7_1);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(118, 46, 123, 20);
		panel_5_1.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(118, 85, 123, 20);
		panel_5_1.add(textField_38);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Menu de factures", null, tabbedPane_2, null);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_2.addTab("New tab", null, panel_8, null);
		panel_8.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 26, 650, 399);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"haytam", "11/30", new Integer(1000), new Integer(20), new Integer(1020), "   click..."},
				{"nabil", "3/20", new Integer(2000), new Integer(40), new Integer(2040), "   click..."},
				{"miladi", "12/20", new Integer(3000), new Integer(60), new Integer(3060), "   click..."},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"client", "date", "prix hoes taxe", "tva", "prix total", "information"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, Integer.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(98);
		table.getColumnModel().getColumn(1).setMinWidth(27);
		panel_8.add(table);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(654, 0, 17, 425);
		panel_8.add(scrollBar_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 0, 104, 26);
		panel_8.add(panel_9);
		
		JLabel lblNewLabel_16_1 = new JLabel("Client");
		panel_9.add(lblNewLabel_16_1);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setBounds(104, 0, 127, 26);
		panel_8.add(panel_9_1);
		
		JLabel lblNewLabel_17 = new JLabel("Date");
		panel_9_1.add(lblNewLabel_17);
		
		JPanel panel_9_2 = new JPanel();
		panel_9_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9_2.setBackground(Color.WHITE);
		panel_9_2.setBounds(230, 0, 104, 26);
		panel_8.add(panel_9_2);
		
		JLabel lblNewLabel_18 = new JLabel("Prix hors taxes");
		panel_9_2.add(lblNewLabel_18);
		
		JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9_2_1.setBackground(Color.WHITE);
		panel_9_2_1.setBounds(336, 0, 104, 26);
		panel_8.add(panel_9_2_1);
		
		JLabel lblNewLabel_19 = new JLabel("TVA");
		panel_9_2_1.add(lblNewLabel_19);
		
		JPanel panel_9_2_1_1 = new JPanel();
		panel_9_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9_2_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1.setBounds(441, 0, 104, 26);
		panel_8.add(panel_9_2_1_1);
		
		JLabel lblNewLabel_20 = new JLabel("Prix final");
		panel_9_2_1_1.add(lblNewLabel_20);
		
		JPanel panel_9_2_1_1_1 = new JPanel();
		panel_9_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9_2_1_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1_1.setBounds(546, 0, 104, 26);
		panel_8.add(panel_9_2_1_1_1);
		
		JLabel lblNewLabel_15 = new JLabel("Transactions");
		panel_9_2_1_1_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_21 = new JLabel("haytam");
		lblNewLabel_21.setBounds(25, 26, 46, 14);
		panel_8.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setBounds(142, 26, 46, 14);
		panel_8.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setBounds(240, 26, 46, 14);
		panel_8.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setBounds(346, 26, 46, 14);
		panel_8.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setBounds(451, 26, 46, 14);
		panel_8.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("New label");
		lblNewLabel_26.setBounds(556, 26, 46, 14);
		panel_8.add(lblNewLabel_26);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Menu des fournisseurs", null, tabbedPane_4, null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(UIManager.getColor("CheckBox.light"));
		tabbedPane_4.addTab("Enregistrement de fournitures", null, panel_1_1, null);
		panel_1_1.setLayout(null);
		
		textField_21 = new JTextField();
		textField_21.setBounds(108, 11, 148, 20);
		textField_21.setColumns(10);
		panel_1_1.add(textField_21);
		
		JLabel lblNewLabel_12 = new JLabel("Reference:");
		lblNewLabel_12.setBounds(10, 14, 79, 14);
		panel_1_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ref. fournisseur:");
		lblNewLabel_1_1.setBounds(10, 55, 89, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		textField_23 = new JTextField();
		textField_23.setBounds(108, 52, 148, 20);
		textField_23.setColumns(10);
		panel_1_1.add(textField_23);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(367, 34, 261, 186);
		textPane_2.setEditable(false);
		textPane_2.setDropMode(DropMode.ON);
		panel_1_1.add(textPane_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Liste des objet recus par le fournisseur:");
		lblNewLabel_2_1.setBounds(381, 14, 201, 14);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Unite:");
		lblNewLabel_3_1.setBounds(10, 189, 79, 20);
		panel_1_1.add(lblNewLabel_3_1);
		
		textField_24 = new JTextField();
		textField_24.setBounds(108, 189, 148, 20);
		textField_24.setColumns(10);
		panel_1_1.add(textField_24);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(486, 135, 17, 48);
		panel_1_1.add(scrollBar_1);
		
		JButton btnMettreLeSotck = new JButton("Mettre le sotck a jour");
		btnMettreLeSotck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMettreLeSotck.setBounds(367, 249, 261, 23);
		panel_1_1.add(btnMettreLeSotck);
		
		JLabel lblNewLabel_4_1 = new JLabel("Categorie:");
		lblNewLabel_4_1.setBounds(10, 100, 79, 14);
		panel_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Sous categorie :");
		lblNewLabel_5_1.setBounds(10, 143, 89, 14);
		panel_1_1.add(lblNewLabel_5_1);
		
		textField_25 = new JTextField();
		textField_25.setBounds(108, 97, 148, 20);
		textField_25.setColumns(10);
		panel_1_1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setBounds(108, 140, 148, 20);
		textField_26.setColumns(10);
		panel_1_1.add(textField_26);
		
		JButton btnAjouterALa = new JButton("Ajouter a la liste");
		btnAjouterALa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjouterALa.setBounds(77, 253, 148, 23);
		panel_1_1.add(btnAjouterALa);
		
		JLabel lblNewLabel_13 = new JLabel("Prix du lots:");
		lblNewLabel_13.setBounds(10, 232, 79, 14);
		panel_1_1.add(lblNewLabel_13);
		
		textField_28 = new JTextField();
		textField_28.setBounds(108, 229, 148, 20);
		panel_1_1.add(textField_28);
		textField_28.setColumns(10);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(240, 255, 255));
		panel_2_1.setBounds(0, 279, 331, 146);
		panel_1_1.add(panel_2_1);
		
		JLabel lblInformationDeLa_1 = new JLabel("Information sur la transaction:");
		lblInformationDeLa_1.setBounds(92, 5, 146, 14);
		panel_2_1.add(lblInformationDeLa_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Prix hors tax:");
		lblNewLabel_6_2.setBounds(10, 28, 84, 14);
		panel_2_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("TVA:");
		lblNewLabel_7_1.setBounds(10, 53, 68, 14);
		panel_2_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Prix final:");
		lblNewLabel_6_1_1.setBounds(10, 91, 84, 14);
		panel_2_1.add(lblNewLabel_6_1_1);
		
		textField_27 = new JTextField();
		textField_27.setEnabled(false);
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(92, 25, 146, 20);
		panel_2_1.add(textField_27);
		
		textField_29 = new JTextField();
		textField_29.setEnabled(false);
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(92, 53, 146, 20);
		panel_2_1.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setEnabled(false);
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(92, 88, 146, 20);
		panel_2_1.add(textField_30);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(230, 230, 250));
		panel_3_1.setBounds(328, 279, 343, 146);
		panel_1_1.add(panel_3_1);
		
		JButton btnNewButton_1_1 = new JButton("Generer la transaction en pdf");
		btnNewButton_1_1.setBounds(56, 30, 231, 23);
		panel_3_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Imprimer la facture");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(56, 80, 231, 23);
		panel_3_1.add(btnNewButton_2_1);
		
		JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBackground(new Color(216, 191, 216));
		tabbedPane_4.addTab("Organisations des fournisseurs:", null, panel_5_1_1, null);
		
		JLabel lblNewLabel_9_3_1 = new JLabel("nom :");
		lblNewLabel_9_3_1.setBounds(10, 11, 46, 14);
		panel_5_1_1.add(lblNewLabel_9_3_1);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("Prenom:");
		lblNewLabel_9_1_1_1.setBounds(10, 49, 74, 14);
		panel_5_1_1.add(lblNewLabel_9_1_1_1);
		
		JLabel lblNewLabel_9_2_5_1 = new JLabel("Societer:");
		lblNewLabel_9_2_5_1.setBounds(10, 88, 74, 14);
		panel_5_1_1.add(lblNewLabel_9_2_5_1);
		
		JLabel lblNewLabel_9_2_1_1_1 = new JLabel("Adresse:");
		lblNewLabel_9_2_1_1_1.setBounds(10, 116, 85, 14);
		panel_5_1_1.add(lblNewLabel_9_2_1_1_1);
		
		JLabel lblNewLabel_9_2_2_1_1 = new JLabel("Ville:");
		lblNewLabel_9_2_2_1_1.setBounds(10, 153, 95, 14);
		panel_5_1_1.add(lblNewLabel_9_2_2_1_1);
		
		JLabel lblNewLabel_9_2_3_2_1 = new JLabel("Numero:");
		lblNewLabel_9_2_3_2_1.setBounds(8, 190, 85, 14);
		panel_5_1_1.add(lblNewLabel_9_2_3_2_1);
		
		JLabel lblNewLabel_9_2_4_1_1 = new JLabel("Email:");
		lblNewLabel_9_2_4_1_1.setBounds(9, 228, 86, 14);
		panel_5_1_1.add(lblNewLabel_9_2_4_1_1);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(66, 8, 123, 20);
		panel_5_1_1.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(66, 113, 123, 20);
		panel_5_1_1.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(66, 150, 123, 20);
		panel_5_1_1.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(66, 187, 123, 20);
		panel_5_1_1.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(66, 225, 123, 20);
		panel_5_1_1.add(textField_35);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setBounds(66, 45, 123, 22);
		panel_5_1_1.add(comboBox_3_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(66, 84, 123, 22);
		panel_5_1_1.add(comboBox_1_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Ajouter");
		btnNewButton_3_1_1.setBounds(83, 274, 175, 23);
		panel_5_1_1.add(btnNewButton_3_1_1);
		
		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(new Color(245, 222, 179));
		panel_6_1_1.setBounds(412, 0, 259, 425);
		panel_5_1_1.add(panel_6_1_1);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Chercher un fournisseur:");
		lblNewLabel_10_2_1.setBounds(76, 11, 150, 14);
		panel_6_1_1.add(lblNewLabel_10_2_1);
		
		JLabel lblNewLabel_10_1_2_1 = new JLabel("Mode de recherche:");
		lblNewLabel_10_1_2_1.setBounds(10, 52, 109, 14);
		panel_6_1_1.add(lblNewLabel_10_1_2_1);
		
		JLabel lblNewLabel_10_1_1_1_1 = new JLabel("Mots cle:");
		lblNewLabel_10_1_1_1_1.setBounds(10, 89, 109, 14);
		panel_6_1_1.add(lblNewLabel_10_1_1_1_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Information du fournisseur:");
		lblNewLabel_11_1_1.setBounds(72, 150, 154, 14);
		panel_6_1_1.add(lblNewLabel_11_1_1);
		
		JTextPane textPane_1_1_1 = new JTextPane();
		textPane_1_1_1.setBounds(10, 175, 239, 180);
		panel_6_1_1.add(textPane_1_1_1);
		
		JButton btnNewButton_4_1_1 = new JButton("Chercher");
		btnNewButton_4_1_1.setBounds(72, 114, 89, 23);
		panel_6_1_1.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_5_1_1 = new JButton("Retirer");
		btnNewButton_5_1_1.setBounds(20, 366, 89, 23);
		panel_6_1_1.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_6_1_1 = new JButton("Modifer");
		btnNewButton_6_1_1.setBounds(137, 366, 89, 23);
		panel_6_1_1.add(btnNewButton_6_1_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setBounds(114, 48, 112, 22);
		panel_6_1_1.add(comboBox_2_1_1);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(114, 86, 112, 20);
		panel_6_1_1.add(textField_36);
		
		JButton btnNewButton_8_1 = new JButton("Historique des commandes du fournisseur");
		btnNewButton_8_1.setBounds(0, 400, 259, 23);
		panel_6_1_1.add(btnNewButton_8_1);
		
		JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBackground(new Color(224, 255, 255));
		panel_7_1_1.setBounds(0, 326, 414, 99);
		panel_5_1_1.add(panel_7_1_1);
		
		JButton btnNewButton_7_1_1 = new JButton("Voir liste des fournisseurs:");
		btnNewButton_7_1_1.setBounds(69, 26, 238, 40);
		panel_7_1_1.add(btnNewButton_7_1_1);
		
		JLabel lblNewLabel_14 = new JLabel("Observations:");
		lblNewLabel_14.setBounds(270, 24, 74, 14);
		panel_5_1_1.add(lblNewLabel_14);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(225, 49, 177, 180);
		panel_5_1_1.add(textPane_3);
		
		
	}
}
