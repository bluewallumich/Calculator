import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
/**
 * 
 * 
 * @author awnet
 * 
 *Simple calc project.  Took the whole day.  Found Window builder.  Could have cut time in half by
 *double clicking on the actual buttons in the window builder.  This initiates the ActionCode
 *or other code.
 *
 *
 *Prog breaks when equal sign is hit after initial calculation. 
 *Will init Exception handling in the future.
 *Will need to beable to use enter in the future.
 *upload to Git for future android project.  Just figured out that Git is possible VCS.
 */
public class CSProj2a extends JFrame implements ActionListener {
	public JTextField txt;
	int fstNm;
	int scndNm;
	int result;
	String math;
//Make more comments.  For example, what did you do in the very next line...  Chapter 8 - 9
	public CSProj2a() {
		getContentPane().setMinimumSize(new Dimension(500, 750));
		getContentPane().setMaximumSize(new Dimension(1000, 1000));

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setMinimumSize(new Dimension(500, 750));
		layeredPane.setMaximumSize(new Dimension(500, 750));
		getContentPane().add(layeredPane, BorderLayout.CENTER);

// I realized by the 5th - 6th button what I was actually typing and a small joke is not what I originally attempted.
//but i honestly have been sitting here all day with small breaks in between.
// Didn't go back to save time and kept going to avoid confusion.
		
		
		//Create buttons and give the buttons ears.  Add event/action once clicked.  Figure out
		//why some programers use evt and why some use action.
		JButton numButt1 = new JButton("1");
		numButt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numButt1.getText();
				txt.setText(number);
			}
		});
		numButt1.setBounds(20, 482, 89, 23);
		layeredPane.add(numButt1);

		JButton numButt2 = new JButton("2");
		numButt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numButt2.getText();
				txt.setText(number);
			}
		});
		numButt2.setBounds(115, 482, 89, 23);
		layeredPane.add(numButt2);

		JButton numButt3 = new JButton("3");
		numButt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numButt3.getText();
				txt.setText(number);
			}
		});
		numButt3.setBounds(209, 482, 89, 23);
		layeredPane.add(numButt3);

		JButton numButt4 = new JButton("4");
		numButt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numButt4.getText();
				txt.setText(number);
			}
		});
		numButt4.setBounds(21, 448, 89, 23);
		layeredPane.add(numButt4);

		JButton numButt5 = new JButton("5");
		numButt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numButt5.getText();
				txt.setText(number);
			}
		});
		numButt5.setBounds(115, 448, 89, 23);
		layeredPane.add(numButt5);

		JButton numButt6 = new JButton("6");
		numButt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numButt6.getText();
				txt.setText(number);
			}
		});
		numButt6.setBounds(209, 448, 89, 23);
		layeredPane.add(numButt6);

		JButton numButt7 = new JButton("7");
		numButt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numButt7.getText();
				txt.setText(number);
			}
		});
		numButt7.setBounds(20, 412, 89, 23);
		layeredPane.add(numButt7);

		JButton numBut8 = new JButton("8");
		numBut8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numBut8.getText();
				txt.setText(number);
			}
		});
		numBut8.setBounds(115, 414, 89, 23);
		layeredPane.add(numBut8);

		JButton numBut9 = new JButton("9");
		numBut9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String number = txt.getText() + numBut9.getText();
				txt.setText(number);
			}
		});
		numBut9.setBounds(209, 414, 89, 23);
		layeredPane.add(numBut9);

		//Create math buttons.  calling buttons indiv by there 
		//names took too long and too much code.  Too many variables.  
		//Using math string made things simple
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				fstNm = Integer.parseInt(txt.getText());
				txt.setText("");
				math = "+";
			}
		});
		btnAdd.setActionCommand("+");
        btnAdd.setBounds(308, 412, 89, 23);
		layeredPane.add(btnAdd);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				scndNm = Integer.parseInt(txt.getText());
				if (math.equals("+"))
					result = fstNm + scndNm;
				txt.setText(result + " ");
			}
		});
		equal.setBounds(308, 448, 89, 23);
		layeredPane.add(equal);

		txt = new JTextField();
		txt.setBounds(20, 314, 267, 31);
		layeredPane.add(txt);
		txt.setColumns(10);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSProj2a aCalc = new CSProj2a();
		aCalc.setSize(new Dimension(450, 650));
		aCalc.setVisible(true);
		aCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	//Dont know why this is needed but eclipse would yell without it.
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
