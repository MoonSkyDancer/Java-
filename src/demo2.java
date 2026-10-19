public class demo2 {

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i=nums.length-1;i>=0;i--){
                for(int j=i-1;j>=0;j--){
                    if(nums[i]+nums[j]==target){
                        return new int[]{j, i};
                    }
                }
            }
            return new int[0];
        }
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        Solution solution=new Solution();
        int[] result=solution.twoSum(nums,target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
