# -*- coding: utf-8 -*-

'''
bj 11003번 / 슬라이딩 윈도우
deque의 pop과 popleft를 사용하는것

print(end=' ') print의 default end='\n'

'''
from collections import deque

import sys

input = sys.stdin.readline

N, L = list(map(int, input().split()))

D = list(map(int, input().split()))

arr = deque()
for i in range(N):
    tmp = D[i]
    
    while arr and arr[-1] > tmp: arr.pop()
    arr.append(tmp)
    
    if i >= L and arr[0] == D[i-L]: arr.popleft()
    print(arr[0], end=' ')
    
    






'''
시간초과로 인한 실패
'''

# end_idx = 0

# min_list = []
# while end_idx < N:
#     start_idx = end_idx - L + 1
#     if start_idx < 0: start_idx = 0
#     Di = D[start_idx:end_idx+1]
#     min_val = min(Di)    
#     end_idx += 1
    
#     min_list.append(str(min_val))
    
# print(' '.join(min_list))

#12 3
#1 5 2 3 6 2 3 7 3 5 2 6
        