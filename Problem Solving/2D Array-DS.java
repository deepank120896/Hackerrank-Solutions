    
	// Time Complexity: O(N^2)
	// Space Complexity: O(1)
	static int hourglassSum(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

		// edge case, not a 3x3 matrix
        if(r<3 || c<3)
            return -1;

        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<r-2;i++){
            for(int j=0;j<c-2;j++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                max_sum = Math.max(max_sum,sum);
            } 
        }
        return max_sum;         
    }