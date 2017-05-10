package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField txtProdajniKurs;
	private JTextField txtKupovniKurs;
	private JLabel lblValuta;
	private JComboBox<String> comboBox;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JTextField txtIznos;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IzvrsiZamenuGUI.class.getResource("/icon/money.png")));
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 385, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTxtProdajniKurs());
		contentPane.add(getTxtKupovniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getTxtIznos());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		setContentPane(contentPane);
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(5, 11, 132, 23);
		}
		return lblProdajniKurs;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(222, 11, 132, 23);
		}
		return lblKupovniKurs;
	}

	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setEditable(false);
			txtProdajniKurs.setColumns(10);
			txtProdajniKurs.setBounds(5, 45, 132, 23);
		}
		return txtProdajniKurs;
	}

	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setEditable(false);
			txtKupovniKurs.setColumns(10);
			txtKupovniKurs.setBounds(222, 45, 132, 23);
		}
		return txtKupovniKurs;
	}

	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(147, 12, 56, 21);
		}
		return lblValuta;
	}

	private JComboBox<String> getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox<String>();
			comboBox.setBounds(147, 46, 56, 21);
			comboBox.addItem(new String("EUR"));
			comboBox.addItem(new String("USD"));
			comboBox.addItem(new String("CHF"));
		}
		return comboBox;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setPreferredSize(new Dimension(80, 14));
			lblIznos.setBounds(5, 94, 132, 23);
		}
		return lblIznos;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(214, 98, 116, 21);
		}
		return lblVrstaTransakcije;
	}

	private JTextField getTxtIznos() {
		if (txtIznos == null) {
			txtIznos = new JTextField();
			txtIznos.setBounds(5, 128, 171, 23);
			txtIznos.setColumns(10);
		}
		return txtIznos;
	}

	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setSelected(true);
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(214, 126, 109, 23);
		}
		return rdbtnKupovina;
	}

	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(214, 152, 109, 23);
		}
		return rdbtnProdaja;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					txtIznos.setText(String.valueOf(slider.getValue()));
				}
			});

			slider.setBounds(0, 180, 370, 45);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
		}
		return slider;
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
			btnOdustani.setBounds(198, 229, 156, 30);
		}
		return btnOdustani;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String text = "";
					try {
						text += "Valuta: " + comboBox.getSelectedItem() + " Iznos: " + txtIznos.getText()
								+ " Vrsta transakcije: ";
						if (rdbtnKupovina.isSelected()) {
							text += rdbtnKupovina.getText() + "\n";
						} else {
							text += rdbtnProdaja.getText() + "\n";
						}
						MenjacnicaGUI.dodajPodatkeOKursu(text);
					} catch (Exception e) {
						System.out.println("Greska: " + e.getMessage());
					}
				}
			});
			btnIzvrsiZamenu.setBounds(10, 229, 150, 32);
		}
		return btnIzvrsiZamenu;
	}
}
