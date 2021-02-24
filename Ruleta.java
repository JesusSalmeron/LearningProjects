package git;
import java.util.*;
import javax.swing.JOptionPane;

//Programa como aprendizaje de los pagos de la ruleta ! ;)
//Learning program for american payout 

public class Ruleta {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" - American Roulette - ");
		System.out.println("Calculate the roulette payout.");
		System.out.println("Please, select an option: \n1: Straight \n2: Split \n3: Street  \n4: Corner \n5: Double Street");
		
		int bet_case = entrada.nextInt();
		
		switch (bet_case) {
		
		case 1:
			int pleno = Integer.parseInt(JOptionPane.showInputDialog("how many chips have you bet"));
			System.out.println("Result - " + pleno*35);
			if (pleno>20) {
				System.out.println("Careful ,bet not allowed");
			}
			break;
			
		case 2:
			int caballo = Integer.parseInt(JOptionPane.showInputDialog("how many chips have you bet"));
			System.out.println("Result - " + caballo*17);
			if (caballo>40) {
				System.out.println("Careful ,bet not allowed");
			}
			break;
			
		case 3:
			int calle = Integer.parseInt(JOptionPane.showInputDialog("Ihow many chips have you bet"));
			System.out.println("Result - " + calle*11);
			if (calle>60) {
				System.out.println("Careful ,bet not allowed");
			}
			break;
		
		case 4:
			int cuadro = Integer.parseInt(JOptionPane.showInputDialog("how many chips have you bet"));
			System.out.println("Result - " + cuadro*8);
			if (cuadro>80) {
				System.out.println("Careful ,bet not allowed");
			}
			break;
		
		case 5:
			int seisena = Integer.parseInt(JOptionPane.showInputDialog("how many chips have you bet"));
			System.out.println("Result - " + seisena*5);
			if (seisena>120) {
				System.out.println("Careful ,bet not allowed");
			}
			break;
			
		default:
			System.out.println("Please, select a correct option.");

		
		
		}
		
		
	}

}
