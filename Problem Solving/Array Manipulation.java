    // Time Complexity: O(m+n)
	// Space Complexity: O(1)
	
	// Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long []arr = new long[n+2];

        for(int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            
            arr[a]+=k;
            arr[b+1]-=k;
        }

        // prefix sum and max calculation
        long max = Long.MIN_VALUE;
        for(int i=1;i<=n;i++){
            arr[i]=arr[i]+arr[i-1];
            max = Math.max(arr[i],max);
        }
        return max;
    }