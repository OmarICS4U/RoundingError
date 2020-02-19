/*
Omar Sayyed
Feb/19/2020
rounding error calculator
 */

package roundingerror;
import javax.swing.*;
import java.lang.Math;

public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String myInput;
    double num1, rootOfNum1, num1Sqrd,roundError; //users input, root of that input, the root squared, total rounding error.
    //get user input and parse as a double
      myInput = JOptionPane.showInputDialog("Please enter a number");
      num1 = Double.parseDouble(myInput);
      //take the root of the number, then square it
      rootOfNum1 = Math.sqrt(num1);
      num1Sqrd=Math.pow(rootOfNum1, 2); 
      //calculate the difference between the original input and the new number
      roundError = (num1Sqrd - num1);  
      //display resuklts
      System.out.println("The square of the square root =" + num1Sqrd); 
      System.out.println("The rounding error  = " + roundError);
    }
    
}
