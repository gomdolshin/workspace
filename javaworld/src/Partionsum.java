import java.util.*;
import java.io.*;

public class Partionsum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N+1][N+1];
        int[][] D = new int[N+1][N+1];

        for (int i=1; i<N+1; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<N+1; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=1; i<N+1; i++){
            for (int j=1; j<N+1; j++){
                D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j];
            }
        }

        for (int k=1; k<M+1; k++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int ans = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            sb.append(ans + '\n');
        }
        System.out.print(sb);
    }
}