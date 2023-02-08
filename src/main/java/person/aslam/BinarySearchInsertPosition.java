package person.aslam;

public class BinarySearchInsertPosition {

    public static void main(String[] args) {
        BinarySearchInsertPosition bs = new BinarySearchInsertPosition();
        int a1[] = {1,3,5,6};
        System.out.println(bs.search(a1, 5) == 2);
        int a2[] = {1,3,5,6};
        System.out.println(bs.search(a2, 2) == 1);
        int a3[] = {1,3,5,6};
        System.out.println(bs.search(a3, 7) == 4);
        int a4[] = {1,3,5,6};
        System.out.println(bs.search(a4, 0) == 0);
/*        int a5[] = {1,2};
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
        System.out.println(bs.search(a11, 0) == -1);*/
    }
    public int search(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        if(nums.length >= 1) {
            return nums.length;
        }
        return 0;
    }

}
