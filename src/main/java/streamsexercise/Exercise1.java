package streamsexercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise1 {
	public static void main(String[] args) {
		List<String> names= Arrays.asList("Michael", "Dean", "James", "Chris");
		Stream<String> namesStream = names.stream();
		
		namesStream.filter(name -> !name.contains("James")).forEach(name -> System.out.println("Hello "+name));
	}

}
