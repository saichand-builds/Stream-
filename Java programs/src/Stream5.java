import java.util.Arrays;
import java.util.List;

public class Stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list= Arrays.asList("One","23","Ram","8939","f","8493");
		
				list.stream()
					.filter(s->s.matches("\\d+"))
					.forEach(System.out::println);

	}

}
