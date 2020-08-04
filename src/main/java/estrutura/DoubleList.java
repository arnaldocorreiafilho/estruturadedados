package estrutura;

public class DoubleList {
	 

	private Cell primeria;
	private Cell ultima;
	private int n;
	
	public void addComeco(int data)
	{
		if(n==0) {
			Cell novo = new Cell(data);
			primeria = novo;
			ultima = novo;
		}
		else {
			Cell novo = new Cell(data, this.primeria);
			this.primeria.setAnterior(novo);
			primeria = novo;
			
		}
		n++;
	}
	
	public void print()
	{
		Cell atual = primeria;
		
		while (atual != null) {
			System.out.println(atual.getData());
			atual = atual.getProx();
			
		}
	}
	
	public Boolean posicaoOcupada(int pos)
	{
		return pos>= 0 && pos < n;
	}
	private Cell getPosicao(int id)
	{
		if(!this.posicaoOcupada(id)){
			throw new IllegalArgumentException("Posição não existe");
			}
		
		Cell atual = primeria;
		int i = 0;
		while (i < id) {
			atual = atual.getProx();
			i++;
			
		}
		return atual;
		
		
	}
	
	public void adiciona(int id)
	{
		if(n==0)
		{
			addComeco(id);
		}
		else {
			Cell nova = new Cell(id);
			nova.setAnterior(ultima);
			ultima.setProx(nova);
			ultima = nova;
			n++;
		}
	}
	
	public void adiciona(int pos,int id)
	{
		if(n==0)
			addComeco(id);
		if(pos == n-1)
			adiciona(id);
		else {
		  Cell anterior = getPosicao(pos-1);
		  Cell nova = new Cell(id, anterior.getProx());
		  Cell atual = anterior.getProx();
		  nova.setAnterior(anterior);
		  anterior.setProx(nova);
		  atual.setAnterior(nova);
		  n++;
		  
		}
	}
	
	public void removeinicio()
	{
		primeria = primeria.getProx();
		n--;
		if(n==0)
			ultima=null;
	}

	public void removefinal() {
		ultima = ultima.getAnterior();
		ultima.setProx(null);
		n--;
		if(n==0)
		  ultima=null;
		
	}
	
	
	public void remove(int pos)
	{
		if(!this.posicaoOcupada(pos)){
			throw new IllegalArgumentException("Posição não existe");
			}
		if(pos == 0)
			removeinicio();
		if(pos == n-1)
			removefinal();
		else {
					Cell anterior = getPosicao(pos-1);
					Cell proxCell = anterior.getProx();
					Cell atual = proxCell.getProx();
					atual.setAnterior(anterior);
					anterior.setProx(atual);
					n--;
		}
		
	}
	
}
