import java.util.Enumeration;
import java.util.Vector;
	
public class VectorTest {
	public static void main(String args[]){
		Vector<String> vector = new Vector<String>();
		vector.add("test1");
		vector.add("test2");
		vector.add("test3");
		vector.add("test4");
		vector.add("test5");
		
		Enumeration<String> enumeration = vector.elements();
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}
	}
}