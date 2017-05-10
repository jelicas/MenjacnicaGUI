package menjacnica.gui;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ObrisiKursGUI extends JFrame {

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
	private JButton btnObrisi;
	private JCheckBox chckbxZaistaObrisiKurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/icon/money.png")));
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 354, 261);
		contentPane = new JPanel();
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
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getCheckboxZaistaObrisiKurs());
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
			txtSifra.setEditable(false);
			txtSifra.setBounds(5, 35, 164, 23);
			txtSifra.setColumns(10);
		}
		return txtSifra;
	}

	private JTextField getTxtNaziv() {
		if (txtNaziv == null) {
			txtNaziv = new JTextField();
			txtNaziv.setEditable(false);
			txtNaziv.setBounds(179, 35, 164, 23);
			txtNaziv.setColumns(10);
		}
		return txtNaziv;
	}

	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setEditable(false);
			txtProdajniKurs.setBounds(5, 88, 164, 23);
			txtProdajniKurs.setColumns(10);
		}
		return txtProdajniKurs;
	}

	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setEditable(false);
			txtKupovniKurs.setBounds(179, 88, 164, 23);
			txtKupovniKurs.setColumns(10);
		}
		return txtKupovniKurs;
	}

	private JTextField getTxtSrednjiKurs() {
		if (txtSrednjiKurs == null) {
			txtSrednjiKurs = new JTextField();
			txtSrednjiKurs.setEditable(false);
			txtSrednjiKurs.setBounds(5, 145, 164, 23);
			txtSrednjiKurs.setColumns(10);
		}
		return txtSrednjiKurs;
	}

	private JTextField getTxtSkraceniKurs() {
		if (txtSkraceniKurs == null) {
			txtSkraceniKurs = new JTextField();
			txtSkraceniKurs.setEditable(false);
			txtSkraceniKurs.setBounds(179, 145, 164, 23);
			txtSkraceniKurs.setColumns(10);
		}
		return txtSkraceniKurs;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
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
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(5, 198, 164, 23);
		}
		return btnObrisi;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setBounds(179, 198, 164, 23);
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setPreferredSize(new Dimension(20, 23));
		}
		return btnOdustani;
	}

	private JCheckBox getCheckboxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (chckbxZaistaObrisiKurs.isSelected()) {
						btnObrisi.setEnabled(true);
					} else {
						btnObrisi.setEnabled(false);
					}
				}
			});
			chckbxZaistaObrisiKurs.setBounds(5, 168, 164, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
}
