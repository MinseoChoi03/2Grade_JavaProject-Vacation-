package Kiosk;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Toolkit;

public class Screen extends JFrame {

	private JPanel MainPanel = new JPanel();
	private JPanel BtnPanel = new JPanel();
	
	private JPanel SchoolPanel = new JPanel();
	private JPanel CongPanel = new JPanel();
	private JPanel LovePanel = new JPanel();
	private JPanel HospitalPanel = new JPanel();
	private JPanel EctPanel = new JPanel();
	
	private JButton screenBtn;
	protected JButton schoolBtn, congBtn, loveBtn, hospitalBtn, ectBtn, paymentBtn;
	
	public Screen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Screen.class.getResource("/Btn/flower.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Love Flower");
		MainPanel.setBounds(0, 0, 746, 622);
		MainPanel.setBackground(new Color(250, 250, 250));
		
		screenBtn = new JButton();
		screenBtn.setBounds(0, 0, 746, 615);	
		screenBtn.setBorderPainted(false);
		screenBtn.setContentAreaFilled(false);
		screenBtn.setFocusPainted(false);
		screenBtn.setIcon(new ImageIcon(Screen.class.getResource("../Btn/ScreenBtn.png")));
		screenBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				screenBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				screenBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					screenBtn.setVisible(false);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		MainPanel.setLayout(null);
		MainPanel.add(screenBtn);
		
		
		SchoolPanel.setLayout(null);
		SchoolPanel = new SchoolPanel();
		SchoolPanel.setBounds(220, 28, 500, 510);
		MainPanel.add(SchoolPanel);
		
		CongPanel.setLayout(null);
		CongPanel = new CongPanel();
		CongPanel.setBounds(220, 28, 500, 510);
		CongPanel.setVisible(false);
		MainPanel.add(CongPanel);
		
		LovePanel.setLayout(null);
		LovePanel = new LovePanel();
		LovePanel.setBounds(220, 28, 500, 510);
		LovePanel.setVisible(false);
		MainPanel.add(LovePanel);
		
		HospitalPanel.setLayout(null);
		HospitalPanel = new HospitalPanel();
		HospitalPanel.setBounds(220, 28, 500, 510);
		HospitalPanel.setVisible(false);
		MainPanel.add(HospitalPanel);
		
		EctPanel.setLayout(null);
		EctPanel = new EctPanel();
		EctPanel.setBounds(220, 28, 500, 510);
		EctPanel.setVisible(false);
		MainPanel.add(EctPanel);
		
		schoolBtn = new JButton();
		schoolBtn.setBounds(12, 28, 180, 100);
		schoolBtn.setBorderPainted(false);
		schoolBtn.setContentAreaFilled(false);
		schoolBtn.setFocusPainted(false);
		schoolBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/schoolBtn.png")));
		schoolBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				schoolBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/schoolBtnE.png")));
				schoolBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				schoolBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/schoolBtn.png")));
				schoolBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					SchoolPanel.setVisible(true);
					CongPanel.setVisible(false);
					LovePanel.setVisible(false);
					HospitalPanel.setVisible(false);
					EctPanel.setVisible(false);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		MainPanel.add(schoolBtn);
		
		congBtn = new JButton();
		congBtn.setBounds(12, 139, 180, 100);	
		congBtn.setBorderPainted(false);
		congBtn.setContentAreaFilled(false);
		congBtn.setFocusPainted(false);
		congBtn.setIcon(new ImageIcon(Screen.class.getResource("/Btn/congBtn.png")));
		congBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				congBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/congBtnE.png")));
				congBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				congBtn.setIcon(new ImageIcon(Screen.class.getResource("/Btn/congBtn.png")));
				congBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					SchoolPanel.setVisible(false);
					CongPanel.setVisible(true);
					LovePanel.setVisible(false);
					HospitalPanel.setVisible(false);
					EctPanel.setVisible(false);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		MainPanel.add(congBtn);
		
		loveBtn = new JButton();
		loveBtn.setBounds(12, 249, 180, 100);	
		loveBtn.setBorderPainted(false);
		loveBtn.setContentAreaFilled(false);
		loveBtn.setFocusPainted(false);
		loveBtn.setIcon(new ImageIcon(Screen.class.getResource("/Btn/loveBtn.png")));
		loveBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				loveBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/loveBtnE.png")));
				loveBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				loveBtn.setIcon(new ImageIcon(Screen.class.getResource("/Btn/loveBtn.png")));
				loveBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					SchoolPanel.setVisible(false);
					CongPanel.setVisible(false);
					LovePanel.setVisible(true);
					HospitalPanel.setVisible(false);
					EctPanel.setVisible(false);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		MainPanel.add(loveBtn);
		
		hospitalBtn = new JButton();
		hospitalBtn.setBounds(12, 359, 180, 100);	
		hospitalBtn.setBorderPainted(false);
		hospitalBtn.setContentAreaFilled(false);
		hospitalBtn.setFocusPainted(false);
		hospitalBtn.setIcon(new ImageIcon(Screen.class.getResource("/Btn/hospitalBtn.png")));
		hospitalBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				hospitalBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/hospitalBtnE.png")));
				hospitalBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				hospitalBtn.setIcon(new ImageIcon(Screen.class.getResource("/Btn/hospitalBtn.png")));
				hospitalBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					SchoolPanel.setVisible(false);
					CongPanel.setVisible(false);
					LovePanel.setVisible(false);
					HospitalPanel.setVisible(true);
					EctPanel.setVisible(false);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		MainPanel.add(hospitalBtn);
		
		ectBtn = new JButton();
		ectBtn.setBounds(12, 469, 180, 100);	
		ectBtn.setBorderPainted(false);
		ectBtn.setContentAreaFilled(false);
		ectBtn.setFocusPainted(false);
		ectBtn.setIcon(new ImageIcon(Screen.class.getResource("/Btn/ectBtn.png")));
		ectBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				ectBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/ectBtnE.png")));
				ectBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				ectBtn.setIcon(new ImageIcon(Screen.class.getResource("/Btn/ectBtn.png")));
				ectBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					SchoolPanel.setVisible(false);
					CongPanel.setVisible(false);
					LovePanel.setVisible(false);
					HospitalPanel.setVisible(false);
					EctPanel.setVisible(true);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		MainPanel.add(ectBtn);
		
		paymentBtn = new JButton();
		paymentBtn.setBounds(540, 548, 180, 55);	
		paymentBtn.setBorderPainted(false);
		paymentBtn.setContentAreaFilled(false);
		paymentBtn.setFocusPainted(false);
		paymentBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/paymentBtn.png")));
		paymentBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				paymentBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/paymentBtnE.png")));
				paymentBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				paymentBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/paymentBtn.png")));
				paymentBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					new PaymentScreen();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		MainPanel.add(paymentBtn);
		
		
		add(MainPanel);
		setBounds(450, 70, 750, 650);
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}
}
