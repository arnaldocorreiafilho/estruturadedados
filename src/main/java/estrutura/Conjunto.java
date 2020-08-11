package estrutura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




public class Conjunto {
	
	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	public void conjuntoEspelhamento()
	{
		// inicializa o conjunto para distribuir os dados de acordo com a inicial de cada palavra
		// exemplo poderia ser uma busca por números onde poderiamos delimitar os valores de 0 a 9 
		for(int i=0;i<26;i++)
		{
			LinkedList<String> e = new LinkedList<String>();
			tabela.add(e);
			
		}
		
		
	}
	public  int calculaIndiceDaTabela(String palavra)
	{
	    System.out.println(palavra.toLowerCase().charAt(0));
	    System.out.println();
		return palavra.toLowerCase().charAt(0) % 26;
	}
	
	public void adiciona(String palavra)
	{
		if(!this.contem(palavra))
		{
			int index = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(index);
			lista.add(palavra);
		}
	}
	
	public Boolean contem(String palaString)
	{
		int index = calculaIndiceDaTabela(palaString);
		List<String> l = tabela.get(index);
		return l.contains(palaString);
				
	}
	
	public void remove(String palavra)
	{
		if(this.contem(palavra))
		{
			int index = calculaIndiceDaTabela(palavra);
			List<String> l = tabela.get(index);
			l.remove(palavra);
		}
	}

}
