/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment9sumofnumbersinastring;
import java.util.Scanner; // import the scanner class for user input
/**
 *
 * @author John Hernandez
 */
public class Assignment9SumofNumbersinaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Variables Intilization
        int total = 0; 
        String str;
        
        Scanner input = new Scanner(System.in);//Scanner obj created
        
        System.out.println("Enter a series of numbers seperated by commas (,)");
        str = input.nextLine(); // Scanner collects next string input
        
        String[] numbers = str.split(","); //delimiter is the comma
       
        for (String i : numbers) //Advance for loop
        {
            total += Integer.parseInt(i); // adds the series of numbers
        }
        System.out.println("Total: " + total); // output of the total
    }
    
}
