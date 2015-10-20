package stak_string;
import java.util.Iterator;

public class MeIterator implements Iterator<String> {
	private int actual;
	private int fin;
	private String[] stack_tmp;

	public MeIterator(String[] stack, int tamanio){
		actual= 0;
		fin= tamanio;
		stack_tmp= stack.clone();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(actual < fin)
			return true;
		return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String tmp= stack_tmp[actual];
		actual++;
		return tmp;
	}
	
}
