class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list=new ArrayList<>();
        String s=s1+" "+s2;
        String arr[]=s.split(" ");
        HashMap<String,Integer> map=new HashMap<>(); 
        for(String str:arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        String ans[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}