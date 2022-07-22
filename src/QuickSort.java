
public class QuickSort {

	public static void main(String[] args) {

		int[] arr= {9,15,25,7,23,3,11};
		System.out.print("Array before sort ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		quicksort(arr, 0, arr.length -1);
		System.out.print("\nArray after sort ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void quicksort(int[] arr, int l, int h) {
		if(l < h) {
			int pi = partition(arr, l, h);
			quicksort(arr, l, pi-1);
			quicksort(arr, pi+1, h);
		}
	}
	
	public static int partition(int[] arr, int l, int h) {
		int pvt = arr[h];
		int i= l-1;
		
		for(int j=l;j<=h-1;j++) {
			if(arr[j]< pvt) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, h);
		return i+1;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
