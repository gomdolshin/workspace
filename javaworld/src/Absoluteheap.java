/*
1. if 문이 최하위 레벨이라면 중괄호는 생략
2. PriorityQueue는 java.util에 포함되어있음
3. 
    if (first_abs == second_abs)
        return o1 > o2 ? 1 : -1;

    와 같이 return의 결과가 쓰인다는것을 기억할것
*/

import java.util.PriorityQueue;
import java.io.*;

public class Absoluteheap{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
       
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if (first_abs == second_abs)
                return o1 > o2 ? 1 : -1;
            else
                return first_abs - second_abs;
        });
        for (int i=0; i<n; i++){
            int request = Integer.parseInt(br.readLine());
            if (request == 0){
                if (myQueue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(myQueue.poll());
            }
            else{
                myQueue.add(request);
            }
        }
    }
}

