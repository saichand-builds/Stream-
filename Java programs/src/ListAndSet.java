import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListAndSet {
	
	public static void main(String[] args) {
		
		List<String> lst = new  LinkedList<String>();
		
		lst.add("Red");
		lst.add("Yeslo");
		lst.add("opm");
		lst.add(null);
		
		System.out.println(lst);
		
		Set<String> set= new HashSet<String>();
		
		set.add(null);
		set.add("hfdh");
		
		System.out.println(set);
		
		
		
		
	}

}
