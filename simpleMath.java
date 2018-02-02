import java.awt.event.*;
import javax.swing.*;

//You can only inherit one class, you can implement more than one interface.


public class Project2a extends JFrame implements ActionListener{
	/**
	 * Continue project on Git
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	Project2a ex = new Project2a();
	ex.setVisible(true);
	
	}
	
	
	
		//Add global variables	
		JTextField firstNumber = new JTextField(10);
		JTextField secondNumber = new JTextField(10);
		JLabel theAnswer = new JLabel();
		
//Constructor method.  Does not return a value.		 
		public Project2a() {
			initUI();
		}
//Instantiating the panel objects of the J Panel class
		public final void initUI() {
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			JPanel panel5 = new JPanel();
			
			getContentPane().add(panel1, "North");
			getContentPane().add(panel2, "West");
			getContentPane().add(panel3, "Center");
			getContentPane().add(panel4, "East");
			getContentPane().add(panel5, "South");
			
//Add number to panels add the answer to panel 3
			panel2.add(firstNumber);
			
			panel3.add(secondNumber);
			
			panel3.add(theAnswer);
//Giving the button ears
			JButton addButton = new JButton("Add");
			addButton.addActionListener(this);
			panel5.add(addButton);
			
			JButton subtractButton = new JButton("Subtract");
			subtractButton.addActionListener(this);
			panel5.add(subtractButton);
			
			setSize(400, 200);
//Red X on box
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		/**
		 * 
		 * @param action user presses add or subtract buttons.
		 */
		public void actionPerformed(ActionEvent action) {
//If user presses the Add button			
			if (action.getActionCommand().equals("Add")) {
				int firstNum = Integer.parseInt(firstNumber.getText());
				int secondNum = Integer.parseInt(secondNumber.getText());
				
				int answerNum = firstNum + secondNum;
				
				theAnswer.setText(Integer.toString(answerNum));
			}
//If user presses the subtract button			
			if (action.getActionCommand().equals("Subtract")) {
				
				int firstNum = Integer.parseInt(firstNumber.getText());
				int secondNum = Integer.parseInt(secondNumber.getText());
				
				int answerNum = firstNum - secondNum;
				
				theAnswer.setText(Integer.toString(answerNum));
			}
		}
		
			
}
