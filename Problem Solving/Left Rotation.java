import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Time Complexity: O(n*d)
	// Space Complexity: O(1)
    static void rotate(int[] a,int d){
        int n=a.length;

        for(int i=0;i<d;i++){
            int temp = a[0];
            for(int j=0;j<n-1;j++)
                a[j]=a[j+1];
            a[n-1]=temp;
        }
    
        for(int item:a){
            System.out.print(item+" ");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
		
		// method to do 'd' rotations
        rotate(a, d);

        scanner.close();
    }
}
