public class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        for(int i=0;i<s.length();i++){
            c ^= s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            c ^= t.charAt(i);
        }
        return c;
    }
}

public class Solution {
    public char findTheDifference(String s, String t) {
        int[] dic = new int[26];
        for(int i=0;i<s.length();i++){
            dic[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            dic[t.charAt(i)-'a']--;
            if(dic[t.charAt(i)-'a']<0) return t.charAt(i);
        }
        return 0;
    }
}