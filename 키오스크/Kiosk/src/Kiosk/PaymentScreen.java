package Kiosk;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PaymentScreen extends JFrame {

	private JPanel Panel = new JPanel();
	private JPanel ViewPanel = new JPanel();

	private JButton couponBtn = new JButton();
	private JButton cardBtn = new JButton();
	
	public PaymentScreen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Screen.class.getResource("/Btn/flower.png")));
		setTitle("����");
		setBounds(510, 200, 650, 350);
		Panel.setBackground(new Color(250, 250, 250));
		Panel.setLayout(null);
		
		ViewPanel.setLayout(null);
		ViewPanel.setBounds(5, 5, 620, 220);
		Panel.add(ViewPanel);
		
		
		couponBtn.setBounds(70, 240, 180, 60);
		couponBtn.setBorderPainted(false);
		couponBtn.setContentAreaFilled(false);
		couponBtn.setFocusPainted(false);
		couponBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/couponBtn.png")));
		couponBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				couponBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/couponBtnE.png")));
				couponBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				couponBtn.setIcon(new ImageIcon(Screen.class.getResource("../Btn/couponBtn.png")));
				couponBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
						JOptionPane.showMessageDialog(null, "������ Ȯ���ϰ� �ֽ��ϴ�...","PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
						Thread.sleep(3000);
						JOptionPane.showMessageDialog(null, "������ ���Ǿ����ϴ�!","PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
						
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		Panel.add(couponBtn);
		
		cardBtn.setBounds(400, 240, 180, 60);
		cardBtn.setBorderPainted(false);
		cardBtn.setContentAreaFilled(false);
		cardBtn.setFocusPainted(false);
		cardBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/cardBtn.png")));
		cardBtn.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cardBtn.setIcon(new ImageIcon(getClass().getResource("../Btn/cardBtnE.png")));
				cardBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				cardBtn.setIcon(new ImageIcon(Screen.class.getResource("../Btn/cardBtn.png")));
				cardBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					JOptionPane.showMessageDialog(null, "ī���� Ȯ���ϰ� �ֽ��ϴ�...","PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
					Thread.sleep(3000);
					JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�!","PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		Panel.add(cardBtn);
		
		getContentPane().add(Panel);
		setResizable(false);
		setVisible(true);
	}
}
