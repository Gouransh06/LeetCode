/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int pivot = -1;
        int left = 0;
        int right = mountainArr.length() - 1;

        // Binary Search to find pivot element!
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            }
             else {
                right = mid;
            }
        }
        
        pivot = left;
        left = 0;
        right = pivot;

        // Binary Search to find element in first half!
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = pivot;
        right = mountainArr.length() - 1;

        // Binary Search to find element in the second half!
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}