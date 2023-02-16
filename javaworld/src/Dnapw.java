import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.*;

public class Dnapw{
    static int S;
    static int P;
    static int answer;
    static String DNA;
    static HashMap<Character, int[]> hm = new HashMap<Character, int[]>();
    static char[] dna = {'A', 'C', 'G', 'T'};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        DNA = br.readLine();
        st = new StringTokenizer(br.readLine());

        for (char c : dna){
            hm.put(c, new int[] {0, Integer.parseInt(st.nextToken())});
        }

        for (int i=0; i<P; i++){
            hm.get(DNA.charAt(i))[0]++;
        }
        if(isFull()) answer++;

        for (int i=0; i<S-P; i++){
            hm.get(DNA.charAt(i))[0] --;
            hm.get(DNA.charAt(i+P))[0] ++;
            if(isFull()) answer ++;
        }
        System.out.println(answer);
    }
    public static boolean isFull(){
        for (char c : dna){
            if (hm.get(c)[0] < hm.get(c)[1]) return false;
        }
        return true;
    }
}

/*
 static 변수
 DNA.charAt(i) char의 값을 인덱스로 가져올때
 HashMap<Character, int[]> hm => list를 value로 가진 dictionary를 가져올때 
 함수 정의할때 retrun 값에 따라 boolean, void // public static boolean isFul
 for (char c : dna){} => char로 이루어져있는 list를 돌떄
 */