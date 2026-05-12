class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            char ch=t.charAt(i);
            m1.put(c,m1.getOrDefault(c,0)+1);
            m2.put(ch,m2.getOrDefault(ch,0)+1);
        }
        return m1.equals(m2);
    }
}
