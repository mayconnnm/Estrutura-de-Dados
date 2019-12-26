package ed;

public class Aluno {

	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		return o.equals(this.nome);
	}

	@Override
	public String toString() {
		return nome;
	}
}