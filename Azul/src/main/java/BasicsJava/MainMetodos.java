package BasicsJava;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMetodos extends Metodos2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Metodos nombreObjeto = new Metodos(10, 5);
		Metodos nombreObjeto2 = new Metodos(9, 3);
		// Metodos2 objeto = new Metodos2();

		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());

		// heredar
		System.out.println(heredar);

		nombreObjeto.mostrarMensaje();

		String elementoGuardado = nombreObjeto.mostrarNombre("Joana");

		System.out.println(elementoGuardado);

		// prueba();

		Metodos.prueba();

		// List<String> listadeNombres = objeto.listaNombres();
		List<String> listadeNombres = listaNombres();
		// List<Integer> listadeNumeros = objeto.listaNumeros();
		List<Integer> listadeNumeros = listaNumeros();

		for (String nombre : listadeNombres) {

			System.out.println(nombre);

		}

		System.out.println("For con dos puntos");

		for (int indice = 0; indice < listadeNombres.size(); indice++) {

			System.out.println(listadeNombres.get(indice));

		}
		System.out.println("For con index");

		for (int numero : listadeNumeros) {
			System.out.println(numero);
		}

		// se declara un metodo de tipo lista para imprimir la lista de nombres
		List<String> NombresSinDuplicados = listadeNombres.stream().distinct().collect(Collectors.toList());
		
		// lista en orden A-Z
		// Collections.sort sirve para ordenar listas
		Collections.sort(NombresSinDuplicados);
		// imprimir lista
		System.out.println(NombresSinDuplicados);

		// lista en orden Z-A
		Collections.sort(NombresSinDuplicados, Collections.reverseOrder());

		// imprimir lista
		System.out.println(NombresSinDuplicados);

		System.out.println(Collections.max(listadeNumeros));
		System.out.println(Collections.min(listadeNumeros));
		Collections.sort(listadeNumeros);
		System.out.println(listadeNumeros);
		Collections.sort(listadeNumeros, Collections.reverseOrder());
		System.out.println(listadeNumeros);

		Object last = null;
		int numCount = 0;

		// iteramos la lista de numeros
		Iterator<Integer> i = listadeNumeros.iterator();

		while (i.hasNext()) {

			Object temp = i.next();

			if (temp.equals(last)) {

				i.remove();
				numCount++; // numCount = numCount +1;

			} else {
				last = temp;
			}

		}
		System.out.println(numCount);
		System.out.println(listadeNumeros);

		List<String> nombres1 = listaNombres();
		List<String> nombres2 = listaNombres2();

		Collections.sort(nombres1);
		Collections.sort(nombres2);

		boolean isIgual = nombres1.equals(nombres2);
		System.out.println(isIgual);

		if (isIgual == true) {
			System.out.println("las listas son iguaes:\n");
			System.out.println("lista1:" + nombres1 + " " + "lista2: " + nombres2 + "");
		} else {
			System.out.println("las listas no son iguales \n");
			System.out.println("lista1: " + nombres1 + " " + "lista2: " + nombres2 + " ");
		}

	}

}
