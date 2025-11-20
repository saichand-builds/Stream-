import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 =Arrays.asList("Java","Spring","SpringMVC","Spring Data Jpa");
		List<String> list2 =Arrays.asList("Collection", "Java", "SpringMVC","Micro","React");
		
		 List<String>  List3= list1
				              .stream()
				              .filter(list2 :: contains)
				              .collect(Collectors.toList());
		 
		 System.out.println(List3);
		

	}

}
