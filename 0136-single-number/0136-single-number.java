class Solution {
    public int singleNumber(int[] nums) {
        /*if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];*/

        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}