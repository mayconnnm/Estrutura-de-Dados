package listaLigadas;

public class ListaLigada {

	private Celula primeiro = null;
	private Celula ultimo = null;
	private int totalElementos = 0;

	public void adicionaNoComeco(Object elemento) {

		if (totalElementos == 0) {
			Celula nova = new Celula(elemento, this.primeiro);
			this.primeiro = nova;
			this.ultimo = nova;
		} else {
			Celula nova = new Celula(elemento, this.primeiro);
			this.primeiro.setAnterior(nova);
			this.primeiro = nova;
		}

//		Celula nova = new Celula(elemento, this.primeiro);
//		this.primeiro = nova;
//
//		if (this.totalElementos == 0) {
//			this.ultimo = this.primeiro;
//		}
		this.totalElementos++;
	}

	public void adicionaNaPosicao(int posicao, Object elemento) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == this.totalElementos) {
			adicionaNoFinal(elemento);
		} else {
			Celula anterior = pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.getProximo().setAnterior(nova);
			anterior.setProximo(nova);
			nova.setAnterior(anterior);
			this.totalElementos++;
		}
	}

	public void adicionaNoFinal(Object elemento) {
		if (this.totalElementos == 0) {
			adicionaNoComeco(elemento);
		}
		Celula nova = new Celula(elemento, null);
		this.ultimo.setProximo(nova);
		nova.setAnterior(this.ultimo);
		this.ultimo = nova;
		this.totalElementos++;
	}

	private Celula pegaCelula(int posicao) {
		if (posicao >= 0 && posicao < this.totalElementos) {
			Celula atual = this.primeiro;
			for (int i = 0; i < posicao; i++) {
				atual = atual.getProximo();
			}
			return atual;
		}
		throw new IllegalArgumentException("Posição inválida");
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco() {
		if (totalElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}

		this.primeiro = this.primeiro.getProximo();
		totalElementos--;

		if (totalElementos == 0) {
			this.ultimo = null;
		}
	}

	public void removeDaPosicao(int posicao) {
		if (posicao >= 0 && posicao < totalElementos) {
			Celula anterior = pegaCelula(posicao - 1);
			Celula temp = anterior.getProximo();
			Celula proximo = temp.getProximo();
			temp.setAnterior(null);
			temp.setProximo(null);
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			totalElementos--;
		} else {
			throw new IllegalArgumentException("Posição inválida");
		}
	}

	public void removeDoFinal() {
		if (totalElementos == 1) {
			removeDoComeco();
		}
		this.ultimo = this.ultimo.getAnterior();
		this.ultimo.getProximo().setAnterior(null);
		this.ultimo.setProximo(null);
		this.totalElementos--;
	}

	public int tamanho() {
		return totalElementos;
	}

	public boolean contem(Object elemento) {
		if (elemento != null && elemento != "") {
			Celula atual = this.primeiro;
			for (int i = 0; i < totalElementos; i++, atual = atual.getProximo()) {
				if (elemento.equals(atual.getElemento())) {
					return true;
				}
			}
		} else {
			throw new IllegalArgumentException("Elemento vazio, favor digitar um elemento válido");
		}
		return false;
	}

	@Override
	public String toString() {
		if (this.totalElementos == 0) {
			return "[]";
		}

		Celula atual = primeiro;
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < this.totalElementos; i++) {
			sb.append(atual.getElemento() + ",");
			atual = atual.getProximo();
		}
		sb.append("]");
		return sb.toString();
	}
}