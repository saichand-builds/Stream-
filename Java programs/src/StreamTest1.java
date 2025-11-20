import java.util.Arrays;
import java.util.List;

public class StreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<String> Names =Arrays.asList("A1","B1","B2","A2","A3","A5");
			List<String> Result	=Names.stream()
								.filter(name -> {System.out.println("Filtering :: "+ name);
								return name.startsWith("A");})
								.limit(2)
								.toList();
			
			System.out.println("Output"+ Result);
								
								
								

	}

}
