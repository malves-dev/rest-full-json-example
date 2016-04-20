package collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

public class User {
	
	
	private String name;
	private GregorianCalendar birth;
	private int age;
	
	static final Comparator<User> CERTIFICATE_DATE = new Comparator<User>() {
		 public int compare(User e1, User e2) {
			 return e1.getBirth().compareTo(e2.getBirth());
		 }
	};
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the birthy
	 */
	public GregorianCalendar getBirth() {
		return birth;
	}
	
	/**
	 * @param birthy the birthy to set
	 */
	public void setBirth(GregorianCalendar birth) {
		this.birth = birth;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void sort(List<User> list){
		Collections.sort(list, CERTIFICATE_DATE);
	}
}
