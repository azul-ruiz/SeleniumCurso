package BasicsJava;

import javax.swing.JOptionPane;

public class Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido");

		String numero1 = JOptionPane.showInputDialog("Introduce N�mero 1");
		int dato_numUno = Integer.parseInt(numero1);

		String numero2 = JOptionPane.showInputDialog("Introduce N�mero 1");
		int dato_numDos = Integer.parseInt(numero2);

		JOptionPane.showMessageDialog(null, "Resultado Suma" + (dato_numUno + dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Resta" + (dato_numUno - dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Multiplicaci�n" + (dato_numUno * dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Divisi�n" + (dato_numUno / dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado M�dulo" + (dato_numUno % dato_numDos));
	}

}
