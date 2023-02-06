import java.util.*;
import java.io.*;

public class Prefixsum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[M];
        
        //System.out.print(Arrays.toString(A)); // Arrays.toString 1차배열에 대한 print

        int input = 1;
        int tot = 0;
        int r = 0;
        int cnt = 0;

        A[0] = input;

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++){
            
            tot += Integer.parseInt(st.nextToken());
            System.out.print(tot+ "\n");
            r = tot%M;
            A[r] += 1;
            System.out.print(r+ "\n");
            System.out.print(Arrays.toString(A) + "\n");            
        }
        System.out.print(Arrays.toString(A)); // Arrays.toString 1차배열에 대한 print
        //System.out.print(Arrays.toString(A));
        for (int i=1; i<A.length; i++){
            cnt += A[i]*A[i-1]/2;
        }

        System.out.print(cnt);
    }
}