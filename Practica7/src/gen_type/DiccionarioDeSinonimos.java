package gen_type;
import java.util.*;

public class DiccionarioDeSinonimos {
	Map<String, List<String>> sinMap= new HashMap<String, List<String>>();
	
	public void inciar(){
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		List<String> l3 = new ArrayList<String>();
		List<String> l4 = new ArrayList<String>();
		l1.add("asiento");
		l1.add("butaca");
		l1.add("silla");
		l2.add("edificación");
		l2.add("inmueble");
		l2.add("hogar");
		l2.add("obra");
		l3.add("ejemplar");
		l3.add("manual");
		l3.add("texto");
		l3.add("obra");
		l4.add("equipo");
		l4.add("ordenador");
		l4.add("pc");
		sinMap.put("sillón", l1);
		sinMap.put("casa", l2);
		sinMap.put("libro", l3);
		sinMap.put("computador", l4);
	}

	public void getSinonimos(String pal){
		if(sinMap.containsKey(pal)){
			sinMap.get(pal).toString();
		}
	}
}
