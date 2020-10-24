package BasicsJava;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	//static heredar = "Mensaje de texto";
		static String heredar = "Mensaje de texto";
		
		//public static List<String> listaNombres() {
			protected static List<String> listaNombres() {
			List<String> listadeNombres = new ArrayList<>();
				listadeNombres.add("Vero");
				listadeNombres.add("Mon");
				listadeNombres.add("Joa");
				listadeNombres.add("Mon");
				listadeNombres.add("Carlos");

			return listadeNombres;
		}
			protected static List<String> listaNombres2() {
				List<String> listadeNombres2 = new ArrayList<>();
					listadeNombres2.add("Ana");
					listadeNombres2.add("Mon");
					listadeNombres2.add("Joa");
					listadeNombres2.add("lucia");
					listadeNombres2.add("Carlos");

				return listadeNombres2;
			}

		//public static List<Integer> listaNumeros() {
			protected static List<Integer> listaNumeros() {
			List<Integer> listadeNumeros = new ArrayList<>();

				listadeNumeros.add(50);
				listadeNumeros.add(15);
				listadeNumeros.add(100);
				listadeNumeros.add(50);

			return listadeNumeros;

	}

}
