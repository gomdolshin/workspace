import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.*;

public class Cardgame{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i=1; i<n+1; i++){
            myQueue.add(i);
        }
        

        while (myQueue.size() > 1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }

        System.out.println(myQueue.poll());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(myQueue.poll());
        bw.flush();
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