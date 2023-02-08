import java.util.*;
import java.io.*;

public class Prefixsum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] A = new long[M];

        //int tot = 0;
        long r = 0;
        long cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++){
            
            r += Integer.parseInt(st.nextToken());
            //r = tot%M;
            r %= M;
            A[(int)r] += 1;            
        }
        cnt += A[0];
        //System.out.print(Arrays.toString(A)); // Arrays.toString 1차배열에 대한 print
        //System.out.print(A.length);
        for (int i=0; i< M; i++){
            cnt += (A[i]*(A[i]-1))/2;
        }

        System.out.print(cnt);
    }
}