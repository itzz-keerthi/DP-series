class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return f(dp,nums.length-1,nums);
    }
    public int f(int[] dp,int ind,int[] nums){
        if(ind==0){
            return nums[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){return dp[ind];}
        int pick = nums[ind] + f(dp,ind-2,nums);
        int notpick= 0 + f(dp,ind-1,nums);
        return dp[ind]=Math.max(pick,notpick);
    }
}

/*
TC: O(N)  SC:O(N)+O(N)
*/
