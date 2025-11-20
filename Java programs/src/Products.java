import java.util.HashMap;
import java.util.Map;

public class Products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Map<Integer, String> Indmap= new HashMap<Integer, String>();
	  			Indmap.put(1,"Sai");
	  			Indmap.put(2, "Ram");
	  			Indmap.put(3, null);
	  			Indmap.put(3, null);
	  			Indmap.put(3, null);   // duplicate null  values can't stpre
	  			
	  	
	  			System.out.println(Indmap);
	  			
	}

}
