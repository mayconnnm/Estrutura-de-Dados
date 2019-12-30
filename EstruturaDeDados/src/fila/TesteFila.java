package fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {

		Fila fila = new Fila();
		fila.insere("Edgar");
		System.out.println(fila);

		fila.insere("Miguel");
		System.out.println(fila);

		String r1 = fila.remove();
		System.out.println(r1);
		System.out.println(fila);

		boolean b = fila.vazio();
		System.out.println(b);

		Queue<String> filaDoJava = new LinkedList<>();
		filaDoJava.add("Andre");
		System.out.println(filaDoJava);

		filaDoJava.poll();
		System.out.println(filaDoJava);
		
	}
}