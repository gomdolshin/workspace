/*

위의 코드는 책의 풀이이고
삽입정렬의 정수..인가?

아래의 코드는 python에서 내가 푼것을 대입한것

*/

import java.io.*;
import java.util.*;

public class Insertsort_01{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] S = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<N; i++){
            int insert_point = i;
            int insert_value = A[i];
            // 현재위치에서 삽입위치 찾기
            for (int j=i-1; j>=0; j--){
                if (A[j] < A[i]){
                    insert_point = j+1;
                    break;
                }
                if (j==0){
                    insert_point = 0;
                }
            }
            // 삽입을 위해 삽입위치에서 i까지 데이터를 한칸씩 뒤로 미루기
            for (int j=i; j>insert_point; j--){
                A[j] = A[j-1];
            }
            // 삽입
            A[insert_point] = insert_value;
        }
        S[0] = A[0];
        // 합배열 저장
        for (int i=1; i<N; i++){
            S[i] = S[i-1] + A[i];
        }
        int sum = 0;
        // 합배열의 값 모두 더하기
        for (int i=0; i<N; i++){
            sum += S[i];
        }
        System.out.println(sum);
    }
}

/*
import java.io.*;
import java.util.*;

public class Insertsort_01{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] S = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int tot = 0;
        int sum = 0;
        for (int i=0; i<N; i++){
            tot += A[i];
            sum += tot;
        }
        System.out.println(sum);
    }
}
*/