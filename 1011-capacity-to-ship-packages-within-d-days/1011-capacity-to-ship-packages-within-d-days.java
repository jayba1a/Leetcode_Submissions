class Solution {

    public boolean check(int[] weights, int days, int capacity) {
    int currentLoad = 0;
    int requiredDays = 1;

    for (int w : weights) {
        if (currentLoad + w > capacity) {
            requiredDays++;
            currentLoad = 0;
        }
        currentLoad += w;
    }

    return requiredDays <= days;
}

    public int findMaxSum(int[] weights, int days) {
        // Edge cases
        int sum=0;
            for(int i=0;i<weights.length;i++)
            {
                sum+=weights[i];
            }
            return sum;
    }

    public int findMax(int[] weights){
        int cur=weights[0];
        for(int i=1;i<weights.length;i++)
        {
            if(weights[i]>cur)
            cur=weights[i];
        }
        return cur;

    }


    public int shipWithinDays(int[] weights, int days) {
        if(days==1)
        {
            int sum=0;
            for(int i=0;i<weights.length;i++)
            {
                sum+=weights[i];
            }
            return sum;
        }
        int low = findMax(weights);
        int high=findMaxSum(weights, days);

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}