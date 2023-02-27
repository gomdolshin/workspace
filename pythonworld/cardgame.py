# -*- coding: utf-8 -*-

'''
bj 2164번 / 카드게임

list를 썻을땐 시간초과이던것이 deque를 쓸땐 시간초과가 없다

'''

from collections import deque

N = int(input())

A = deque([i for i in range(1, N+1)])

while len(A) > 1:
    A.popleft()
    res = A.popleft()
    A.append(res)

print(A[0])



# import sys

# input = sys.stdin.readline

N = int(input())

A = [i for i in range(1, N+1)]

while len(A) > 1:
    #print(A)
    res = A.pop(0)
    res = A.pop(0)
    A.append(res)

print(A[0])
