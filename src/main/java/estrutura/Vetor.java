package estrutura;



public class Vetor<T> {
	
	@SuppressWarnings("unchecked")
	private T[] t =  (T[])new Object[100];
	
	private int numberOfObects = 0;
	public void add(T t)
	{
		this.allocSpace();
		this.t[numberOfObects] = t;
		this.numberOfObects++;
		
	}
	
	public int getSize()
	{
		return this.numberOfObects;
	}
	
	public Boolean exist(T t)
	{
		for(int i = 0 ; i< numberOfObects ; i++)
		{
			if(this.t[i].equals(t))
			{
				return true;
			}
		}
		return false;
	}
	
	public T getByPosition(int position) throws Exception
	{
		if(!validPosition(position))
		{
			throw new Exception();
		}
		return this.t[position];
	}
	
	private Boolean validPosition(int pos)
	{
		return pos >= 0 && pos < numberOfObects;
	}
	
	public void add(int position , T t) throws Exception
	{
		if(!isOcupedPosition(position))
		{
			throw new Exception();
		}
		this.allocSpace();
		for(int  i = numberOfObects -1 ; i >= position;i--) {
			this.t[i+1] =  this.t[i];
		}
		
		this.t[position] = t;
		numberOfObects++;
		
	}

	private boolean isOcupedPosition(int position) {
		// TODO Auto-generated method stub
		return position > 0 && position <= numberOfObects;
	}
	
	public void remove(int index) throws Exception {
		
		
		if(!validPosition(index))
		{
			throw new Exception();
		}// TODO Auto-generated method stub
		
		for(int i = 0 ; i < numberOfObects - 1; i++)
		{
			t[i]  = t[i+1];
		}

		numberOfObects--;
		
	}
	
	private void allocSpace()
	{
		if(t.length ==  numberOfObects)
		{
			@SuppressWarnings("unchecked")
			T[] newt =  (T[])new Object[t.length * 2];
			
			for(int i = 0 ; i < t.length; i++)
			{
				
				newt[i] =  t[i];
			}
			
			t = newt;
			
		}
	}

}
