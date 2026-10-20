class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int ans[]=new int[arr.length];
        for(int num:arr){
            set.add(num);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        /*for(int i=0;i<list.size();i++){
            for(int j=0;j<arr.length;j++){
                if(list.get(i)==arr[j]){
                    ans[j]=i+1;
                }
            }
        }
        return ans;*/
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}