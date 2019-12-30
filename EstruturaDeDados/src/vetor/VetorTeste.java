package vetor;

public class VetorTeste {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Jose");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Danilo");
		Aluno a5 = new Aluno("Matheus");
		Aluno a6 = new Aluno("lucas");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a6);
		lista.adicionaNaPosicao(0, a5);
		lista.adicionaNaPosicao(4, a4);
		System.out.println(lista.pegaALuno(2));
		System.out.println(lista.toString());
		lista.remove(2);
		System.out.println(lista.toString());

		for (int i = 0; i < 200; i++) {
			Aluno x = new Aluno("Teste" + i);
			lista.adiciona(x);
		}
		
		System.out.println(lista.toString());
	}
}