class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(num%2==0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int maxfreq=0;
        int maxNum=-1;
        for(int num:map.keySet()){
            if(map.get(num) > maxfreq || map.get(num)==maxfreq && num<maxNum){
                maxfreq=map.get(num);
                maxNum=num;
            }
        }
        return maxNum;
    }
}