package person.aslam;

public class TwoSum {

    public static void main(String[] args) {
        int[] myArray = {3,2,4};
        int[] result = new TwoSum().twoSum(myArray, 6);
        System.out.println(result[0] + " - " + result[1]);
    }
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            System.out.println(i);
            for(int j=0; j<nums.length; j++) {
                System.out.println(j);
                System.out.println(nums[i] + nums[j]);
                if(i != j && nums[i] + nums[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        int[] result = {};
        return result;
    }
}
