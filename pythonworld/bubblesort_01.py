# -*- coding: utf-8 -*-

'''
bj 2750번 / 수 정렬하기1

숏코딩은 print(*sorted(map(int,[*open(0)][1:])))

print(*리스트나튜플) 은 리스트나 튜플을 나열시켜주지만 백준에서는 \w와 \n을 구분없이 정답처리하는것으로 보임?

주목할만한 점은 *open인데 
=> 0은 stdin, 1은 stdout, 2는 stderr에 각각 해당해서 그렇습니다.
   File descriptor를 공부해보시면 이해하는 데 도움이 될 겁니다.
라는 얘기가 있다

sys.stdin.readline()을 빠른 입력을 받기위해 사용해왔는데
open(0) 이 stdin이므로 open(0).read() = sys.stdin.read()
한 글자 입력은 open(0).read()로
list 입력은 open(0).read().split()으로 받으면 sys를 import하지 않아도 된다.

'''

import sys

N = int(sys.stdin.readline())

for i in sorted([int(sys.stdin.readline()) for _ in range(N)]):
    print(i)
    
