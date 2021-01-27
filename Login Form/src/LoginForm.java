import java.awt.*;
import java.awt.event.*;

class GUI extends Frame{
	Panel p;
	Label l1,l2,l3;
	TextField t1,t2;
	Button b;
	
	class wl extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent arg0) {
			dispose();
		}		
	}
	class A implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s1= t1.getText();
			String s2= t2.getText();
			
			if(s1 == "INCAPP") {
				if(s2 == "INDIA") {
					l3.setText("Login Successful");
				}
			}
			else {
				l3.setText("Wrong Input");
			}
		}
		
	}
	GUI(){
		
		setLayout(null);
		setTitle("Login Form");
		setSize(400,300);
		setBackground(Color.GRAY);
		addWindowListener(new wl());
		
		p=new Panel();
		p.setLayout(null);
		p.setBounds(50, 80, 300, 150);
		p.setBackground(Color.LIGHT_GRAY);
		add(p);
		
		l1= new Label("User ID :");
		l1.setBounds(20, 15, 100, 30);
		l1.setForeground(Color.WHITE);
		p.add(l1);
		
		l2= new Label("Password :");
		l2.setBounds(20, 60, 100, 30);
		l2.setForeground(Color.WHITE);
		p.add(l2);
		
		l3= new Label("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		l3.setBounds(100, 250, 200, 30);
		l3.setForeground(Color.CYAN);
		add(l3);
		
		t1= new TextField();
		t1.setBounds(140, 15, 140, 30);
		p.add(t1);
		
		t2= new TextField();
		t2.setBounds(140, 60, 140, 30);
		p.add(t2);
		
		b= new Button("Login");
		b.setBounds(100, 105, 100, 30);
		b.setForeground(Color.BLUE);
		b.addActionListener(new A());
		p.add(b);
		
	}
}
public class LoginForm {

	public static void main(String[] args) {
		GUI g= new GUI();
		g.setVisible(true);

	}

}
