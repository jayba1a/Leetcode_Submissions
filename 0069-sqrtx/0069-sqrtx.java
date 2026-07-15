class Solution {
    public int mySqrt(int x) {
        long l=1;
        long h=x;
        long ans=-1;
        if(x==0)
        {
            return 0;
        }
        while(l<=h)
        {
            long m=l+(h-l)/2;
            if(m*m>x){
                h=m-1;
            }
            else{
                ans=m;
                l=m+1;
            }
        }
        return (int) ans;
    }
}