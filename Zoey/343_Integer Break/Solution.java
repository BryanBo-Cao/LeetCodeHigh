public class Solution {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int mod = n%3;
        if(mod==0) return (int) Math.pow(3,n/3);
        if(mod==1) return 4* (int) Math.pow(3,(n-4)/3);
        else return 2*(int)Math.pow(3,(n-2)/3);
    }
}