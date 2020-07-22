package estrutura;

public class LinkedList {
	
	
	private Cell primeira;
	private Cell ultima;
	private int numberOfObjects = 0;
	
	public void addInBegin(int data)
	{
		Cell nova = new Cell(data, primeira);;
		primeira = nova;
		if(numberOfObjects == 0)
		{
			this.ultima = primeira;
		}
		numberOfObjects++;
	}
	
	
	public void add(int data) {
		if(numberOfObjects == 0)
			this.addInBegin(data);
		else {
			Cell nova = new Cell(data);
			ultima.setProx(nova);
			ultima = nova;
		}
	}
	
	public void printLinkedList()
	{
		Cell atual = primeira;
		
		while (atual != null) {
			 System.out.println(atual.getData());
			 
			 atual = atual.getProx();
			
		}
		
		
	}
	
	

}
