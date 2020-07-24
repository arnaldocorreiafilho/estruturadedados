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
	System.out.println(l.existElement(200));
	System.out.println(l.getTamanho());

	}

}
