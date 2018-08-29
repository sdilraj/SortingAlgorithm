
public class SelectionSort {

	public void printSelection() {
		
		int a7[] = {5,4,3,5,33,9};
		for(int i = 0; i <= a7.length; i++) {
			int min = i;
			for(int j = i+1; j < a7.length-1; j++ ) {
				if(a7[j] < a7[min])
					min = j;
				int temp = a7[min];
				a7[min] = a7[i];
				a7[i] = temp;
				
			}
		}
		for(int i = 0; i < a7.length; i++)
			System.out.println(a7[i]);
	}

}
