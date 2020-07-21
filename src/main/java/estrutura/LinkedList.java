package estrutura;

public class LinkedList {
	
	
	private Cell primeira;
	private Cell ultima;
	private int numberOfObjects = 0;
	
	public void add(int data)
	{
		Cell nova = new Cell(data, primeira);;
		primeira = nova;
		if(numberOfObjects == 0)
		{
			this.ultima = primeira;
		}
		numberOfObjects++;
	}
	
	

}
