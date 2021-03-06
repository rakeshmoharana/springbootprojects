import java.util.Iterator;
import java.util.TreeSet;

//import Person;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> set=new TreeSet<>( (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName())); 
//		, ,
//		new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
//		new Person("Matthew", "Arnold", 39)
		set.add(new Person("Charles", "Dickens", 60));  
		set.add(new Person("Lewis", "Carroll", 42));  
		set.add(new Person("Thomas", "Carlyle", 51));  
		set.add(new Person("Charlotte", "Bronte", 45));  

		set.add(new Person("Matthew", "Arnold", 39));  
		//traversing elements  
		Iterator<Person> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		
	}

}
