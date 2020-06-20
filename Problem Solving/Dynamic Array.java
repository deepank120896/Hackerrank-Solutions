import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution{

    List<Integer> seq  = new ArrayList<Integer>();
    List<List<Integer>> seqList = new ArrayList<List<Integer>>();
    int lastAnswer = 0;

    public Solution(int N){
        for(int i=0;i<N;i++){
            seq = new ArrayList<Integer>();
            seqList.add(seq);
        }
    }

    void append(int x,int y, int N){
        int row = (x^lastAnswer)%N;
        List<Integer> seq = seqList.get(row);
        seq.add(y);
    }

    void printValue(int x,int y,int N){
        int col = 0;
        int row = (x^lastAnswer)%N;
        List<Integer> seq = seqList.get(row);
        col = y%seq.size();
        lastAnswer = seq.get(col);
        System.out.println(lastAnswer);
    }
        
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        Solution sol = new Solution(N);

        for(int i=0;i<Q;i++){
            int query = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(query==1)
                sol.append(x,y,N);
            else
                sol.printValue(x,y,N);
        }
        sc.close();
    }    
}
