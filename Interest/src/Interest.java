/*
Interest - this will calculate interest
Adam Elliott
2/24/2021
JDK 1.8.0
 */

import java.text.*;
import javax.swing.JOptionPane;


public class Interest {

    public static void main(String[] args) {
        String response = JOptionPane.showInputDialog(null, "How many dollars "
                + "do you wish to borrow?");
        double amount = Double.parseDouble(response);

        
        response = JOptionPane.showInputDialog(null, "What is the interest "
                + "rate?");
        double rate = Double.parseDouble(response);

        response = JOptionPane.showInputDialog(null, "How many years will you"
                + " take the loan? (whole number)");
        int years = Integer.parseInt(response);
        
        double interest = amount * (rate/100) * years;
        
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, "If you borrow " + money.format(amount)
                + " at an interest rate of " + rate
                + "\n for " + years + " years, " 
                + " you will pay " + money.format(interest) + " in interest.");
        
        
        
        
        
        
    }
    
}
