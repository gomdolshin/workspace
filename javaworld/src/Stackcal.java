import java.util.Scanner;
import java.util.Stack;

import java.io.*;

public class Stackcal{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] arr = new int [N];

        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();

        int cnt = 1;
        boolean result = true;
        for (int i=0; i<arr.length; i++){
            int su = arr[i];
            if (su >= cnt){
                while (su >= cnt){
                    stack.push(cnt++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else {
                int n = stack.pop();
                if (n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
        sc.close();
    }
}

/*


 */