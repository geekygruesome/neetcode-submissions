class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i+1);
        }
        for(int i=0;i<numbers.length;i++){
            int required=target-numbers[i];
            if(map.containsKey(required)){
                return new int[]{i+1,map.get(required)};
            }
        }
        return new int[2];
    }
}
