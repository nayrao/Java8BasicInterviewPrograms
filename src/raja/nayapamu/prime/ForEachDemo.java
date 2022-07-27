package raja.nayapamu.prime;

import java.util.ArrayList;
import java.util.List;

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
		
	}

}
