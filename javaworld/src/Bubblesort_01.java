import java.util.Scanner;
import java.io.*;

public class Bubblesort_01{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];
        for (int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        
        for (int k=0; k<n; k++){
            System.out.println(A[k]);
        }
        sc.close();
    }
}

/*
System.out.println(myQueue.poll());
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
bw.write(myQueue.poll());
bw.flush();

이 두개의 차이는 무엇일까

*/

