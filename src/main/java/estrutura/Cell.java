package estrutura;

public class Cell {
	
	private int data;
	private Cell prox;
	
	
	public Cell(int data, Cell prox) {
		super();
		this.data = data;
		this.prox = prox;
	}
	
	
	
	
	public Cell getProx() {
		return prox;
	}
	public void setProx(Cell prox) {
		this.prox = prox;
	}
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

}
