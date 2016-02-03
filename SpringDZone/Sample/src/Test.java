import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
		
public class Test {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("one");
		arrayList.add(0, "Zero");
		arrayList.addAll(arrayList);
		arrayList.addAll(1, arrayList);
		// arrayList.clear();
		
		System.out.println(arrayList.contains("one"));
		for (String string : arrayList)
			System.out.println(string);
		
		System.out.println(arrayList.containsAll(arrayList));
		arrayList.ensureCapacity(2);
		System.out.println();
		
		Iterator<String> it = arrayList.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		
		ListIterator<String> listIterator = arrayList.listIterator();		
		while(listIterator.hasNext()){
			System.out.println("vdcvcvcv"+listIterator.next());
		}
	}
}