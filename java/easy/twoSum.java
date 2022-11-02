class twoSum {
    public int[] returnTwoSum(int[] nums, int target) {
        int indx1 = 0, indx2 = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    indx1 = i;
                    indx2 = j;
                } 
            }
        }
        int[] ans = {indx1, indx2};
        return ans;
    }
}