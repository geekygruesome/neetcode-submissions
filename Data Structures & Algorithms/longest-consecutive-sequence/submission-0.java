class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int largest=0;
        int current;
        int length;
        for(int num:set){
            if(!set.contains(num-1)){
                current=num;
                length=1; 

                while(set.contains(current+1)){
                current=current+1;
                length++;
            }
            largest=Math.max(largest,length);
            }
            
        }
        
        return largest;
    }
}
