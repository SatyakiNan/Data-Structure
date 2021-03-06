package data;
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {7, 55, 1, -22, 20, 35, -15};
		
		mergeSort(intArray, 0, intArray.length);
		
		for (int i =0; i< intArray.length; i++) {
			
			System.out.println(intArray[i]);
				
		}
		
	}
		public static void mergeSort(int[] input, int start, int end) {
		
		if(end - start < 2) {
			
			return;
		}
		
		int mid = (start + end)/2;
		mergeSort(input,mid,end);
		mergeSort(input,start,mid);
		merge(input,start,mid,end);
	}



	private static void merge(int[] input, int start, int mid, int end) {
		
		if (input[mid -1] >= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end - start];
		while (i < mid && j< end) {
			
			temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input [j++];
		}
		
		
		System.arraycopy(input, i, input, start + tempIndex, mid - i);// right most index
		System.arraycopy(temp, 0, input, start, tempIndex);
			
					
	}
		 
}