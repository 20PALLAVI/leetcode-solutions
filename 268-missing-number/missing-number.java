class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long expectedSum=(long) n*(n+1)/2;
        long actualSum = 0;
        for(int i =0; i<=n-1;i++){
            actualSum += nums[i];
        }
        return (int) (expectedSum-actualSum);
    }
}