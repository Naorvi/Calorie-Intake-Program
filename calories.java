package calories;

import javax.swing.JOptionPane; // needed to use the dialog box

public class calories {

    public static void main(String[] args) {

        // Declare variables
        String input; // needed to store input from a dialog box
        int weight;
        int caloricNeed = 0;
        int gender;
        int activityLevel;

        // Display intro using a dialog box
        JOptionPane.showMessageDialog(null, "Welcome To The Daily " 
        		+ "Recommended Calorie Intake Program!\n");

        // Prompt the user for his/ her weight:
        input = JOptionPane.showInputDialog("Please enter your weight: ");
        weight = Integer.parseInt(input);
        //Validate weight 
        if (weight < 10) {
        	JOptionPane.showMessageDialog(null, "Invalid input, try again!\n");
        } 
        // Prompt the user for his/ her gender:
        input = JOptionPane.showInputDialog("Please select the number that reflects your gender:\n\n"
                +  "1) Male\n\n2) Female\n\n");
        gender = Integer.parseInt(input);
        //Validate weight 
        if (gender != 1 &&gender != 2) {
        	JOptionPane.showMessageDialog(null, "Invalid input, try again!\n");
        }

        // Prompt the user for his/ her activity level:
        input = JOptionPane.showInputDialog("Please select the number that " 
        		+ "reflects your activity level:\n\n"
                +  "1) Moderately Active\n\n2) Low Activity level\n\n");
        activityLevel = Integer.parseInt(input);
        
        //Decision structure to determine calories
        if (gender == 1) {
            if (activityLevel == 1) {
                caloricNeed = weight * 15;
            } else if (activityLevel == 2) {
                caloricNeed = weight * 13;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input, try again!\n");
            }
        }
        else if (gender == 2) {
            if (activityLevel == 1) {
                caloricNeed = weight * 12;
            } else if (activityLevel == 2) {
                caloricNeed = weight * 10;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input, try again!\n");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid input, try again!\n");
        }

        // Display recommended daily caloric intake using a dialog box
        JOptionPane.showMessageDialog(null, "Your daily recommended calorie intake is: \n\n" 
        + "                    " + caloricNeed + " calories\n\n");
        
        //Display goodbye
      		JOptionPane.showMessageDialog(null, "       Have a great day!");

        System.exit(0); // needed when using dialog boxes
    }
}
