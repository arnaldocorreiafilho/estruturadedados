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
	
	
	private Boolean ocupiedPosition(int pos)
	{
		return pos >= 0 && pos < numberOfObjects;
	}
	
	
	public Cell getByPosition(int pos)
	{
		if(!this.ocupiedPosition(pos)){
			throw new IllegalArgumentException("Posição não existe");
			}
		int i = 0;
		Cell atual = primeira;
		while(i < pos)
		{
			atual = atual.getProx();
			i++;
		}
		return atual;
	}
	
	
	public void addPos(int pos , int data)
	{
		if(pos == 0)
		{
			addInBegin(data);
		}
		if(pos==numberOfObjects)
		{
			add(data);
		}
		else {
			
			Cell anterior = getByPosition(pos-1);
			Cell nova = new Cell(data, anterior.getProx());
			anterior.setProx(nova);
			this.numberOfObjects++;
		}
	}
	
	public int getElement(int pos)
	{
		return getByPosition(pos).getData();
	}
	
	public Boolean existElement(int i) {
		Cell atual = primeira;
		
		while (atual != null) {
			
			if(atual.getData() == i)
				return true;
			atual = atual.getProx();
		}
		
		return false;
	}
	
	public int getTamanho()
	{
		return numberOfObjects;
	}
	
	public void removeDoComeco() {
		if(!this.ocupiedPosition(0)){
			throw new IllegalArgumentException("Posição não existe");
			}
		
		this.primeira = this.primeira.getProx();
		this.numberOfObjects--;
		
		if(numberOfObjects == 0)
			ultima = null;
	}
	
	public void removerUltima(int pos) {
		if(!this.ocupiedPosition(pos)){
			throw new IllegalArgumentException("Posição não existe");
			}
		Cell anterior;
		if(pos == 0)
		{
			this.removeDoComeco();
			//System.out.println("passou");
		}
			
		
		else {
			anterior = getByPosition(pos-1);		
			
			Cell atual = anterior.getProx();
			Cell prox = atual.getProx();
			anterior.setProx(prox);
			if(pos == numberOfObjects-1) {
				ultima = anterior;
			}
			numberOfObjects--;
			
			
		}
	}
	
	public Cell getAnterior()
	{
		Cell anterior = primeira;
		while (anterior.getProx().getProx() != null) {
			
			anterior = anterior.getProx();
		}
		return anterior;
	}
	public void removerUltima() {	
		
		
		
		Cell anterior = getAnterior();
		anterior.setProx(null);
		this.ultima = anterior;
		this.numberOfObjects--;
	}
	

}
