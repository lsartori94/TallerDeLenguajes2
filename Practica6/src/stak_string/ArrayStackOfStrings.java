package stak_string;

import java.util.Iterator;

public class ArrayStackOfStrings implements Iterable<String>{
	private String[] stack;
	private int cargados;

	public ArrayStackOfStrings(){
		stack= new String[Integer.MAX_VALUE];
		cargados= 0;
	}

	public ArrayStackOfStrings(int max){
		stack= new String[max];
		cargados= 0;
	}

	public boolean isEmpty(){
		if(cargados != 0)
			return false;
		return true;
	}

	public void push(String item){
		if(isEmpty()){
			stack[0]= item;
			cargados++;
		}
		else if(cargados < stack.length){
			for(int i= cargados; i >0; i--){
				stack[i]= stack[i-1];
			}
			stack[0]= item;
			cargados++;
		}
	}

	public String pop(){
		if(!isEmpty()){
			String tmp= stack[0];
			for(int i= 0; i < cargados; i++){
				stack[i]= stack[i+1];
			}
			cargados--;
			return tmp;
		}
		return "error";
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new MeIterator(stack, cargados);
	}
}
