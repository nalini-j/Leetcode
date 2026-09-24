class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int c=0;
            while(nums[i]>0){
                c+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            if(i==c){
                return i;
            }
        }
        return -1;
    }
}