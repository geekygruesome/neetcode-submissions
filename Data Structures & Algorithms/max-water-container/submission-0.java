class Solution {
    public int maxArea(int[] heights) {
       int left=0;
       int right=heights.length-1;
       int maxWater=0;
       while(right>left){
        int width=right-left;
        int CurrentWater=Math.min(heights[left],heights[right])*width;
        maxWater=Math.max(CurrentWater,maxWater);
        if(heights[right]>heights[left]){
            left++;
        }else{
            right--;
        }
       }
       return maxWater;

    }
}
