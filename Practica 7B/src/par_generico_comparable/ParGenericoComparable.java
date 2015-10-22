package par_generico_comparable;

public class ParGenericoComparable<K extends Comparable, V extends Comparable>{
	
	private K param1;
	private V param2;
	
	public K getParam1() {
		return param1;
	}
	private void setParam1(K param1) {
		this.param1 = param1;
	}
	public V getParam2() {
		return param2;
	}
	private void setParam2(V param2) {
		this.param2 = param2;
	}
	
	public void setParams(K p1, V p2){
		setParam1(p1);
		setParam2(p2);
	}

	public String toString(){
		return param1.toString()+ " " +param2.toString();
	}
}
