import java.util.Scanner;
import javax.swing.JOptionPane;

public class calculatorGui {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double result;

        //input Arithmetic character to perform operation 
        String getChar=JOptionPane.showInputDialog("Enter a character Like: + - * /");
        char retChar=getChar.charAt(0);
        // JOptionPane.showMessageDialog(null, "you Enter"+retChar);

        //input Number 1 
        Double number1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your First Number"));
        // JOptionPane.showMessageDialog(null, "you Enter"+number1);

        //input Number 2
        Double number2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your Second Number"));
        // JOptionPane.showMessageDialog(null, "you Enter"+number2);
        //The Arithmetic operation begin
        switch (retChar){

            // performs addition between numbers
            case '+':
              result = number1 + number2;
              JOptionPane.showMessageDialog(null, "Your Answer is " + result);
              JOptionPane.showMessageDialog(null, "Coded By -- Redwan Islam");
              break;
      
            // performs subtraction between numbers
            case '-':
              result = number1 - number2;
              JOptionPane.showMessageDialog(null, "Your Answer is "+ result);
              JOptionPane.showMessageDialog(null, "Coded By -- Redwan Islam");
              break;
      
            // performs multiplication between numbers
            case '*':
              result = number1 * number2;
              JOptionPane.showMessageDialog(null, "Your Answer is " + result);
              JOptionPane.showMessageDialog(null, "Coded By -- Redwan Islam");
              break;
      
            // performs division between numbers
            case '/':
              result = number1 / number2;
              JOptionPane.showMessageDialog(null, "Your Answer is " + result);
              JOptionPane.showMessageDialog(null, "Coded By -- Redwan Islam");
              break;

            default:
              JOptionPane.showMessageDialog(null, "Invalid Operator");
              JOptionPane.showMessageDialog(null, "Coded By -- Redwan Islam");
              break;
          }
    }
}
