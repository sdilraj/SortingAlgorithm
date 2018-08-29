import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//BubbleSort bs = new BubbleSort();
		//bs.printBubble();
				
		
		//InsertionSort is = new InsertionSort();
		//is.printInsertion();
		
		
	// no bueno //SelectionSort ss = new SelectionSort(); 
	//ss.printSelection();
		
		// no bueno // QuickSort qs = new QuickSort();
		//qs.printQuick();
		
		

		List<String> al = new ArrayList<>();
		for(int i = 0; i< 12; i++) {
			al.add(String.valueOf(i));
		}
		
		int size = (int) Math.ceil(al.size() / 5.0);
		System.out.println(al);
		
		
		
		
	}

}
