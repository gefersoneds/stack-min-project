package br.univille.estd.stacks.reverse;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class StackUtilsTest {
	
	@Test
	public void arrayWithSizeOne() {
		Integer array[] = {0};
		StackUtils.<Integer>reverse(array);
		assertArrayEquals("A pilha deve estar vazia",new Integer[]{0},array);
	}
	
	@Test
	public void arrayWithSizeFive() {
		Integer array[] = {0,1,2,3,4};
		StackUtils.<Integer>reverse(array);
		assertArrayEquals("A pilha deve estar vazia",new Integer[]{4,3,2,1,0},array);
	}

}
