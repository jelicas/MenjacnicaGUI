package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

import menjacnica.modeli.MenjacnicaTableModel;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import java.io.File;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panelEast;
	private JPanel panelCenter;
	private JPanel panelSouth;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamenu;
	private JScrollPane scrollPane1;
	private JTable table;
	private JScrollPane scrollPane2;
	private static JTextArea textArea;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;
	private JPopupMenu popupMenu;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;

	public static MenjacnicaGUI frame = new MenjacnicaGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		setBackground(Color.LIGHT_GRAY);
		setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icon/money.png")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBarr());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanelEast(), BorderLayout.EAST);
		contentPane.add(getPanelCenter(), BorderLayout.CENTER);
		contentPane.add(getPanelSouth(), BorderLayout.SOUTH);

	}

	private JPanel getPanelEast() {
		if (panelEast == null) {
			panelEast = new JPanel();
			panelEast.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelEast.add(getBtnDodajKurs());
			panelEast.setPreferredSize(new Dimension(140, 0));
			panelEast.add(getBtnObrisiKurs());
			panelEast.add(getBtnIzvrsiZamenu());
		}
		return panelEast;
	}

	private JPanel getPanelCenter() {
		if (panelCenter == null) {
			panelCenter = new JPanel();
			panelCenter.setBackground(java.awt.Color.WHITE);
			panelCenter.setLayout(new BorderLayout(0, 0));
			panelCenter.add(getScrollPane1(), BorderLayout.CENTER);
		}
		return panelCenter;
	}

	private JPanel getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanel();
			panelSouth.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelSouth.setPreferredSize(new Dimension(0, 80));
			panelSouth.setLayout(new BorderLayout(0, 0));
			panelSouth.add(getScrollPane2(), BorderLayout.CENTER);
		}
		return panelSouth;
	}

	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dodaj = new DodajKursGUI();
					dodaj.setVisible(true);
					dodaj.setLocationRelativeTo(null);
				}
			});
			btnDodajKurs.setPreferredSize(new Dimension(120, 30));
		}
		return btnDodajKurs;
	}

	private JButton getBtnObrisiKurs() {

		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
			btnObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI obrisi = new ObrisiKursGUI();
					obrisi.setVisible(true);
					obrisi.setLocationRelativeTo(null);
				}
			});
			btnObrisiKurs.setPreferredSize(new Dimension(120, 30));
		}
		return btnObrisiKurs;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.setPreferredSize(new Dimension(120, 30));
		}
		return btnIzvrsiZamenu;
	}

	private JScrollPane getScrollPane1() {
		if (scrollPane1 == null) {
			scrollPane1 = new JScrollPane();
			scrollPane1.setViewportView(getTable());
		}
		return scrollPane1;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new MenjacnicaTableModel());
			table.add(getPopupMenu());
		}
		return table;
	}

	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}

	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dodaj = new DodajKursGUI();
					dodaj.setVisible(true);
					dodaj.setLocationRelativeTo(null);
				}
			});
		}
		return mntmDodajKurs;
	}

	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
			mntmObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI obrisi = new ObrisiKursGUI();
					obrisi.setVisible(true);
					obrisi.setLocationRelativeTo(null);
				}
			});
		}
		return mntmObrisiKurs;
	}

	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
		}
		return mntmIzvrsiZamenu;
	}

	private JScrollPane getScrollPane2() {
		if (scrollPane2 == null) {
			scrollPane2 = new JScrollPane();
			scrollPane2.setViewportView(getTextArea());
		}
		return scrollPane2;
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
		}
		return textArea;
	}

	private JMenuBar getMenuBarr() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}

	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}

	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}

	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String file = "";
					try {
						JFileChooser fc = new JFileChooser();
						int odg = fc.showOpenDialog(frame);
						if (odg == JFileChooser.APPROVE_OPTION) {
							File fajl = fc.getSelectedFile();
							file = fajl.getAbsolutePath();
							textArea.setText(textArea.getText() + "Ucitan fajl: " + file + "\n");
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(frame, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
			mntmOpen.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));

		}
		return mntmOpen;
	}

	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String file = "";
					try {
						JFileChooser fc = new JFileChooser();
						int odg = fc.showOpenDialog(frame);
						if (odg == JFileChooser.APPROVE_OPTION) {
							File fajl = fc.getSelectedFile();
							file = fajl.getAbsolutePath();
							textArea.setText(textArea.getText() + "Sacuvan fajl: " + file + "\n");
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(frame, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			mntmSave.setIcon(
					new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}

	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ugasiAplikaciju();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}

	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(frame, "Cao, ja sam Jelica!");
				}
			});
			mntmAbout.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/motif/icons/Question.gif")));
		}
		return mntmAbout;
	}

	public void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(frame, "Da li zelite da zatvorite program?", "Zatvaranje aplikacije",
				JOptionPane.YES_NO_CANCEL_OPTION);
		if (opcija == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public static void dodajPodatkeOKursu(String text) {
		textArea.setText(textArea.getText() + text);
	}
}
