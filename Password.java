package git;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class Password { 
	// How to generate a password EASY PEASY -- Generador de contrase�as ;)
	//Especial dedicatoria en esta c�digo 
	
	
	public static void main(String[] args) throws Exception {
		
		
		String contrasena = "Zenid";
		String pass = "";
		int intentos = 0;
		String z = " \nah ah ah ";
		
		while (contrasena.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a en tres intentos por favor.");
			
			if (contrasena.equals(pass)==false) {
				System.out.println("ah ah ah. Contrase�a incorrecta.");
				intentos++;
				
			} if (intentos>2) {
				Desktop d = Desktop.getDesktop();
				d.browse(new URI("https://www.youtube.com/watch?v=RVSEaTWM3kU&ab_channel=Gantris"));
				System.out.println("no has dicho la palabra m�gica");
				System.out.println(z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z+z);
				return;
			}

		}
		System.out.println("Contrase�a correcta.");
		System.out.println("Bienvenido a Jurassic Park Juan Pablo.");
		System.out.println("--- No hemos reparado en gastos ---");



	}

}
