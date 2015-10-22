package par_generico_comparable;

public class TestParGenericoComparable {

	//El test no tiene que andar por querer instanciar una clase no comparable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParGenericoOrdenado <String, Integer> posiciones= new ParGenericoOrdenado<String, Integer>();
		ParGenericoOrdenado <Object, Object> noFunca= new ParGenericoOrdenado<Object, Object>();
		
		posiciones.put("Jorge", new Integer(1));
		System.out.println(posiciones.toString());
		noFunca(Object, Object);
	}
}
