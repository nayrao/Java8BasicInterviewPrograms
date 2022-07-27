package raja.nayapamu.prime;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8PrimeExample {
	
	
	
	public static void main(String[] args) {
		
		List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9,20);
		System.out.println(numbers.stream()
				.filter(Java8PrimeExample::isPrime)
				.collect(Collectors.toList())
				);
		}
	public static boolean isPrime(int number) {
		//return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0) ;
		
		return IntStream.rangeClosed(2, number/2).noneMatch(i->number%i==0);
		
	}

}
