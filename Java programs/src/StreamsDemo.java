import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String [] args) {
		
			List<String> Names=Arrays.asList("Sai","Ram", "Gopi", "Elive","Sarshi");
			
			List<String> result =Names.stream()
								 .filter(name -> name.startsWith("S"))
								 .map(String :: toUpperCase)
								 .toList();
			System.out.println(result);
	}

}
