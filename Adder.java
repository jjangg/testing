import javax.swing.JOptionPane;
public class Adder
{
	public static void main (String args[])
	{
		String firstNumber,secondNumber,result;
		int number1,number2,answer;
		firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
		secondNumber = JOptionPane.showInputDialog("Enter second integer: ");
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		answer = number1 + number2;
		result = "";
		result = result + "Answer = " + answer;
		JOptionPane.showMessageDialog(null,result,"Adder Result",JOptionPane.INFORMATION_MESSAGE);
	}
}