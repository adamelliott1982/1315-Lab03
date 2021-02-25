/*
Ounces - this will convert ounces into different measurements
Adam Elliott
2/24/2021
JDK 1.8.0
 */

import java.text.*;
import javax.swing.*;

public class Ounces {

    public static void main(String[] args) {
        String response = JOptionPane.showInputDialog(null, "How many ounces "
                + "do you wish to convert?");
        double ounces = Double.parseDouble(response);
        
        double cups = ounces / 8;
        double pints = ounces / 16;
        double quarts = ounces / 32;
        double gallons = ounces / 128
        
                
        DecimalFormat pattern = new DecimalFormat("##.##")
        JOptionPane.showMessageDialog(null, "Ounces: " + pattern.format(ounces)
                + "\nCups: " + pattern.format(cups)
                + "\nPints: " + pattern.format(pints)
                + "\nQuarts: " + pattern.format(quarts)
                + "\nGallons: " + pattern.format(gallons)
        );

    }
    
}
