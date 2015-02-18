import javax.swing.JOptionPane;  //GUI dialogs 
public class Testing{
	public static void main(String[] args){
		String firstNumber, secondNumber, result;
		int number1, number2, sum;

		//read user numbers
		firstNumber = JOptionPane.showInputDialog("Enter first integer:");
		secondNumber = JOptionPane.showInputDialog("Enter second integer:");
		//convert numbers
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
		//calculate adder
		sum = number1 + number2;
		result = number1 + " + " + number2 + " + " + sum;
		//Display results
		JOptionPane.showMessageDialog(null, result, "Adder Result",JOptionPane.INFORMATION_MESSAGE);
	}//end of main()
}// end of adder classc
