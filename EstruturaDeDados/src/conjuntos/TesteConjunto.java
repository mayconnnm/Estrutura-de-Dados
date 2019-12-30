package conjuntos;

import java.util.HashSet;
import java.util.Set;

public class TesteConjunto {
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();

		conjunto.adiciona("Maycon");
		System.out.println(conjunto);

		conjunto.adiciona("Nunes");
		System.out.println(conjunto);

		conjunto.adiciona("Morais");
		System.out.println(conjunto);

		conjunto.remove("Morais");
		System.out.println(conjunto);

		Set<String> conjuntoDoJava = new HashSet<>();
		conjuntoDoJava.add("Lucas");
		System.out.println(conjuntoDoJava);
		
		conjuntoDoJava.add("Bernardo");
		System.out.println(conjuntoDoJava);
		
		conjuntoDoJava.remove("Lucas");
		System.out.println(conjuntoDoJava);

	}
}