
public class SelectionSort {

	public void printSelection() {
		
		int [] arr2 = {4,5,2,3,2,9};
		for(int i = 0; i < arr2.length; i++) {
			int compare = arr2[i];
			int j = i - 1;
			while(j >=0 && arr2[j] > compare) {
				arr2[j + 1] = arr2[j];
				j--;
			}
			arr2[j + 1] = compare; 
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
			System.out.print(" ");
		}
		

	}

}
