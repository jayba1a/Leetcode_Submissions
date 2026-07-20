class Solution {
public:
    int commonFactors(int a, int b) {
        int small=a;
        int count=0;
        if(small>b)
        small=b;
        for(int i=1;i<=small;i++){
            if(a%i==0&&b%i==0)
            {
                count++;
            }
        }
        return count;
    }
};