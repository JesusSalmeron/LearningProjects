package git;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class money {

	public static void main(String[] args) {
		//calculate chips to money
		
		System.out.println("- Calculate chips to € -");
		
		Scanner fichas = new Scanner(System.in);
		
		System.out.println("Select the chips value:");
		System.out.println("1 - 1.25 €");
		System.out.println("2 - 2.5 €");
		System.out.println("3 - 5 €");
		System.out.println("4 - 10 €");
		System.out.println("5 - 50 €");
		
		int money = fichas.nextInt();
		
		switch (money) {
		
		case 1:
			double num_1 = Double.parseDouble(JOptionPane.showInputDialog("How many chips of 1.25 to € ?"));
			System.out.println("Result - " + num_1*1.25 + "€");
			break;
			
		case 2:
			double num_2 = Double.parseDouble(JOptionPane.showInputDialog("How many chips of 2.5 to € ?"));
			System.out.println("Result - " + num_2*2.5 + "€");
			break;
			
		case 3:
			double num_3 = Double.parseDouble(JOptionPane.showInputDialog("How many chips of 5 to € ?"));
			System.out.println("Result - " + num_3*5 + "€");
			break;
			
		case 4:
			double num_4 = Double.parseDouble(JOptionPane.showInputDialog("How many chips of 10 to € ?"));
			System.out.println("Result - " + num_4*10 + "€");
			break;
			
		case 5:
			double num_5 = Double.parseDouble(JOptionPane.showInputDialog("How many chips of 50 to € ?"));
			System.out.println("Result - " + num_5*50 + "€");
			break;
			
			
		default :
			System.out.println("Please select the correct option");
		
			

		}


		
	}

}
