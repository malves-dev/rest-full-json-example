package collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author MarioS
 *
 */
public class Collection {
	
	static final Comparator<User> CERTIFICATE_DATE = new Comparator<User>() {
		 public int compare(User e1, User e2) {
			 return e1.getBirth().compareTo(e2.getBirth());			 
		 }
	};
	
	public static void main(String[] args) {		
        List<User> list =  popule();
        list.sort(CERTIFICATE_DATE);
        User user = list.get(0);
		System.out.println(user.getName());
	  }
	
	/**
	 * @return list
	 */
	public static List<User> popule (){
			
        List<User> list = new ArrayList<User>(); 
		
		User sofia = new User();
		sofia.setName("Sofia P Alves");
		sofia.setAge(26);
		sofia.setBirth(new GregorianCalendar(1989, 2, 11));
		list.add(sofia);
		
		User thiago = new User();
		thiago.setName("Thiago P Alves");
		thiago.setAge(55);
		thiago.setBirth(new GregorianCalendar(1985, 6, 2));
		list.add(thiago);
		
		User arlete = new User();
		arlete.setName("Arlete A P Alves");
		arlete.setAge(55);
		arlete.setBirth(new GregorianCalendar(1961, 3, 17));
		list.add(arlete);
		
		User mario = new User();		
		mario.setName("Mario Sergio Alves");
		mario.setAge(56);
		mario.setBirth(new GregorianCalendar(1960, 2, 2));
		list.add(mario);
		
		User santina = new User();		
		santina.setName("Santina L C Alves");
		santina.setAge(56);
		santina.setBirth(new GregorianCalendar(1939, 4, 28));
		list.add(santina);
		
		return list;
	}


}
