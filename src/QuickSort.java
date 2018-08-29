
public class QuickSort {
	
	public void printQuick() {
		int arr4 [] = {3,2,2,4,1};
		int i = 0, j = arr4.length-1; // i = left, j = right;
		int pivot = (arr4[i] + arr4[j]) / 2;
		
		while(i <=j) {
			while(arr4[i] < pivot)
				i++;
			while(arr4[j] > pivot)
				j--;
			if(i <= j) {
				int temp = arr4[i];
				arr4[i] = arr4[j];
				arr4[j] = temp;
				i++;
				j--;
			}
			
		}
		System.out.println(arr4[i]);
		
	}

}
