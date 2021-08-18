import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AllListClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ArrayList
		List<String> l = Arrays.asList("rakesh","Payal","Rajesh");
		List<String> linkedList = new LinkedList<String>();
		
		linkedList.addAll(l);
//		linkedList.add
		System.out.println("linkedlist >> "+linkedList);
		
	Vector vector = new Vector<String>();
	vector.addAll(l);
	
	System.out.println("vector >> "+vector);
	
	Stack<String> stack = new Stack<String>();
	stack.addAll(l);
	stack.push("jdfh");
	stack.pop();
	System.out.println("stack >> "+stack);
	
	
	
//	vector.add
	}

}
