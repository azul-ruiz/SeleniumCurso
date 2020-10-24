package BasicsJava;

import javax.swing.JOptionPane;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
		int numero1 = 24;
		int numero2 = 7;

		System.out.println("el resultado de la suma es: " + (numero1 + numero2));
		System.out.println("el resultado de la resta es: " + (numero1 - numero2));
		System.out.println("el resultado de la multiplicación es: " + (numero1 * numero2));
		System.out.println("el resultado de la división es: " + (numero1 / numero2));
	*/
		
		String numero1 = JOptionPane.showInputDialog("Introduce el numero 1");
		String numero2 = JOptionPane.showInputDialog("Introduce el numero 2");
		
	
		System.out.println("el resultado de la suma es: " + (Integer.parseInt(numero1)+Integer.parseInt(numero2)));
		System.out.println("el resultado de la resta es: " + (Integer.parseInt(numero1)-Integer.parseInt(numero2)));
		System.out.println("el resultado de la multiplicación es: " + (Integer.parseInt(numero1)*Integer.parseInt(numero2)));
		System.out.println("el resultado de la división es: " + (Integer.parseInt(numero1)/Integer.parseInt(numero2)));

	}

}
