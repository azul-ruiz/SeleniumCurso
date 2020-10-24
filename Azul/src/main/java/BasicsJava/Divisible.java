package BasicsJava;

import javax.swing.JOptionPane;

public class Divisible {

	// Clase

	public static void main(String[] args) {
		// Metodo
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Ingresa un numero: ");

		int numero = Integer.parseInt(texto);

		if (numero / 2 == 0) {

			System.out.println("El numero ingresa " + numero + "es divisible entre 2 ");

		} else {

			System.out.println("El numero ingresado " + numero + "no es divisible entre 2");
		}

	}

}
