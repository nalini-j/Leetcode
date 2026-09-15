class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            int c=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==num){
                    c++;
                }
            }
            if(c==nums.length/2){
                return num;
            }
        }
        return -1;
    }
}