import java.awt.*;
import java.awt.event.*;

class gui extends Frame{
	class wl extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent arg0) {
			dispose();
		}		
	}
	class A implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1= t1.getText();
				String s2= t2.getText();
				int n1= Integer.parseInt(s1);
				int n2= Integer.parseInt(s2);
				int n=n1+n2;
				l4.setText(String.valueOf(n));
			}catch(Exception ex) {
				l4.setText("Wrong input");
			}
			
		}
		
	}
	class B implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1= t1.getText();
				String s2= t2.getText();
				int n1= Integer.parseInt(s1);
				int n2= Integer.parseInt(s2);
				int n=n1-n2;
				l4.setText(String.valueOf(n));
			}catch(Exception ex) {
				l4.setText("Wrong input");
			}
			
		}
		
	}
	class C implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1= t1.getText();
				String s2= t2.getText();
				int n1= Integer.parseInt(s1);
				int n2= Integer.parseInt(s2);
				int n=n1*n2;
				l4.setText(String.valueOf(n));
			}catch(Exception ex) {
				l4.setText("Wrong input");
			}
			
		}
		
	}
	class D implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1= t1.getText();
				String s2= t2.getText();
				int n1= Integer.parseInt(s1);
				int n2= Integer.parseInt(s2);
				int n=n1/n2;
				l4.setText(String.valueOf(n));
			}catch(Exception ex) {
				l4.setText("Wrong input");
			}
			
		}
		
	}
	class E implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1= t1.getText();
				String s2= t2.getText();
				int n1= Integer.parseInt(s1);
				int n2= Integer.parseInt(s2);
				int n=n1%n2;
				l4.setText(String.valueOf(n));
			}catch(Exception ex) {
				l4.setText("Wrong input");
			}
			
		}
		
	}
	Button a= new Button("+");
	Button s= new Button("-");
	Button d= new Button("/");
	Button m= new Button("*");
	Button mod= new Button("%");
	TextField t1= new TextField();
	TextField t2= new TextField();
	Label l1= new Label("1st Number");
	Label l2= new Label("2nd Number");
	Label l3= new Label("Answer :");
	Label l4= new Label("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	gui(){
		setLayout(null);
		setSize(400, 280);
		setTitle("MiniCalci");
		setBackground(Color.LIGHT_GRAY);
		a.setBounds(75, 170, 30, 30);
		a.addActionListener(new A());
		add(a);
		s.setBounds(130, 170, 30, 30);
		s.addActionListener(new B());
		add(s);
		m.setBounds(185, 170, 30, 30);
		m.addActionListener(new C());
		add(m);
		d.setBounds(240, 170, 30, 30);
		d.addActionListener(new D());
		add(d);
		mod.setBounds(295, 170, 30, 30);
		mod.addActionListener(new E());
		add(mod);
		t1.setBounds(160, 50, 200, 30);
		add(t1);
		t2.setBounds(160, 110, 200, 30);
		add(t2);
		l1.setBounds(50, 50, 100, 30);
		add(l1);
		l2.setBounds(50, 110, 100, 30);
		add(l2);
		l3.setBounds(50, 230, 100, 30);
		add(l3);
		l4.setBounds(160, 230, 200, 30);
		add(l4);
		addWindowListener(new wl());
	}

}
public class MiniCalci{
	public static void main(String[] args) {
		gui g= new gui();
		g.setVisible(true);
	}
		
}