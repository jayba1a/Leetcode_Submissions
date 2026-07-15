class Solution {
    public boolean check(int[] piles,int m,int h)
    {
        int count=0;
        for(int i=0;i<piles.length;i++)
        {
            count+=Math.ceil((double)piles[i]/m);
        }
        return count<=h;
    }

    public int maxbanana(int[] piles){
        int max=piles[0];
        for(int i=1;i<piles.length;i++)
        {
            if(max<piles[i])
            {
                max=piles[i];
            }
        }
        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=maxbanana(piles);
        int ans=-1;
        while(low<=high)
        {
            int m=low+(high-low)/2;

            if(check(piles,m,h))
            {
                high=m-1;
                ans=m;
            }
            else{
                low=m+1;
            }
        }
        return ans;


    }
}