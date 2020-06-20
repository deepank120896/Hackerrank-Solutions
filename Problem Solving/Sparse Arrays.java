    
	// Time Complexity: O(N.Q)
	// Space Complexity: O(N)
	static int[] matchingStrings(String[] strings, String[] queries) {
        int count [] = new int[queries.length];
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(strings));

        for(int i=0;i<queries.length;i++){
            int c = Collections.frequency(al,queries[i]);
                count[i]+=c;
        }
        return count;
    }
	
	
	// Optimised Solution
	// Time Complexity: O(N+Q)
	// Space Complexity: O(N+Q)
    static int[] matchingStrings(String[] strings, String[] queries) {
        int count [] = new int[queries.length];
        HashMap<String,Integer> hm = new HashMap<>();
        
        // Pre-processing Data
        for(String s:strings){
            if(hm.containsKey(s))
                hm.put(s,hm.get(s)+1);
            else
                hm.put(s,1);
        }

        for(int i=0;i<queries.length;i++){
            if(hm.containsKey(queries[i]))
                count[i]=hm.get(queries[i]);
            else
                count[i]=0;
        }
        return count;
    }
	