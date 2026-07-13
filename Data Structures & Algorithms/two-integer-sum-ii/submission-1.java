class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int nums[]=new int[2];
        while(l<r)
        {
            if(numbers[l]+numbers[r]==target)
            {
                nums[0]=l+1;
                nums[1]=r+1;
                break;
            }
            else if(numbers[l]+numbers[r]>target)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return nums;
    }
}
