package fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> alunos = new LinkedList<>();

	public void insere(String aluno) {
		alunos.add(aluno);
	}

	public String remove() {
		return alunos.remove(0);
	}

	public boolean vazio() {
		if (alunos.size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return alunos.toString();
	}
}
