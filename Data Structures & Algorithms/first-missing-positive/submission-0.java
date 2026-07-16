class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums) set.add(n);
        int a=1;
        for(int i=0;i<nums.length;i++)
        {
            if (set.contains(a)) a++;
        }
        return a;
    } 
}