class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]==nums[j])
                {
                    flag=true;
                    return flag;
                }
            }
        }
        return flag;
    }
}