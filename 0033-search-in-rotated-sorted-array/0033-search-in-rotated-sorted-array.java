class Solution {

    static int pivotindex(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Case 1: mid is the peak element
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid - 1 is the peak element
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Left half is sorted, pivot is on the right
            if (arr[mid] >= arr[s]) {
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (target > nums[mid]) {
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        int pivot = pivotindex(nums);
        int n = nums.length;

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, 0, n - 1, target);
        }

        // Search in left half
        int s1 = 0;
        int e1 = pivot;

        if (target >= nums[s1] && target <= nums[e1]) {
            return binarySearch(nums, s1, e1, target);
        }

        // Search in right half
        int s2 = pivot + 1;
        int e2 = n - 1;

        if (s2 < n && target >= nums[s2] && target <= nums[e2]) {
            return binarySearch(nums, s2, e2, target);
        }

        return -1;
    }
}