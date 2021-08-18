import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Person, String> treeMap = new TreeMap<Person,String>((p1,p2)->p1.getAge()-p2.getAge());
	
treeMap.put(new Person("Charles", "Dickens", 60),"Charles");  
treeMap.put(new Person("Lewis", "Carroll", 42),"Lewis");  
treeMap.put(new Person("Thomas", "Carlyle", 51),"Thomas");  
treeMap.put(new Person("Charlotte", "Bronte", 45),"Charlotte");

System.out.println(treeMap.get(new Person("dfsdf", "sgfdsg", 61)));

//System.out.println(new Person("Charles", "Dickens", 60));
	}

}
