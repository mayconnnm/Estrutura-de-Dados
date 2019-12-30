package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	private List<String> nomes = new LinkedList<>();

	public void push(String nome) {
		nomes.add(nome);
	}

	public String pop() {
		return nomes.remove(nomes.size() - 1);
	}

	public boolean vazio() {
		if (nomes.size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return nomes.toString();
	}
}