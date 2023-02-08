package person.aslam;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int a1[] = {-1, 0, 3, 5, 9, 12};
        System.out.println(bs.search(a1, 9) == 4);
        int a2[] = {};
        System.out.println(bs.search(a2, 9) == -1);
        int a3[] = {1};
        System.out.println(bs.search(a3, 9) == -1);
        int a4[] = {1};
        System.out.println(bs.search(a4, 1) == 0);
        int a5[] = {1,2};
        System.out.println(bs.search(a5, 1) == 0);
        int a6[] = {1,2};
        System.out.println(bs.search(a6, 2) == 1);
        int a7[] = {1,2};
        System.out.println(bs.search(a7, 3) == -1);
        int a8[] = {1,2,3};
        System.out.println(bs.search(a8, 2) == 1);
        int a9[] = {-1,0,3,5,9,12};
        System.out.println(bs.search(a9, 2) == -1);
        int a10[] = {5};
        System.out.println(bs.search(a10, -5) == -1);
        int a11[] = {2,5};
        System.out.println(bs.search(a11, 0) == -1);
    }
    public int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        } else {
            return recursiveSearch(nums, 0, nums.length - 1, target);
        }
    }

    public int recursiveSearch(int[] nums, int start, int end, int target) {
        int mid = (start + end) / 2;
        if (mid < 0 || mid >= nums.length || (start >= end && target != nums[mid])) {
            return -1;
        } else if (target == nums[mid]) {
            return mid;
        } else if ( target < nums[mid]) {
            return recursiveSearch(nums, start, mid - 1, target);
        } else if (target > nums[mid]) {
            return recursiveSearch(nums, mid + 1, end, target);
        }
        return -1;
    }
}
