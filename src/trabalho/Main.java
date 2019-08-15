package trabalho;

public class Main { 

	public static void main(String[] args) { 
		MyStack s = new MyStack(); 
		s.push(3); 
		s.push(5); 
		s.getMin(); 
		s.push(1); 
		s.getMin(); 
		s.pop();  
		s.pop(); 
		s.getMin();
		s.pop(); 
		s.getMin();
		
	} 
} 	