
public class BubbleSort {

	public static void main(String[] args) {
		int arr [] = {3,2,4,6,2,1,6, 44, 6, 9, 89, 2, 4, 7, 77, 6, 2};
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0; j < arr.length -1; j++)
			{
				if (arr [j] > arr [j + 1] ) 
				{
					int temp = arr[j];
					arr [j] = arr[j+1];
					arr[j + 1] = temp;
					
					
				}
				
				
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" ");
			System.out.print(arr[i]);
		}

	}

}
