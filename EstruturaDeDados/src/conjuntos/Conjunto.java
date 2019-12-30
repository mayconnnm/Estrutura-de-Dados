package conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}

	public void adiciona(String valor) {
		if (!contem(valor)) {
			int indice = calculaIndiceDaTabela(valor);
			List<String> lista = tabela.get(indice);
			lista.add(valor);
		}
	}

	private boolean contem(String valor) {
		int indice = calculaIndiceDaTabela(valor);
		return tabela.get(indice).contains(valor);
	}

	public void remove(String valor) {
		if (contem(valor)) {
			int indice = calculaIndiceDaTabela(valor);
			List<String> lista = tabela.get(indice);
			lista.remove(valor);
		}
	}

	private int calculaIndiceDaTabela(String valor) {
		return valor.toLowerCase().charAt(0) % 26;
	}

	@Override
	public String toString() {
		return tabela.toString();
	}
}