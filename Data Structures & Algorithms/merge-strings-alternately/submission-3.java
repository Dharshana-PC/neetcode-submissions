class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int c=0;
        for(int i=0;i<word1.length()&&i<word2.length();i++)
        {
            ans+=word1.charAt(i);
            ans+=word2.charAt(i);
            c++;
        }
        if(word1.length()<word2.length())
        {
            for(int i=c;i<word2.length();i++) ans+=word2.charAt(i);
        }
        if(word1.length()>word2.length())
        {
            for(int i=c;i<word1.length();i++) ans+=word1.charAt(i);
        }
        return ans;
    }
}