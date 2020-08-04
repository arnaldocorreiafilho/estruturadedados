package estrutura;

public class Pilha {

	private Cell primeira;
	private int n=0;
	public void inserir(int data)
	{
		Cell nova = new Cell(data,primeira);
		primeira = nova;
		n++;
	}
	
	public int pop()
	{

		if(vazia()){
			throw new IllegalArgumentException("Pilha vazia");
			}
		
		
			int temp = primeira.getData();
			primeira = primeira.getProx();
			n--;
			return temp;
		
		
	}
	
	public Boolean vazia() {
		return n == 0;
	}
}
