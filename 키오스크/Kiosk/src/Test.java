import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame implements ActionListener{
	JPanel p1, p2;
	JButton yes, no;
	JLabel answer;
	public Test() {
		super("버튼 이벤트");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		yes = new JButton("Yes");
		no = new JButton("No");
		answer = new JLabel("당신이 선택한 버튼 :");
		
		p1.add(yes);
		p1.add(no);
		p2.add(answer);
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
		
		yes.addActionListener(this);
		no.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(yes)) {
			answer.setText("당신이 선택한 버튼 :  Yes");
		}
		else if(e.getSource().equals(no)) {
			answer.setText("당신이 선택한 버튼 :  No");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}	
}
