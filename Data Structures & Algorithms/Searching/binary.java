public class BinarySearchExample {
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Best practice: prevents potential integer overflow 
            // compared to (left + right) / 2
            int mid = left + (right - left) / 2;
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        
        // Target was not found in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int targetValue = 23;

        int result = binarySearch(myArray, targetValue);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}