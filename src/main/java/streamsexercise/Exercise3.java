package streamsexercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Exercise3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,4,6,18,7,9,12);
		Stream<Integer> numbersAsStream=numbers.stream();
		
//		MAX NUM
//		Integer maxNum = numbersAsStream.max(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println(maxNum);
		
//		MIN NUM
//		Integer minNum = numbersAsStream.min(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println(minNum);

//		REM ODD NUM
//		numbersAsStream.filter(x->x%2==0).forEach(x -> System.out.println(x));
		
//		REM EVEN NUM
//		numbersAsStream.filter(x->x%2!=0).forEach(x -> System.out.println(x));
		
//		FIND SUM OF LIST
//		System.out.println(numbersAsStream.reduce((a,b) -> a+b).get());
		
//		SQAURE EVERY NUM IN LIST THE REM EVEN NUMS AND FIND MIN VAL
//		System.out.println(numbersAsStream.map(x -> x * x).filter(x -> x % 2 != 0).min((a, b) -> Integer.compare(a, b)));

	}
}



