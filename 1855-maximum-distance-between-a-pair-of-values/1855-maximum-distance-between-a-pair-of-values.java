class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        
        int max=0;
        for(int i=0;i<nums1.length;i++){
            int l=i;
            int h=nums2.length-1;
            int best=i;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(nums2[mid]>=nums1[i]){
                    best=mid;
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            max=Math.max(max,best-i);
        }
        return max;
    }
}