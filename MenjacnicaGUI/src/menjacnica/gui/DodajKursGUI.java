package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField txtSifra;
	private JTextField txtNaziv;
	private JTextField txtSrednjiKurs;
	private JTextField txtProdajniKurs;
	private JTextField txtKupovniKurs;
	private JTextField txtSkraceniKurs;
	private JButton btnOdustani;
	private JButton btnDodaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodajKursGUI.class.getResource("/icon/money.png")));
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 359, 239);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(200, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTxtSifra());
		contentPane.add(getTxtNaziv());
		contentPane.add(getTxtProdajniKurs());
		contentPane.add(getTxtKupovniKurs());
		contentPane.add(getTxtSrednjiKurs());
		contentPane.add(getTxtSkraceniKurs());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		setContentPane(contentPane);
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(5, 11, 164, 23);
		}
		return lblSifra;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(179, 11, 164, 23);
		}
		return lblNaziv;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(5, 122, 164, 23);
		}
		return lblSrednjiKurs;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(179, 122, 164, 23);
		}
		return lblSkraceniNaziv;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(5, 69, 164, 23);
		}
		return lblProdajniKurs;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(179, 69, 164, 23);
		}
		return lblKupovniKurs;
	}

	private JTextField getTxtSifra() {
		if (txtSifra == null) {
			txtSifra = new JTextField();
			txtSifra.setBounds(5, 35, 164, 23);
			txtSifra.setColumns(10);
		}
		return txtSifra;
	}

	private JTextField getTxtNaziv() {
		if (txtNaziv == null) {
			txtNaziv = new JTextField();
			txtNaziv.setColumns(10);
			txtNaziv.setBounds(179, 35, 164, 23);
		}
		return txtNaziv;
	}

	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setColumns(10);
			txtProdajniKurs.setBounds(5, 88, 164, 23);
		}
		return txtProdajniKurs;
	}

	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setColumns(10);
			txtKupovniKurs.setBounds(179, 88, 164, 23);
		}
		return txtKupovniKurs;
	}

	private JTextField getTxtSrednjiKurs() {
		if (txtSrednjiKurs == null) {
			txtSrednjiKurs = new JTextField();
			txtSrednjiKurs.setColumns(10);
			txtSrednjiKurs.setBounds(5, 145, 164, 23);
		}
		return txtSrednjiKurs;
	}

	private JTextField getTxtSkraceniKurs() {
		if (txtSkraceniKurs == null) {
			txtSkraceniKurs = new JTextField();
			txtSkraceniKurs.setColumns(10);
			txtSkraceniKurs.setBounds(179, 145, 164, 23);
		}
		return txtSkraceniKurs;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String text = "";
					try {
						text += "Sifra: " + txtSifra.getText() + " Naziv: " + txtNaziv.getText() + " Prodajni kurs: "
								+ txtProdajniKurs.getText() + " Kupovni kurs: " + txtKupovniKurs.getText()
								+ " Srednji kurs: " + txtSrednjiKurs.getText() + " Naziv: " + txtNaziv.getText() + "\n";
						MenjacnicaGUI.dodajPodatkeOKursu(text);
					} catch (Exception e) {
						System.out.println("Greska: " + e.getMessage());
					}
				}
			});

			btnDodaj.setBounds(5, 179, 164, 23);
		}
		return btnDodaj;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setPreferredSize(new Dimension(20, 23));
			btnOdustani.setBounds(179, 179, 164, 23);
		}
		return btnOdustani;
	}
}
