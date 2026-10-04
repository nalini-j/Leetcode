class Solution {
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long g=gcd(nums[i],nums[j]);
                long res=((long)nums[i]*nums[j])/(g*g);
                if(res>max){
                    max=res;
                }
            }
        }
        return max;
    }
}