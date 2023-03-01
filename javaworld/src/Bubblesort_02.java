/*
1. class mData implements Comparable<mData>
=> mData라는 implements Comparable 클래스를 추가하여 정렬하는 class를 생성
=> 객체의 정렬 기준을 명시하는 두가지 방법중 하나
    - Interface Comparable
      1) 기본적으로 적용되는 정렬 기준이 되는 메서드를 정의하는 인터페이스
      2) 정렬할 객체에 Interface Comparable를 implements한 후, comapreTo()
         메서드를 @override(오버라이드) 하여 사용
      3) 예시 : Integer, Double등의 오름차순 정렬, String의 사전정렬
      4) compareTo() 메서드 작성법
        현재 객체 < 파라미터로 넘어온 객체: 음수 리턴
        현재 객체 == 파라미터로 넘어온 객체: 0 리턴
        현재 객체 > 파라미터로 넘어온 객체: 양수 리턴
        음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.

    - Interface Comparator
      1) 기본적으로 적용되는 정렬 기준과 다르게 정렬하고싶을때 정의하는 인터페이스
        * 오름차순을 내림차순정렬할때 많이 사용
      2) 정렬할 객체에 Interface Comparator를 implements한 후, compare()
         메서드를 @override(오버라이드) 한 myComparator class를 사용
    
      3) compare() 메서드 작성법
        첫 번째 파라미터로 넘어온 객체 < 두 번째 파라미터로 넘어온 객체: 음수 리턴
        첫 번째 파라미터로 넘어온 객체 == 두 번째 파라미터로 넘어온 객체: 0 리턴
        첫 번째 파라미터로 넘어온 객체 > 두 번째 파라미터로 넘어온 객체: 양수 리턴
        음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.

    References : https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html
*/

import java.util.Arrays;
import java.io.*;

public class Bubblesort_02{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        mData[] A = new mData[n];
        for (int i=0; i<n; i++){
            A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(A);

        int max = 0;
        for (int i=0; i<n; i++){
            if (max < A[i].index -i)
                max = A[i].index -i;
        }
        
        System.out.println(max + 1);
    }
}

class mData implements Comparable<mData>{
    int value;
    int index;

    public mData(int value, int index){
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o){ //value기준으로 오름차순 정렬하기
        return this.value - o.value;
    }
}

