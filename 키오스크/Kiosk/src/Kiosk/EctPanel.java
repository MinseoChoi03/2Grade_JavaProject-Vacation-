package Kiosk;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EctPanel extends JPanel {
	private JButton flower1, flower2, flower3, flower4;
	
	public EctPanel() {
		setVisible(true);
		setBounds(0, 0, 500, 510);
		
		flower1 = new JButton();
		flower1.setBounds(12, 10, 220, 220);	
		flower1.setBorderPainted(false);
		flower1.setContentAreaFilled(false);
		flower1.setFocusPainted(false);
		flower1.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet8.png")));
		flower1.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower1.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/bouquet8E.png")));
				flower1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower1.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet8.png")));
				flower1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		setLayout(null);
		add(flower1);
		
		flower2 = new JButton();
		flower2.setBounds(268, 10, 220, 220);	
		flower2.setBorderPainted(false);
		flower2.setContentAreaFilled(false);
		flower2.setFocusPainted(false);
		flower2.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet9.png")));
		flower2.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower2.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/bouquet9E.png")));
				flower2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower2.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet9.png")));
				flower2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		add(flower2);
		
		flower3 = new JButton();
		flower3.setBounds(12, 255, 220, 225);	
		flower3.setBorderPainted(false);
		flower3.setContentAreaFilled(false);
		flower3.setFocusPainted(false);
		flower3.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet10.png")));
		flower3.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower3.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/bouquet10E.png")));
				flower3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower3.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet10.png")));
				flower3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		add(flower3);
		
		flower4 = new JButton();
		flower4.setBounds(268, 255, 220, 225);	
		flower4.setBorderPainted(false);
		flower4.setContentAreaFilled(false);
		flower4.setFocusPainted(false);
		flower4.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet11.png")));
		flower4.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower4.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/bouquet11E.png")));
				flower4.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower4.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet11.png")));
				flower4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		add(flower4);
	}
}
