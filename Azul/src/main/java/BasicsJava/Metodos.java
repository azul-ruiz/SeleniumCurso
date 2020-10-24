package BasicsJava;

public class Metodos {
	int numero1, numero2, numero3;

	public Metodos(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	// public Metodos() {

	// }

	public Metodos() {
		// System.out.println(numero);
	}


	public void mostrarMensaje() {
		System.out.println("Hola Mundo");
	}

	public int sumatoria() {

		return numero1 + numero2;
	}

	// sobre carga de metodos
	public int sumatoria(String mensaje) {

		return numero1 + numero2 + numero3;
	}

	public String mostrarNombre(String nombre) {
		System.out.println(nombre);

		return nombre;
	}

	public static void prueba() {

		System.out.println("Metodo estatico");
	}

}
