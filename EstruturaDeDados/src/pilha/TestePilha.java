package pilha;

import java.util.Stack;

public class TestePilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.push("Maycon");
		System.out.println(pilha);

		pilha.push("Nunes");
		System.out.println(pilha);

		String t1 = pilha.pop();
		System.out.println(t1);
		System.out.println(pilha);

		String t2 = pilha.pop();
		System.out.println(t2);
		System.out.println(pilha);

		Stack<String> stack = new Stack<>();
		// Insere na pilha
		stack.push("Matheus");
		System.out.println(stack);

		stack.push("Lucas");
		System.out.println(stack);

		// Remove da pilha
		String s = stack.pop();
		System.out.println(s);
		System.out.println(stack);

		String s1 = stack.pop();
		System.out.println(s1);
		System.out.println(stack);

		// Indica o último elemento da pilha
		String s2 = stack.peek();
		System.out.println(s2);
		System.out.println(stack);

	}
}
