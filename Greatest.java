class ArrayLargestNumber
{
	public  int findLargest(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}


public class Main {
    public static void main(String[] args) {
    	ArrayLargestNumber aln=new ArrayLargestNumber();
    
        int[] arr = { 14, 2, 16, 20, 5};
        int n = arr.length;

        int largest =aln.findLargest(arr, n);
        System.out.println("Largest element is " + largest);
    }
}
