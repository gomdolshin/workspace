# -*- coding: utf-8 -*-

'''
bj 17598번 / 오큰수 (stack & queue) 오른쪽에있으면서 큰수

1. print(*answer) 리스트나 튜플의 [], ()를 없이 출력
2. 손으로 코딩을 해봐야하는 이유중 하나

'''

import sys

# input = sys.stdin.readline

N = int(input())

input = sys.stdin.readline

A = list(map(int, input().split()))

stack = []
answer = [-1] * N

stack.append(0)
for i in range(1, N):
    while stack and A[stack[-1]] < A[i]:
        pop_stack = stack.pop()
        answer[pop_stack] = A[i]
    stack.append(i)
        
print(*answer)
    
    

        



