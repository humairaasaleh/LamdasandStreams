package streamsexercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise2 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,4,7,8,12);
		Stream<Integer> numbersAsStream=numbers.stream();
		
		int multiply = numbersAsStream.reduce((num1,num2)->num1*num2).get();
		System.out.println(multiply);
	}

}
