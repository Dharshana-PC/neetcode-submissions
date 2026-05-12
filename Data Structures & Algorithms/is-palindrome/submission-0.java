
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        String temp="";
        for(int i=s.length()-1;i>=0;i--)
        {
            temp+=s.charAt(i);
        }
        if(temp.equals(s)) return true;
        return false;
    }
}
