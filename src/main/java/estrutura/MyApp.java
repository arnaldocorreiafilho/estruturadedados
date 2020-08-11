package estrutura;

public class MyApp {

	public static void main(String[] args) {
	LinkedList  l = new LinkedList();
	l.add(3);
	l.addInBegin(1);
	l.addInBegin(2);	
	//l.printLinkedList();// TODO Auto-generated method stub
	//System.out.println(l.getElement(1));
	l.addPos(1,200);
	l.printLinkedList();
	System.out.println();
	l.removerUltima();
	l.printLinkedList();
	System.out.println();
	DoubleList db = new DoubleList();
	db.adiciona(12);
	db.adiciona(13);
	db.adiciona(14);
	db.adiciona(13);
	db.adiciona(1,130);
	db.print();
	
	System.out.println();
	db.remove(1);
	db.print();
	
	
	System.out.println("Pilha");
	Pilha p = new Pilha();
	p.inserir(10);
	System.out.println(p.pop());
	System.out.println(p.vazia());
	
	System.out.println();
	String a =  "arnaldo";
	String b  = "zobo";
	
	

	}

}
