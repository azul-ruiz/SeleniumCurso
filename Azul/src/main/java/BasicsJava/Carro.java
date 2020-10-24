package BasicsJava;

import javax.swing.JOptionPane;

public class Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido");

		String numero1 = JOptionPane.showInputDialog("Introduce Número 1");
		int dato_numUno = Integer.parseInt(numero1);

		String numero2 = JOptionPane.showInputDialog("Introduce Número 1");
		int dato_numDos = Integer.parseInt(numero2);

		JOptionPane.showMessageDialog(null, "Resultado Suma" + (dato_numUno + dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Resta" + (dato_numUno - dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Multiplicación" + (dato_numUno * dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado División" + (dato_numUno / dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Módulo" + (dato_numUno % dato_numDos));
	}

}
