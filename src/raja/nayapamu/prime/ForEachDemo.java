package raja.nayapamu.prime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		List<String> listOfName=new ArrayList<>();
		listOfName.add("Raja");
		listOfName.add("nayapamu");
		listOfName.add("john");
		listOfName.add("peter");
		
		//normal foreach 
		for(String s:listOfName) {
			System.out.println("Normal ForEachLoop::"+s);
		}
		
		//using java8
		listOfName.stream().forEach(t->System.out.println("Using Java8::"+t));
		
		Map<Integer,String> mapObject=new HashMap<>();
		mapObject.put(1,"Raja");
		mapObject.put(2, "John");
		mapObject.put(3, "Jacob");
		mapObject.put(4, "Daniel");
		
		mapObject.forEach((key,value)->System.out.println("key::"+key +"Value::"+value));
		
		mapObject.entrySet().stream().forEach(obje->System.out.println("Using Java8::"+obje));
		
	}

}
