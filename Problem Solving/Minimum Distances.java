// Algorithms > Minimum Distances

// We define the distance between two array values as the number of indices between the two values. 
// Given a,find the minimum distance between any pair of equal elements in the array. If no such value exists, print -1 .

// For example, if a=[3,2,1,2,3], there are two matching pairs of values: 3 and 2
// The indices of the 3's are 0 and 4, so their distance is |4-0|. 
// The indices of the 2's are 1 and 3, so their distance is |3-1|.
// Answer is: min(2,4) = 2


// Time Complexity: O(n)
// Space Complexity: O(n)


    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {

        int minDistance = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<a.length;i++){
            int current = i;
			// if value present in map
            if(hm.containsKey(a[i])){
                int previous = hm.get(a[i]);
                int diff = Math.abs(current-previous);
                minDistance = Math.min(diff,minDistance);
            }
            else
				// if value not in map
                hm.put(a[i],i);
        }
		
		// if no element occured twice
        if(minDistance == Integer.MAX_VALUE)
            return -1;
		
        return minDistance;
    }
