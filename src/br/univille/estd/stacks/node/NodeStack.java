package br.univille.estd.stacks.node;

import br.univille.estd.stacks.EmptyStackException;
import br.univille.estd.stacks.Stack;

public class NodeStack<E> implements Stack<E>{
	
	protected int size;     // Tamanho da pilha
	protected Node<E> top;  // Referencia para o Nodo cabeça
	
	public NodeStack(){
		size = -1;
		top = null;
	}

	@Override
	public int size() {
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public E top() throws EmptyStackException {
		return null;
	}

	@Override
	public void push(E element) {
		
	}

	@Override
	public E pop() throws EmptyStackException {
		return null;
	}
	


}
