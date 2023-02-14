import java.util.*;
import java.io.*;

public class Pointersum{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
      
        long [] sum = new long [N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int a=0; a<N; a++){
            sum[a] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(sum);

        
        System.out.print(Arrays.toString(sum) + "\n");
        for (int k=0; k<N; k++){
            long find = sum[k];
            int i = 0;
            int j = N-1;
            while (i < j){
                System.out.print(i + " ");
                System.out.print(j + " ");
                System.out.print(find + "\n");
                // if (sum[i] + sum[j] == find){
                //     if (i != k && j != k){
                //         count++;
                //         break;
                //     }else if (i == k){
                //         i++;
                //     }else if (j == k){
                //         j--;
                //     }
                // }
                // else if (sum[i] + sum[j] < find){
                //     i++;
                // }else{
                //     j--;
                // }

                if (sum[i] + sum[j] > find){
                    j--;
                }else if (sum[i] + sum[j] < find){
                    i++;
                }else
                    {
                        if (i != k && j != k){
                            count++;
                            break;
                        }else if (i == k){
                            i++;
                        }else if (j == k){
                            j--;
                        }
                    }
            }
        }

        System.out.print(count);
        br.close();
    }
}