package calories;

import javax.swing.JOptionPane; //needed to use the dialog box
public class calories {

	public static void main(String[] args) {
		//Declare variables
				double weight = 0.0;
				double totalCalories = 0.0;
				String userName; //needed to store input from a dialog box
				String userWeight; //needed to store input from a dialog box
				String stringInput; //needed to store input from a dialog box
				String gender;//needed to store input from a dialog box
				boolean male;						
				String exercise;//needed to store input from a dialog box
				boolean moderate = false;
				boolean low = false;
				
				
				//Display intro using a dialog box
				JOptionPane.showMessageDialog(null, "WELCOME TO THE CALORIC INTAKE PROGRAM!");
							
				//Prompt the user for his/ her name:
				stringInput = JOptionPane.showInputDialog("Please enter your name:          ");
				
				//Display gender question and prompt user for input
				stringInput = JOptionPane.showInputDialog("Please select your gender\n"
				+"\n1) Male\n"+"\n2) Female\n\n"+"Please select your answer:");
				
				//Display activity level question and prompt user for input
				stringInput = JOptionPane.showInputDialog("Please select your activity level\n"
				+"\n1) Moderate Activity\n"+"\n2) Low Level Activity\n\n"+"Please select your answer:");
					
				//Prompt the user for his/ her weight:
				/*do
				{
				userWeight = JOptionPane.showInputDialog("Please enter your weight (lb):          ");				
				
				//validate weight
				if (weight <=0);
				JOptionPane.showMessageDialog(null, "INVALID INPUT!");
					
				}
				
				while (weight<=0);*/
				
				//convert the user's input to a double and we store in variable
				//weight = Double.parseDouble(stringInput);
				
				//one-way if statement to display caloric intake
				
			
				//display goodbye
				JOptionPane.showMessageDialog(null, "Have a great day!!");

	}

}
