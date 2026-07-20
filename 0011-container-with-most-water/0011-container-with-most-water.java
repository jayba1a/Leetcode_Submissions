class Solution {
    public int maxArea(int[] height) {
        int a=0;
        int b=height.length-1;
        int maxWater=Integer.MIN_VALUE;//Integer.MIN_VALUE

        while(a<b){
            int cur=Math.min(height[a],height[b])*(b-a);
            maxWater=Math.max(cur,maxWater);
            if(height[a]>height[b])
            {
                b--;
            }
            else
            {
                a++;
            }
        }
        return maxWater;
    }
}