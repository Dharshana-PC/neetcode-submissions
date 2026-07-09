class Solution {
    public boolean isPalindrome(String s) 
    {
        String str=s.toLowerCase();
        String c1="";
        String c2="";
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>='0' && str.charAt(i)<='9')||(str.charAt(i)>='a' && str.charAt(i)<='z'))
            {
                c1+=str.charAt(i);
            }
        }
        for(int i=c1.length()-1;i>=0;i--)
        {
            c2+=c1.charAt(i);
        }
        return c1.equals(c2);
    }
}
