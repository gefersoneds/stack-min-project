package br.univille.estd.stacks.array;

import br.univille.estd.stacks.EmptyStackException;
import br.univille.estd.stacks.Stack;

public class ArrayStack<E> implements Stack<E>{
	
	protected int capacity;
	public static final int CAPACITY = 1000;
	protected E S[];
	protected int top = -1;
	public ArrayStack() {
		this(CAPACITY);
	}
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		S = (E[])new Object[this.capacity];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E top() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public E pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}


}
