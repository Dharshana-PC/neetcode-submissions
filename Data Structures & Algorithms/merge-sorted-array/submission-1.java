class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[nums1.length];
        int j=0;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]!=0) ans[i]=nums1[i];
            else 
            {
                if(j<nums2.length)
                {
                    ans[i]=nums2[j];
                    j++;
                }
                
            }
        }
        for(int i=0;i<nums1.length;i++) nums1[i]=ans[i];
        Arrays.sort(nums1);
    }
}