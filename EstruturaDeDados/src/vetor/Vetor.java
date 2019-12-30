package vetor;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalAlunos = 0;

	public void adiciona(Aluno aluno) {
		garanteEspaco();
		alunos[totalAlunos] = aluno;
		totalAlunos++;
	}

	public void adicionaNaPosicao(int posicao, Aluno aluno) {
		garanteEspaco();
		if (posicao >= 0 && posicao <= totalAlunos) {
			for (int i = totalAlunos - 1; i >= posicao; i -= 1) {
				alunos[i + 1] = alunos[i];
			}
			alunos[posicao] = aluno;
			totalAlunos++;
		} else {
			throw new IllegalArgumentException("Posição inválida");
		}
	}

	public Aluno pegaALuno(int posicao) {
		if (posicao >= 0 && posicao < totalAlunos) {
			return alunos[posicao];
		}
		throw new IllegalArgumentException("Posição inválida");
	}

	public void remove(int posicao) {
		if (posicao >= 0 && posicao < totalAlunos) {
			for (int i = posicao; i <= totalAlunos; i++) {
				alunos[i] = alunos[i + 1];
			}
			totalAlunos--;
			alunos[totalAlunos] = null;
		} else {
			throw new IllegalArgumentException("Posição inválida");
		}
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalAlunos; i++) {
			if (aluno.equals(alunos[i]))
				return true;
		}
		return false;
	}

	public int tamanho() {
		return totalAlunos;
	}

	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}

	public void garanteEspaco() {
		if (totalAlunos == alunos.length) {
			Aluno[] novoAluno = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoAluno[i] = alunos[i];
			}
			this.alunos = novoAluno;
		}
	}
}