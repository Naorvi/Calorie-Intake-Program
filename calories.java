package calories;

import javax.swing.JOptionPane; // needed to use the dialog box

public class calories {

	public static void main(String[] args) {
		
        // Declare variables
        String input; // needed to store input from a dialog box
        int weight = 0;
        int caloricNeed = 0;
        int gender = 0;
        int activityLevel = 0;

        // Display intro using a dialog box
        JOptionPane.showMessageDialog(null, "Welcome To The Daily " 
        		+ "Recommended Calorie Intake Program!\n");
        
        // Loop for user weight input
        do {
            // Prompt the user for his/ her weight
            input = JOptionPane.showInputDialog("Please enter your weight:\n\n");

            // Input validation for weight
            try {
                weight = Integer.parseInt(input);
            } catch (Exception e) {}
            if (weight < 10)
                JOptionPane.showMessageDialog(null, "Invalid input, please try again!\n");

        } while (weight < 10);

        // Loop for user gender input
        do {
            // Prompt the user for his/ her gender
            input = JOptionPane.showInputDialog("Please select the number that reflects" 
            + " your gender:\n\n" +  "1) Male\n\n2) Female\n\n");

            // Input validation for gender
            try {
                gender = Integer.parseInt(input);
            } catch (Exception e) {}
            if (gender != 1 && gender != 2)
                JOptionPane.showMessageDialog(null, "Invalid input, please try again!\n");

        } while (gender != 1 && gender != 2);

        // Loop for user activity level input
        do {
            // Prompt the user for his/ her activity level
            input = JOptionPane.showInputDialog("Please select the number that reflects" 
            + " your activity level:\n\n" + "1) Moderately Active\n\n2) Low Activity Level\n\n");

            // Input validation for activity level
            try {
                activityLevel = Integer.parseInt(input);
            } catch (Exception e) {}
            if (activityLevel != 1 && activityLevel != 2)
                JOptionPane.showMessageDialog(null, "Invalid input, please try again!\n");

        } while (activityLevel != 1 && activityLevel != 2);

        // Decision structure to calculate and determine caloric intake
        if (gender == 1 && activityLevel == 1)
            caloricNeed = weight * 15;
        else if (gender == 1 && activityLevel == 2)
            caloricNeed = weight * 13;
        else if (gender == 2 && activityLevel == 1)
            caloricNeed = weight * 12;
        else if (gender == 2 && activityLevel == 2)
            caloricNeed = weight * 10;

        // Display recommended daily caloric intake using a dialog box
        JOptionPane.showMessageDialog(null, "Your daily recommended calorie intake is: \n\n" 
        + "                    " + caloricNeed + " calories\n\n");
        
        //Display goodbye
      		JOptionPane.showMessageDialog(null, "       Have a great day!");

        System.exit(0); // needed when using dialog boxes
	}

}
