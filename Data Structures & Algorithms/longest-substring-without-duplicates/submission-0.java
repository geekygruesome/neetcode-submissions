class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int MaxLen=0;
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(s.charAt(right))>1){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            MaxLen=Math.max(MaxLen,right-left+1);
            right++;
        }
        return MaxLen;
    }
}
