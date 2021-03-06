    
	// Time Complexity: O(logN)
	// Space Complexity: O(1)
	static int[] reverseArray(int[] a) {
        int n = a.length;

        for(int i=0;i<n/2;i++){
            int temp = a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        return a;
    }