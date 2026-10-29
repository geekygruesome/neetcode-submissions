class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int right=n-1;
            int left=i+1;
            while(left<right){
                int sum=nums[right]+nums[left]+nums[i];
                if(sum==0){
                    List<Integer>l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[left]);
                    l1.add(nums[right]);
                    result.add(l1);
                    left++;
                    right--;

                    while(right>left && nums[left]==nums[left-1]){
                    left++;
                }
                while(right>left && nums[right]==nums[right+1]){
                    right--;
                }
                }
                else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
