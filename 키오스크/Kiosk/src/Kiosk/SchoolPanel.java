package Kiosk;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SchoolPanel extends JPanel {
	private JButton flower1, flower2, flower3, flower4, flower5;

	public SchoolPanel() {		
		setVisible(true);
		setBounds(0, 0, 500, 510);
		
		flower1 = new JButton();
		flower1.setBounds(12, 10, 220, 220);	
		flower1.setBorderPainted(false);
		flower1.setContentAreaFilled(false);
		flower1.setFocusPainted(false);
		flower1.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet1.png")));
		flower1.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower1.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/bouquet1E.png")));
				flower1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower1.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet1.png")));
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
		flower2.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet2.png")));
		flower2.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower2.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/bouquet2E.png")));
				flower2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower2.setIcon(new ImageIcon(getClass().getResource("../flower/bouquet2.png")));
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
		flower3.setBounds(12, 255, 140, 225);	
		flower3.setBorderPainted(false);
		flower3.setContentAreaFilled(false);
		flower3.setFocusPainted(false);
		flower3.setIcon(new ImageIcon(getClass().getResource("../flower/freesia.png")));
		flower3.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower3.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/freesiaE.png")));
				flower3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower3.setIcon(new ImageIcon(getClass().getResource("../flower/freesia.png")));
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
		flower4.setBounds(181, 255, 140, 225);	
		flower4.setBorderPainted(false);
		flower4.setContentAreaFilled(false);
		flower4.setFocusPainted(false);
		flower4.setIcon(new ImageIcon(getClass().getResource("../flower/gypsophila.png")));
		flower4.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower4.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/gypsophilaE.png")));
				flower4.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower4.setIcon(new ImageIcon(getClass().getResource("../flower/gypsophila.png")));
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
		
		flower5 = new JButton();
		flower5.setBounds(348, 255, 140, 225);	
		flower5.setBorderPainted(false);
		flower5.setContentAreaFilled(false);
		flower5.setFocusPainted(false);
		flower5.setIcon(new ImageIcon(getClass().getResource("../flower/cotton.png")));
		flower5.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				flower5.setIcon(new ImageIcon(getClass().getResource("../flowerBtn/cottonE.png")));
				flower5.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				flower5.setIcon(new ImageIcon(getClass().getResource("../flower/cotton.png")));
				flower5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		add(flower5);
	}

}
