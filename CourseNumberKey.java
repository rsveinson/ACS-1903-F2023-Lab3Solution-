/**
 * ACS-1903 Lab 3 Question 7
 * @author (your name and student number)
 */
import javax.swing.JOptionPane;

public class CourseNumberKey{
    public static void main(String[] args){
        String userInput, courseID;

        // enter your code here
        
        // get the course code
        userInput = JOptionPane.showInputDialog("Enter an ACS course number:");
        
        // parse the id number
        courseID = userInput.substring(4, 8);
        
        // output the id
        JOptionPane.showMessageDialog(null, "Course ID: " + courseID);

    }// end main
}
