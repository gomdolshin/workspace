import java.util.*;
import java.io.*;

public class Consum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int count = 0;

        int i = 0;
        int j = N-1;

        int [] sum = new int [N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int a=0; a<N; a++){
            sum[a] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sum);
        while (i < j){
            if (sum[i] + sum[j] > M){
                j--;
            }else if (sum[i] + sum[j] < M){
                i++;
            }else{
                i++;
                j--;
                count++;
            }
        }
        System.out.print(count);
        
    }
}

// public class Consum{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
        
//         int N = Integer.parseInt(st.nextToken());

//         int sum = 1;
//         int count = 1;

//         int start_index = 1;
//         int end_index = 1;

//         while (end_index != N){
//             if (sum > N){
//                 sum -= start_index;
//                 start_index += 1;
//             }else if (sum < N){
//                 end_index += 1;
//                 sum += end_index;
//             }else{
//                 end_index += 1;
//                 sum += end_index;
//                 count += 1;
//             }
//         }
//         System.out.print(count);
        
//     }
// }