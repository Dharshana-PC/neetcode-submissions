class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new LinkedHashSet<>();
        int i=0;
        for(int n:nums) set.add(n);
        for(int s:set)
        {
            nums[i]=s;
            i++;
        }
        return i;
    }
}