/**
 * ACS-1903 Lab 3 Question 8
 * @author (your name and student number)
 */
import java.util.Scanner;

public class BuildingNameKey{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a building code: ");
        String code = kb.next();
        
        /*could also use toUpperCase() or .toLowerCase()
         * them you wouldn't need to use equals.ignoreCase() in the
         * logical expression
         */
        
        // code = kb.next().toUpperCase();
        // System.out.println(code);
        
        // enter your code here
        
        /* it's even better if studens add another String variable and set
         * the value of the variable to the building name
         * and then use only one System.out.println... 
         */
        if(code.equalsIgnoreCase("DUCK")){
            System.out.println("Duckworth Centre");
        }// end duck
        else if(code.equalsIgnoreCase("CENT")){
            System.out.println("Centenial Hall");
        }// end cent
        else if(code.equalsIgnoreCase("MAN")){
            System.out.println("Manitoba Hall");
        }// ebd man
        else{
            System.out.println("Not in the list");
        }// end not in list
        
    }// end main
}
