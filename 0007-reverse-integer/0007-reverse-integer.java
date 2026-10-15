class Solution {
    public int reverse(int x) {
        Boolean isNegative = x<0;
        if(isNegative){
            x=-x;
        }
        int rev=0;
        while(x>0){
            int d = x%10;
             if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            rev = rev*10+d;
            x = x/10;
        }
        int result = isNegative?-rev:rev;
    return result;
    }
}