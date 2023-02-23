import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

import java.io.*;

public class Minval{
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Node> mydeque = new LinkedList<>();

        for (int i=0; i<N; i++){
            int now = Integer.parseInt(st.nextToken());

            while (!mydeque.isEmpty() && mydeque.getLast().value > now){
                mydeque.removeLast();
            }

            mydeque.addLast(new Node(now, i));

            if (mydeque.getFirst().index <= i -L){
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }
    static class Node{
        public int value;
        public int index;

        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}

/*
java에서 Deque의 사용법
1. LinkedList로 사용 => Deque<Node> mydeque = new LinkedList<>();
2. addFirst(), addLast(), removeFirst(), removeLast()와 같은 기본 값이 존재
3. deque.isEmpty()를 사용해 빈값 체크
4. deque의 Node라는 클래스를 생성하여 값을 가질수 있도록 유지, LinkedList에는 value랑 index가 존재한다


BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
=> 출력을 한번에 하기위해 BufferedWriter를 사용

 */