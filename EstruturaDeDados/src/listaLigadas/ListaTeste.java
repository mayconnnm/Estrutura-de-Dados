package listaLigadas;

public class ListaTeste {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);
		// Adicionando elementos na lista
		lista.adicionaNoComeco("Maycon");
		System.out.println(lista);
		lista.adicionaNoComeco("Nunes");
		System.out.println(lista);
		lista.adicionaNoComeco("Morais");
		System.out.println(lista);

		// Adicionando no final
		lista.adicionaNoFinal("Lucas");
		System.out.println(lista);

		// Adicionando em uma posição
		lista.adicionaNaPosicao(3, "Matheus");
		System.out.println(lista);

		// Pegando elemento da posição
		Object x = lista.pega(2);
		System.out.println(x);

		// Retornando o tamanho da lista
		x = lista.tamanho();
		System.out.println(x);

		System.out.println(lista.contem("Matheus"));
	}
}
