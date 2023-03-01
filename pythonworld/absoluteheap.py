# -*- coding: utf-8 -*-

'''
bj 11286번 / 절대값 힙

abs heap
우선순위 큐를 만드는 법
heappush할때 튜플 형태로 (abs(x), x)로 넣어주는게 포인트

'''

import sys

# input = sys.stdin.readline
import heapq

N = int(sys.stdin.readline())

answer = []

for _ in range(N):
    x = int(sys.stdin.readline())
    if x == 0:
        if answer:
            print(heapq.heappop(answer)[1])
        else:
            print(0)
    else:
        heapq.heappush(answer, (abs(x), x))
        